package com.mphasis.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mphasis.BO.UserRegisterBO;
import com.mphasis.exception.BussinessException; 

@WebServlet("/reg")
public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserRegisterBO userRegBO;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if (request.getParameter("reg") != null) {

			try {
				userRegBO = new UserRegisterBO();
				userRegBO.addUser(name, email, password);

				RequestDispatcher dispatcher = request.getRequestDispatcher("userHome.jsp");
				dispatcher.forward(request, response);

			} catch (BussinessException e) {

				request.setAttribute("errorMessage", e.getMessage());
				RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
				dispatcher.forward(request, response);

			}

		}

	}

}