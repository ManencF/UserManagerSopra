package com.manenc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/users")
public class UserManagementActions extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private static String URL_VIEW_PAGE = "/WEB-INF/users.jsp";
       

    public UserManagementActions() 
    {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		this.getServletContext().getRequestDispatcher(URL_VIEW_PAGE).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		doGet(request, response);
	}

}
