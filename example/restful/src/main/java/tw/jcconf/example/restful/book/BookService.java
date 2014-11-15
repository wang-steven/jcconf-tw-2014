package tw.jcconf.example.restful.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class BookService {

	private List<Book> storage = new ArrayList<>();

	public List<Book> getAll() {
		return storage;
	}

	public Book getBookByIsbn(String isbn) {
		Optional<Book> result = storage.stream().filter(b -> b.getIsbn().equals(isbn)).findFirst();
		return result.orElse(new Book());
	}

	public Book save(Book book) {
		book.setId((long) (Math.random() * Integer.MAX_VALUE));
		storage.add(book);
		return book;
	}

	public Book update(Book book) {
		int index = storage.indexOf(book);
		if (index >= 0) {
			storage.set(index, book);
		} else {
			throw new RuntimeException("Cannot update book with id[" + book.getId() + "]");
		}
		return book;
	}

	public void delete(Long id) {
		storage.removeIf(b -> b.getId().equals(id));
	}

}
