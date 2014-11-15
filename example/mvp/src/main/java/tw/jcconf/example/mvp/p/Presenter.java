package tw.jcconf.example.mvp.p;

import tw.jcconf.example.mvp.m.Model;
import tw.jcconf.example.mvp.v.View;

public class Presenter {

	private View view;
	private Model model;

	public Presenter(View view) {
		this.view = view;
		this.model = new Model();
		changeDisplay();
	}

	public void changeDisplay() {
		String name = view.getInput().getValue();

		// do some logic, eg: validate
		if (name.isEmpty()) {
			name = "Guest";
		}

		// call model
		model.setName(name);

		// control view
		view.setDisplay("Hello, " + model.getName());
		view.getInput().setValue(name);
	}
}
