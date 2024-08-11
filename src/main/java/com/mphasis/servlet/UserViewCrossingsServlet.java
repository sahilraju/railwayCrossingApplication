package com.mphasis.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mphasis.BO.RailwayCrossingBO;
import com.mphasis.bean.RailwayCrossing;

@WebServlet("/userViewCross") 
public class UserViewCrossingsServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private RailwayCrossingBO railCrossBO;

	@Override 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("1111");
		railCrossBO = new RailwayCrossingBO();
		
		List<RailwayCrossing> crossings = railCrossBO.viewCrossings(); 
		
		req.setAttribute("crossingList", crossings); 
		Integer count = crossings.size();  
		req.setAttribute("count", count);    
	 
		req.getRequestDispatcher("userHome.jsp").forward(req, resp); 
	}

}
