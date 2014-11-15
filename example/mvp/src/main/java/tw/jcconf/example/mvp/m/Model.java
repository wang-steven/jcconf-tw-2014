package tw.jcconf.example.mvp.m;

public class Model {

	private String name;

	public void setName(String name) {
		// business logic
		this.name = name;
	}

	// for presenter access
	public String getName() {
		return name;
	}
}
