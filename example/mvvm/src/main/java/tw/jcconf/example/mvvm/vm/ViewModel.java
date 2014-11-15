package tw.jcconf.example.mvvm.vm;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

import tw.jcconf.example.mvvm.m.Model;

public class ViewModel {

	private String name;
	private Model model;

	public ViewModel() {
		model = new Model();
		model.setName(name = "Guest");
	}

	// event handler
	@Command
	@NotifyChange("model")
	public void changeName() throws Exception {
		model.setName(name);
	}

	// ViewModel provider getter & setter

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Model getModel() {
		return model;
	}
}
