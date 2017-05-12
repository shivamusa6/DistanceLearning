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

public class FacupdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public FacupdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post called");
			
		HttpSession session=request.getSession();
		String email=(String) session.getAttribute("email");
		String pass=(String) session.getAttribute("password") ;
		System.out.println("Email: "+email);
		System.out.println("Password: "+pass);
		
		String name=request.getParameter("t1");
		String address=request.getParameter("t2");
		String date=request.getParameter("t3");
		String phone=request.getParameter("t4");
		String sex=request.getParameter("r");
		String password=request.getParameter("t5");
		String newpassword=request.getParameter("t6");
		String sques=request.getParameter("s1");
		String sans=request.getParameter("t8");
		String deg=request.getParameter("t9");
		
		String sql="update facultydetails set(name,address,dob,phone,gender,password,squestion,sanswer,degree)=(?,?,?,?,?,?,?,?,?) where email=?";
		//HttpSession session=request.getSession();
		//session.setAttribute("email", email);	
		/*if(email.equals("")||email==null||name.equals("")||name==null||address.equals("")||address==null||date.equals("")||date==null||phone.equals("")||phone==null||sex.equals("")||sex==null||sques.equals("")||sques==null||sans.equals("")||sans==null)
		{
			String message="All Fields are mandatory";
			request.setAttribute("msg", message);
			getServletContext().getRequestDispatcher("/reg_form.jsp").include(request, response);
		}
		else
		{*/
			Model m=new Model();
			m.setemail(email);
			m.setname(name);
			m.setAddress(address);
			m.setphone(phone);
			m.setdob(date);
			m.setsex(sex);
			m.setPassword(newpassword);
			m.setsquestion(sques);
			m.setsanswer(sans);
			m.setDegree(deg);
			System.out.println("added in model");
			boolean status=Dao.facupdate(m, sql);
			System.out.println("rs received");
			if(pass.equals(password))
			{
				if(status)
				{
					System.out.println("rs received2");
					System.out.println("status true");
					
					session.setAttribute("name", name);
					//session.setAttribute("userid", userid);
					session.setAttribute("address", address);
					session.setAttribute("phone", phone);
					session.setAttribute("sex", sex);
					session.setAttribute("password", password);
					session.setAttribute("sques", sques);
					session.setAttribute("sans", sans);
					session.setAttribute("date",date);
					session.setAttribute("deg", deg);
					String message="Registration Successfull";
					request.setAttribute("msg", message);
					getServletContext().getRequestDispatcher("/facultyHome.jsp").forward(request, response);
				}
				else
				{
					System.out.println("rs received3");
					String message="Please Try Again";
					request.setAttribute("msg", message);
					getServletContext().getRequestDispatcher("/contact.jsp").include(request, response);
				}
			}
			else
			{
				String message="Please Enter Password Correctly";
				request.setAttribute("msg", message);
				getServletContext().getRequestDispatcher("/FacultyUpdate.jsp").include(request, response);

			}
		}	
	}

