package tw.jcconf.example.mvc.m;

public class Model {

	private String name;

	public void setName(String name) {
		// business logic
		this.name = name;
	}

	// for view access
	public String getName() {
		return name;
	}
}
