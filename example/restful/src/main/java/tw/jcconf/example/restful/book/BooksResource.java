package tw.jcconf.example.restful.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BooksResource {

	@Autowired
	BookService service;

	@RequestMapping(consumes = "application/json", produces = "application/json", method = RequestMethod.GET)
	@ResponseBody
	public List<Book> getAll() {
		return service.getAll();
	}

	@RequestMapping(value = "/{isbn}", consumes = "application/json", produces = "application/json", method = RequestMethod.GET)
	@ResponseBody
	public Book getByIsbn(@PathVariable("isbn") String isbn) {
		return service.getBookByIsbn(isbn);
	}

	@RequestMapping(consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
	@ResponseBody
	public Book save(@RequestBody Book book) {
		return service.save(book);
	}

	@RequestMapping(consumes = "application/json", produces = "application/json", method = RequestMethod.PUT)
	@ResponseBody
	public Book update(@RequestBody Book book) {
		return service.update(book);
	}

	@RequestMapping(value = "/{id}", consumes = "application/json", produces = "application/json", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
}
