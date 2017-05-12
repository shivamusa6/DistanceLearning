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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mail.PasswordMail;
/**
 * Servlet implementation class facmsgServlet
 */
public class facmsgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public facmsgServlet() {
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
	 */public static Connection connect()
	 {
		 String driver="com.mysql.jdbc.Driver";
			String url="jdbc:mysql://ec2-50-19-213-178.compute-1.amazonaws.com:3306/satya1989";
			String username="satyadb";
			String passwd="java";
			Connection con=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
			try
			{
				Class.forName(driver);
			 	con=DriverManager.getConnection(url, username, passwd);
			 	System.out.println("connected ");
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("CNFE occured");
				e.printStackTrace();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return con;
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("dopost facmsgServlet");
		long start = System.currentTimeMillis();
        System.out.printf("%tc",new Date());
        try 
        {
			Thread.sleep(5*60*10);
		 System.out.println(new Date( ) + "\n");
        long end = System.currentTimeMillis( );
        long diff = end - start;
        //System.out.println("Difference is : " + diff);
		if(diff>=1440000)
		{
			getServletContext().getRequestDispatcher("/timeout.jsp").forward(request, response);
		}
		
		
		
		
		
		PasswordMail mail=new PasswordMail();
	    PasswordGenerator pg=new PasswordGenerator();
	    String generatedPassword=pg.generatePassword();
		System.out.println("password generated");
		HttpSession session=request.getSession();
		session=request.getSession();
		String to=(String)session.getAttribute("email");
		//String email=(String)session.getAttribute("email");
		String dept=(String)session.getAttribute("dept");
		String design=(String)session.getAttribute("design");
		String salary=(String)session.getAttribute("salary");
		
		
		
		
		boolean status=mail.Sendmail(to,generatedPassword,dept,design,salary);
		System.out.println("value from sendmail: " +status);
				if(status)
				{
					Connection con=connect();
				
					String sql="update facultydetails set password=? where email=?";
					PreparedStatement st=con.prepareStatement(sql);
					//System.out.println("prepared");
					System.out.println(generatedPassword+"   "+to);
					st.setString(1,generatedPassword);
					st.setString(2,to);
								
				int i = st.executeUpdate();
				System.out.println("executeUpdate() called");
					if(i == 0)
						{
						getServletContext().getRequestDispatcher("/siteupdate.jsp").forward(request, response);		
						}
					else
					{
					request.setAttribute("email",to);	
					getServletContext().getRequestDispatcher("/out.jsp").forward(request, response);		
					}
				}
		
				else
				{
					request.setAttribute("message","User Id and answer were Wrong try again");
					getServletContext().getRequestDispatcher("/forgot.jsp").forward(request, response);
				}
			
			
			/////////////////////////////////////////////////
		
		
		}
		
		catch(Exception ex)
		{
		ex.printStackTrace();	
		}
		
		//////////////////////////////////////////////
		
	}
		
		
}

	
			