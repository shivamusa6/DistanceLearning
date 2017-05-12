package controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;
import model.Model;

public class addfacServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int x=10001;
    public addfacServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	static String getUserval()
	{
		
		String userval="as"+(x++);
		return userval;
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post called");
		String email=request.getParameter("t1");
		//String userid=request.getParameter("t2");
		String dept=request.getParameter("t3");
		String designation=request.getParameter("t4");
		String salary=request.getParameter("t5");
			
		String sql="insert into facultydetails (email,dept,design,salary) values(?,?,?,?)";
			Model m=new Model();
			m.setemail(email);
			//m.setuserid(userid);
			m.setDept(dept);
			m.setDesignation(designation);
			m.setSalary(salary);
			
			System.out.println("added in model");
			boolean status=Dao.regisfacbyhod(m, sql);
			System.out.println("rs received");
			if(status)
			{
				System.out.println("status true");
				HttpSession session=request.getSession();
				session.setAttribute("email", email);
				//session.setAttribute("userid", userid);
				session.setAttribute("dept", dept);
				session.setAttribute("design", designation);
				session.setAttribute("salary", salary);
				
				
				getServletContext().getRequestDispatcher("/Sendmsgfaculty.jsp").forward(request, response);
			}
			else
			{
				String message="Please Try Again";
				request.setAttribute("msg", message);
				getServletContext().getRequestDispatcher("/contact.jsp").include(request, response);
			}
				
		}	
	}


