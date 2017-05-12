package controller;
import java.text.SimpleDateFormat; 
import java.util.*;

import helper.PasswordGenerator;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mail.PasswordMail;
import dao.Dao;
import model.Model;
/**
 * Servlet implementation class ForgetPasswordServlet
 */
//@WebServlet("/ForgetPasswordServlet")
public class ForgotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("forgot servlet");
		String email=request.getParameter("userid");
		String question =request.getParameter("s1");
		String answer=request.getParameter("answer");
	
		String to=email;
		
		System.out.println("userid: "+email+" question: "+question+" answer: "+answer);

		long start = System.currentTimeMillis();
        System.out.printf("%tc",new Date());
        try 
        {
			Thread.sleep(5*60*10);
		} 
        catch (InterruptedException e) 
		{	
			e.printStackTrace();
		}
        System.out.println(new Date( ) + "\n");
        long end = System.currentTimeMillis( );
        long diff = end - start;
        
		if(diff>=1440000)
		{
			getServletContext().getRequestDispatcher("/timeout.jsp").forward(request, response);
		}
		
		//String driver="com.ibm.db2.jcc.DB2Driver";
		//String url="jdbc:db2://localhost:50000/employee";
		//String username="udayan";
		//String passwd="us";
		//Connection con=null;
		//PreparedStatement ps=null;
		//ResultSet rs=null;
		String sql="select email,squestion,sanswer,password from userdetails where email =? and squestion=? and sanswer=?";
		try
		{
		//Dao.connect();
		System.out.println("connected in forgotPassword Servlet");
		
		Model m=new Model();
		m.setemail(email);
		m.setsquestion(question);
		m.setsanswer(answer);
		
		ResultSet rs=Dao.forget(m,sql);
		//System.out.println("Status: "+status);
		/*ps=con.prepareStatement(sql);
		ps.setString(1,userid);
		ps.setString(2, question);
		ps.setString(3, answer);
		rs=ps.executeQuery();
		*/
		HttpSession session=request.getSession();
		session.setAttribute("userid", email);

		System.out.println("Email: "+email);
		System.out.println("rs available in Forgotpassword");
		if(rs.next())
		{
		////////////////////////////////////////////////////
			System.out.println("inside if(rs)");
			PrintWriter out=response.getWriter();
			System.out.println(new Date());
			
			PasswordMail mail=new PasswordMail();
		    PasswordGenerator pg=new PasswordGenerator();
		    String generatedPassword=pg.generatePassword();
			System.out.println("password generated");
		
	
			to=email;
			boolean status=mail.Sendmail(to,generatedPassword);
			if(status)
			{
					//System.out.println(userid+question+answer);
				String sql2="update userdetails set password='"+ generatedPassword+"' where email='"+email+"'";			
				Connection con=Dao.connect();
				PreparedStatement st=con.prepareStatement(sql2);
				//PreparedStatement st1=con.prepareStatement(sql2);
				int i = st.executeUpdate();
				//int j = st1.executeUpdate();
				
				if(i == 0)
				{
					getServletContext().getRequestDispatcher("/siteupdate.jsp").forward(request, response);		
				}
						
				else
				{
					request.setAttribute("userid",email);	
					getServletContext().getRequestDispatcher("/out1.jsp").forward(request, response);		
				}
			}
		}
				else
				{
					request.setAttribute("msg","User Id and answer were Wrong try again");
					getServletContext().getRequestDispatcher("/forgot.jsp").forward(request, response);
				}
					
		}
		
		catch(Exception ex)
		{
		ex.printStackTrace();	
		}
		
		//////////////////////////////////////////////
		
	}

}
