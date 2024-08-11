package com.mphasis.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mphasis.BO.UserLoginBO;
import com.mphasis.exception.BussinessException;

@WebServlet("/adminlog") 
public class AdminLoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private UserLoginBO userLoginBO;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        System.out.println("000000000");
		String email = request.getParameter("adminEmail");
		String password = request.getParameter("adminPassword");

		if (request.getParameter("log") != null) {

			try {

				userLoginBO = new UserLoginBO();
				boolean userExists = userLoginBO.findUser(email, password);

				if (userExists) {
					RequestDispatcher dispatcher = request.getRequestDispatcher("viewCross");
					dispatcher.forward(request, response);
				}

			} catch (BussinessException e) {
				request.setAttribute("errorMessage", e.getMessage());
				RequestDispatcher dispatcher = request.getRequestDispatcher("adminLogin.jsp"); 
				dispatcher.forward(request, response);
			}

		}

	}

}
