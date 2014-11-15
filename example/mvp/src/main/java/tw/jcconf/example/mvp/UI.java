package tw.jcconf.example.mvp;

import javax.servlet.annotation.WebServlet;

import tw.jcconf.example.mvp.v.View;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.VerticalLayout;

@Theme("mvp")
@SuppressWarnings("serial")
public class UI extends com.vaadin.ui.UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = UI.class)
	public static class Servlet extends VaadinServlet {}

	@Override
	public void init(VaadinRequest request) {
		VerticalLayout layout = new VerticalLayout();

		View view = new View();

		layout.addComponent(view);
		setContent(layout);
	}
}
