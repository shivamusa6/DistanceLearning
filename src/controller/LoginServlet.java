package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;

import model.Model;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("log1");
		String passwrd=request.getParameter("pass1");
		String rad=request.getParameter("rad");
		String sql="";
		int x;
		if(rad.equalsIgnoreCase("user"))
		{
			sql="select * from userdetails where email=? and password=?";
			x=0;
		}
		else if(rad.equalsIgnoreCase("faculty"))
		{
			sql="select * from facultydetails where email=? and password=?";
			x=1;
		}
		else
		{
			sql="select * from hoddetails where email=? and password=?";
			x=2;
		}
		
		
		
		if(email.equals("")||email==null||passwrd.equals("")||passwrd==null)
		{
			String message="Userid or password cannot be empty";
			request.setAttribute("msg", message);
			getServletContext().getRequestDispatcher("/index.jsp").include(request, response);
		}
		else
		{
			
			try
			{
				System.out.println(sql);
			Model m=new Model();
			m.setemail(email);;
			m.setPassword(passwrd);
			ResultSet rs =Dao.validate(m,sql);
			if(rs.next())
			{
				HttpSession session=request.getSession();
				session.setAttribute("email", email);
				session.setAttribute("password", passwrd);
				//sssession.setMaxInactiveInterval(300);
				if(x==0)
				getServletContext().getRequestDispatcher("/userHome.jsp").include(request, response);
				else if(x==1)
					getServletContext().getRequestDispatcher("/facultyHome.jsp").include(request, response);
				else
					getServletContext().getRequestDispatcher("/hodHome.jsp").include(request, response);
			}
			else
			{
				String message="Please enter the valid userid or password";
				request.setAttribute("msg", message);
				getServletContext().getRequestDispatcher("/index.jsp").include(request, response);
			}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
		}
	}

}
