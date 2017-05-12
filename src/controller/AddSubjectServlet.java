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

public class AddSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int x=123;
    public AddSubjectServlet() {
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
		String subname=request.getParameter("t1");
		String subcde=request.getParameter("t2");
		//String userid=RegistrationServlet.getUserval();
		String startdate=request.getParameter("strtdt");
		String enddate=request.getParameter("enddt");
		//String dt1=request.getParameter("d1");
		//String dt2=request.getParameter("d2");
		//String dt3=request.getParameter("d3");
		String durtn=request.getParameter("t3");

		String fees=request.getParameter("t4");
		String eligX=request.getParameter("t5");
		String eligXII=request.getParameter("t6");
		String passmrk=request.getParameter("t7");
		//int dt1=Integer.parseInt((String)request.getParameter("d1"));
		//int dt2=Integer.parseInt((String)request.getParameter("d2"));
		//int dt3=Integer.parseInt((String)request.getParameter("d3"));
		
		//String date=request.getParameter("dob");
		//System.out.println("date: "+date);
		//System.out.println(date);
		//Date d=new Date(dt3-1900,dt2-1,dt1);
		
				
		String sql="insert into subjectdetails(subname,code,startdt,enddt,duration,fees,marks1,marks2,passmarks) values(?,?,?,?,?,?,?,?,?)";
		
		if(subname.equals("")||subname==null||subcde.equals("")||subcde==null||startdate.equals("")||startdate==null||enddate.equals("")||enddate==null||durtn.equals("")||durtn==null||fees.equals("")||fees==null||eligX.equals("")||eligX==null||eligXII.equals("")||eligXII==null||passmrk.equals("")||passmrk==null)
		{
			String message="All Fields are mandatory";
			request.setAttribute("msg", message);
			getServletContext().getRequestDispatcher("/AddSubject.jsp").include(request, response);
		}
		else
		{
			Model m=new Model();
			m.setSubname(subname);
			m.setSubcde(subcde);
			m.setStrtdte(startdate);
			m.setEnddte(enddate);
			m.setDurtn(durtn);
			m.setFees(fees);
			m.setEligX(eligX);
			m.setEligXII(eligXII);
			m.setPassmrk(passmrk);
			System.out.println("added in model");
			boolean status=Dao.addsubject(m, sql);
			System.out.println("rs received");
			if(status)
			{
				System.out.println("status true");
				HttpSession session=request.getSession();
				//session.setAttribute("email", email);
				session.setAttribute("subname", subname);
				session.setAttribute("subcde", subcde);
				session.setAttribute("startdate", startdate);
				session.setAttribute("enddate", enddate);
				session.setAttribute("durtn", durtn);
				session.setAttribute("fees", fees);
				session.setAttribute("eligX", eligX);
				session.setAttribute("eligXII", eligXII);
				session.setAttribute("passmrk", passmrk);
				getServletContext().getRequestDispatcher("/hodHome.jsp").forward(request, response);
			}
			else
			{
				String message="Please Try Again";
				request.setAttribute("msg", message);
				getServletContext().getRequestDispatcher("/AddSubject.jsp").include(request, response);
			}
				
		}	
	}

}
