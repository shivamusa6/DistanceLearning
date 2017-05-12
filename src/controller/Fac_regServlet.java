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

public class Fac_regServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int x=10001;
    public Fac_regServlet() {
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
		String name=request.getParameter("t2");
		String address=request.getParameter("t4");
		String date=request.getParameter("dob");
		String phone=request.getParameter("t5");
		String sex=request.getParameter("r");
		String password=request.getParameter("t6");
		String password1=request.getParameter("t7");
		String sques=request.getParameter("s1");
		String sans=request.getParameter("t8");
		String degree=request.getParameter("t9");
		
				
		String sql="insert into facultydetails (email,name,address,dob,phone,sex,password,squestion,sanswer,degree) values(?,?,?,?,?,?,?,?,?,?)";
		if(email.equals("")||email==null||name.equals("")||name==null||address.equals("")||address==null||date.equals("")||date==null||phone.equals("")||phone==null||sex.equals("")||sex==null||password.equals("")||password==null||password1.equals("")||password1==null||sques.equals("")||sques==null||sans.equals("")||sans==null||degree.equals("")||degree==null)
		{
			String message="All Fields are mandatory";
			request.setAttribute("msg", message);
			getServletContext().getRequestDispatcher("/fac_reg.jsp").include(request, response);
		}
		else if(!password.equals(password1))
		{
			String message="Please enter the same password";
			request.setAttribute("msg", message);
			getServletContext().getRequestDispatcher("/fac_reg.jsp").include(request, response);
		}
		else
		{
			Model m=new Model();
			m.setemail(email);
			m.setname(name);
			m.setAddress(address);
			m.setphone(phone);
			m.setdob(date);
			m.setsex(sex);
			m.setPassword(password);
			m.setsquestion(sques);
			m.setsanswer(sans);
			m.setDegree(degree);
			System.out.println("added in model");
			boolean status=Dao.registerfac(m,sql);
			System.out.println("rs received");
			if(status)
			{
				System.out.println("status true");
				HttpSession session=request.getSession();
				session.setAttribute("email", email);
				session.setAttribute("name", name);
				session.setAttribute("address", address);
				session.setAttribute("phone", phone);
				session.setAttribute("sex", sex);
				session.setAttribute("password", password);
				session.setAttribute("sques", sques);
				session.setAttribute("sans", sans);
				session.setAttribute("date",date);
				getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			}
			else
			{
				String message="Please Try Again";
				request.setAttribute("msg", message);
				getServletContext().getRequestDispatcher("/contact.jsp").include(request, response);
			}
				
		}	
	}

}
