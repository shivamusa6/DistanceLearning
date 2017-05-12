package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import model.Model;
import dao.Dao;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdatePassServ extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	  private String driver="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://ec2-50-19-213-178.compute-1.amazonaws.com:3306/satya1989";
    private String username="satyadb";
    private String password="java";
    private Connection con=null;
    
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   	{
   		
   		String curpass=request.getParameter("curpass");
   		String newpass=request.getParameter("newpass");
   		String renewpass=request.getParameter("renewpass");
   		//String password1=request.getParameter("RePassword");
   		
	HttpSession session=request.getSession();
	
	String uid=(String)session.getAttribute("userid");
	System.out.println("userid: "+uid);
	
	
	//System.out.println("sql= "+sql );
	
	
	try
	{
		String pass = null;
		Class.forName(driver);
		con=DriverManager.getConnection(url, username, password);
		PreparedStatement ps1=con.prepareStatement("select password from userdetails where email=?");
		ps1.setString(1, uid);
		ResultSet rs=ps1.executeQuery();
		
		if(rs.next())
		{
			for(int i=1;i<=1;i++)
			{
				pass=rs.getString(i);
			}
		}
		System.out.println("pass: "+pass);
		if(curpass.equals("")||curpass==null||newpass.equals("")||newpass==null||renewpass.equals("")||renewpass==null)
		{
			String message="Enter All Fields";
			request.setAttribute("msg", message);
			getServletContext().getRequestDispatcher("/updatePass.jsp").include(request, response);
		}
		
		
		else if(!curpass.equals(pass))
		{
			String message="Current Password is Wrong";
			request.setAttribute("msg", message);
			getServletContext().getRequestDispatcher("/updatePass.jsp").include(request, response);
		}
		
		
		else if(!newpass.equals(renewpass))
		{
			String message="Password Not Matched";
			request.setAttribute("msg", message);
			getServletContext().getRequestDispatcher("/updatePass.jsp").include(request, response);
		}
		else
		{
				//Class.forName(driver);
				//con=DriverManager.getConnection(url, username, password);
			String sql="update userdetails set password=? where email=?";
		    //String sql1="update login set password=? where userid=?";
		    
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, newpass);
				ps.setString(2, uid);
				int i=ps.executeUpdate();
				System.out.println("newpass: "+newpass);
				//PreparedStatement ps2=con.prepareStatement(sql1);
				//ps2.setString(1, newpass);
				//.setString(2, uid);
				int j=ps.executeUpdate();
				System.out.println("i= "+i+"j= "+j);
				if(i!=0)
				{
				session.setAttribute("password", newpass);
				session.setAttribute("email", uid);
				getServletContext().getRequestDispatcher("/SuccessPass.jsp").forward(request, response);
				}
				else
				{
					String message="Please Try Again";
					request.setAttribute("msg", message);
					getServletContext().getRequestDispatcher("/updatePass.jsp").include(request, response);
				}
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
  }

