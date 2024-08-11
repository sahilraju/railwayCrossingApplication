package com.mphasis.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mphasis.BO.RailwayCrossingBO;
import com.mphasis.bean.RailwayCrossing;
import com.mphasis.exception.BussinessException;

@WebServlet("/searchCross")
public class SearchCrossingServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private RailwayCrossingBO railCrossBO;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String crossingName = req.getParameter("name");

		if (req.getParameter("search") != null) {

			railCrossBO = new RailwayCrossingBO();
			RequestDispatcher dispatcher = req.getRequestDispatcher("searchCrossing.jsp");
			try {

				RailwayCrossing crossing = railCrossBO.searchCrossing(crossingName);
				req.setAttribute("crossing", crossing);
				dispatcher.forward(req, resp);

			} catch (BussinessException e) {

				req.setAttribute("message", e.getMessage());
				dispatcher.forward(req, resp);

			}

		}

	}

}
