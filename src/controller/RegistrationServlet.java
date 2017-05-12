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

public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int x=12345;
    public RegistrationServlet() {
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
		//String userid=request.getParameter("t3");
		String userid=RegistrationServlet.getUserval();
		String address=request.getParameter("t4");
		//String dt1=request.getParameter("d1");
		//String dt2=request.getParameter("d2");
		//String dt3=request.getParameter("d3");

		
		
		//int dt1=Integer.parseInt((String)request.getParameter("d1"));
		//int dt2=Integer.parseInt((String)request.getParameter("d2"));
		//int dt3=Integer.parseInt((String)request.getParameter("d3"));
		
		String date=request.getParameter("dob");
		System.out.println("date: "+date);
		//System.out.println(date);
		//Date d=new Date(dt3-1900,dt2-1,dt1);
		String phone=request.getParameter("t5");
		String sex=request.getParameter("r");
		String password=request.getParameter("t6");
		String password1=request.getParameter("t7");
		String sques=request.getParameter("s1");
		String sans=request.getParameter("t8");
		
				
		String sql="insert into userdetails(email,name,userid,address,dob,phone,sex,password,squestion,sanswer) values(?,?,?,?,?,?,?,?,?,?)";
		//String sql="insert into register1(fname,lname,contact,address,userid,password,gender,dob)values(?,?,?,?,?,?,?,?)";
		//String sql1="insert into login(email,password)values(?,?)";
		if(email.equals("")||email==null||name.equals("")||name==null||address.equals("")||address==null||date.equals("")||date==null||phone.equals("")||phone==null||sex.equals("")||sex==null||password.equals("")||password==null||password1.equals("")||password1==null||sques.equals("")||sques==null||sans.equals("")||sans==null)
		{
			String message="All Fields are mandatory";
			request.setAttribute("msg", message);
			getServletContext().getRequestDispatcher("/reg_form.jsp").include(request, response);
		}
		else if(!password.equals(password1))
		{
			String message="Please enter the same password";
			request.setAttribute("msg", message);
			getServletContext().getRequestDispatcher("/reg_form.jsp").include(request, response);
		}
		else
		{
			Model m=new Model();
			m.setemail(email);
			m.setname(name);
			m.setuserid(userid);
			m.setAddress(address);
			m.setphone(phone);
			m.setdob(date);
			m.setsex(sex);
			m.setPassword(password);
			m.setsquestion(sques);
			m.setsanswer(sans);
			System.out.println("added in model");
			boolean status=Dao.register(m,sql);
			System.out.println("rs received");
			if(status)
			{
				System.out.println("status true");
				HttpSession session=request.getSession();
				session.setAttribute("email", email);
				session.setAttribute("name", name);
				session.setAttribute("userid", userid);
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
