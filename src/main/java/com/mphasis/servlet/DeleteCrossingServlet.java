package com.mphasis.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mphasis.BO.RailwayCrossingBO;
import com.mphasis.exception.BussinessException;

@WebServlet("/deleteCross")
public class DeleteCrossingServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private RailwayCrossingBO railCrossBO;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String crossingName = req.getParameter("name");

		if (req.getParameter("delete") != null) {

			railCrossBO = new RailwayCrossingBO();
			RequestDispatcher dispatcher = req.getRequestDispatcher("deleteCrossing.jsp");
			try {

				railCrossBO.deleteCrossing(crossingName);
				req.setAttribute("message", "Crossing Deleted Successfully");
				dispatcher.forward(req, resp);

			} catch (BussinessException e) {

				req.setAttribute("message", e.getMessage());
				dispatcher.forward(req, resp);

			}

		}

	}

}
