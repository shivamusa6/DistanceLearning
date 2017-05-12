

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class questions
 */
public class questions extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public questions() {
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
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://ec2-50-19-213-178.compute-1.amazonaws.com:3306/satya1989","satyadb","java");
			//Connection con=DriverManager.getConnection("jdbc:db2://172.16.3.13:50000/tathagat","WTLAB","1234");
			System.out.println("database connected");
			
		String question=request.getParameter("t1");
		String optn1=request.getParameter("t2");
		String optn2=request.getParameter("t3");
		String optn3=request.getParameter("t4");
		String optn4=request.getParameter("t5");
		String ans=request.getParameter("t6");
		String num="3";
		
		
				
		System.out.println("declared");
		String sql="insert into java1 values(?,?,?,?,?,?,?)";
		
		System.out.println("executed");
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.println("123");
		ps.setString(1, num);
		ps.setString(2, question);
		ps.setString(3, optn1);
		ps.setString(4, optn2);
		ps.setString(5, optn3);
		ps.setString(6,optn4);
		ps.setString(7, ans);
		
		ps.executeUpdate();
		System.out.println("inserted");
		response.sendRedirect("Success.jsp");
		//PrintWriter out=response.getWriter();
		
		//out.print("User value inserted Successfully: &nbsp &nbsp"+name);
		/*if(username.equals(s1)&&password.equals(s2))
		{
			
			response.sendRedirect("Success.html");
		}*/
		
		
		} catch (SQLException e) {
			System.out.println("SQL exception occured");
			e.printStackTrace();
		}
		 catch (ClassNotFoundException e1) {
				System.out.println("Class not Found");
				e1.printStackTrace();
			}
	}

}
