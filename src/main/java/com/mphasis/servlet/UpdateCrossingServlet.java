package com.mphasis.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mphasis.BO.RailwayCrossingBO;

@WebServlet("/updateCross")
public class UpdateCrossingServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private RailwayCrossingBO railCrossBO;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String crossingName = req.getParameter("name");
		String status = req.getParameter("status");
		String personInCharge = req.getParameter("pCharge");
		String schedule = req.getParameter("schedule");
		String landmark = req.getParameter("landmark");
		String address = req.getParameter("address");
		

		if (req.getParameter("submit") != null) {

			railCrossBO = new RailwayCrossingBO();
			railCrossBO.updateCrossing(crossingName, status, personInCharge, schedule, landmark, address); 
			
			req.setAttribute("message", "Crossing Updated Successfully");
			req.getRequestDispatcher("addCrossing.jsp").forward(req, resp); 
 
		}

		
	}

}
