package tw.jcconf.example.mvc.c;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.jcconf.example.mvc.m.Model;

@SuppressWarnings("serial")
@WebServlet(value = "/controller")
public class Controller extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// accepting request
		String name = req.getParameter("name");

		// validate request
		if (name.isEmpty()) {
			name = "Guest";
		}

		// use Model to do business logic
		Model model = new Model();
		model.setName(name);

		// binding model to view
		req.setAttribute("model", model);
		// forward to view
		req.getRequestDispatcher("/v/view.jsp").forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// accepting request

		// use Model to do business logic
		Model model = new Model();
		model.setName("Guest");

		// binding model to view
		req.setAttribute("model", model);
		// forward to view
		req.getRequestDispatcher("/v/view.jsp").forward(req, resp);
	}

}
