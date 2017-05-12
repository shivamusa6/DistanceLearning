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

public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public updateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post called");
		String email=request.getParameter("t1");
		//System.out.println(email);
		String name=request.getParameter("t2");
		String userid=request.getParameter("t3");
		String address=request.getParameter("t4");
		String date=request.getParameter("t9");
		String phone=request.getParameter("t5");
		String sex=request.getParameter("r");
		String password=request.getParameter("t7");
		String sques=request.getParameter("s1");
		String sans=request.getParameter("t8");
		
		
		String sql="update userdetails set(name,address,phone,sex,password,squestion,sanswer)=(?,?,?,?,?,?,?) where email=?";
		HttpSession session=request.getSession();
		session.setAttribute("email", email);	
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
			m.setPassword(password);
			m.setsquestion(sques);
			m.setsanswer(sans);
			System.out.println("added in model");
			boolean status=Dao.update(m, sql);
			System.out.println("rs received");
			if(status)
			{
				System.out.println("rs received2");
				System.out.println("status true");
				
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
				System.out.println("rs received3");
				String message="Please Try Again";
				request.setAttribute("msg", message);
				getServletContext().getRequestDispatcher("/contact.jsp").include(request, response);
			}
				
		}	
	}

