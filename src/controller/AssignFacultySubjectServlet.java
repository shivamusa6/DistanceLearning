package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AssignFacultySubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String s1=request.getParameter("s1"); 
		String s2=request.getParameter("s2");
		String freq=request.getParameter("t1");
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://ec2-50-19-213-178.compute-1.amazonaws.com:3306/satya1989";
	String username="satyadb";
	String password="java";
	String sql="insert into assignfacultysub(subname,facname,frequency) values(?,?,?)";
	
	try {
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,username,password);
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, s1);
		ps.setString(2, s2);
		ps.setString(3, freq);
		int i=ps.executeUpdate();
		if(i!=0)
		{
			//System.out.println("value Inserted");
			getServletContext().getRequestDispatcher("/hodHome.jsp").forward(request, response);
		}
		else
		{
			//System.out.println("value not inserted");
			getServletContext().getRequestDispatcher("/AssignFacultySubject.jsp").forward(request, response);
		}
	} 
	catch (ClassNotFoundException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
