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

public class HODServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HODServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("ts1");
		String name=request.getParameter("ts2");
		String userid=request.getParameter("ts3");
		String address=request.getParameter("ts4");
		String dt1=request.getParameter("ds1");
		String dt2=request.getParameter("ds2");
		String dt3=request.getParameter("ds3");

		
		//int dt1=Integer.parseInt((String)request.getParameter("d1"));
		//int dt2=Integer.parseInt((String)request.getParameter("d2"));
		//int dt3=Integer.parseInt((String)request.getParameter("d3"));
		
		String date=dt1+"/"+dt2+"/"+dt3;
		System.out.println(date);
		//Date d=new Date(dt3-1900,dt2-1,dt1);
		String phone=request.getParameter("ts5");
		String sex=request.getParameter("rs");
		String password=request.getParameter("ts6");
		String password1=request.getParameter("ts7");
		String sques=request.getParameter("st1");
		String sans=request.getParameter("ts8");
		String dept=request.getParameter("ts9");
		String degree=request.getParameter("ts10");
		
		
				
		String sql="insert into hoddetails(email,name,userid,address,dob,phone,gender,password,squestion,sanswer,dept,degree) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		//String sql="insert into register1(fname,lname,contact,address,userid,password,gender,dob)values(?,?,?,?,?,?,?,?)";
		//String sql1="insert into userlogin(email,password)values(?,?)";
		if(email.equals("")||email==null||name.equals("")||name==null||userid.equals("")||userid==null||address.equals("")||address==null||date.equals("")||date==null||phone.equals("")||phone==null||sex.equals("")||sex==null||password.equals("")||password==null||password1.equals("")||password1==null||sques.equals("")||sques==null||sans.equals("")||sans==null||dept.equals("")||dept==null||degree.equals("")||degree==null)
		{
			String message="All Fields are mandatory";
			request.setAttribute("msg", message);
			getServletContext().getRequestDispatcher("/HODReg.jsp").include(request, response);
		}
		else if(!password.equals(password1))
		{
			String message="Please enter the same password";
			request.setAttribute("msg", message);
			getServletContext().getRequestDispatcher("/HODReg.jsp").include(request, response);
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
			m.setDept(dept);
			m.setDegree(degree);
			boolean status=Dao.HODregister(m, sql);
			System.out.println(status);
			if(status)
			{
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
				session.setAttribute("dept", dept);
				session.setAttribute("degree", degree);
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
