package tw.jcconf.example.mvp.v;

import tw.jcconf.example.mvp.p.Presenter;

import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

@SuppressWarnings("serial")
public class View extends CustomComponent {

	private Label display = new Label("");
	private TextField name = new TextField("My name is ");
	private Button button = new Button("Submit");

	private Presenter presenter;

	public View() {
		// initial layout and presenter
		initialLayout();
		presenter = new Presenter(this);
	}

	protected void initialLayout() {
		CustomLayout layout = new CustomLayout("view");
		layout.addComponent(display, "display");
		layout.addComponent(name, "name");
		button.addClickListener((event) -> presenter.changeDisplay());
		layout.addComponent(button, "submit");
		setCompositionRoot(layout);
	}

	// view provide getters & setters
	public TextField getInput() {
		return name;
	}

	public void setDisplay(String value) {
		display.setValue(value);
	}

}
