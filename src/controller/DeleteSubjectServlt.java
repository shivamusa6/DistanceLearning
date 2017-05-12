package controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;
import model.Model;

public class DeleteSubjectServlt extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeleteSubjectServlt() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String subcde=request.getParameter("t1");
		
		
		String sql="delete from subjectdetails where code=?";
		//String sql="insert into register1(fname,lname,contact,address,userid,password,gender,dob)values(?,?,?,?,?,?,?,?)";
		//String sql1="insert into userlogin(email,password)values(?,?)";
		if(subcde.equals("")||subcde==null)
		{
			String message="All Fields are mandatory";
			request.setAttribute("msg", message);
			getServletContext().getRequestDispatcher("/DeleteSubject.jsp").include(request, response);
		}
		
		else
		{
			Model m=new Model();
			m.setSubcde(subcde);
			//m.setsal(salary);
			boolean status=Dao.DeleteSubject(m, sql);
			if(status)
			{
				HttpSession session = request.getSession();
				
				//session.setAttribute("email", email);
				
				session.setAttribute("subcde",subcde);
				
				getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			}
			else
			{
				String message="Please Try Again";
				request.setAttribute("msg", message);
				getServletContext().getRequestDispatcher("/index.jsp").include(request, response);
			}
				
		}	
	}

}
