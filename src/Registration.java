import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
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
			
		String email=request.getParameter("t1");
		String name=request.getParameter("t2");
		String userid=request.getParameter("t3");
		String address=request.getParameter("t4");
		
		int dt1=Integer.parseInt((String)request.getParameter("d1"));
		int dt2=Integer.parseInt((String)request.getParameter("d2"));
		int dt3=Integer.parseInt((String)request.getParameter("d3"));
		
		
		//String date=request.getParameter("date");
		Date d=new Date(dt3-1900,dt2-1,dt1);
		String phone=request.getParameter("t5");
		String sex=request.getParameter("r");
		String password=request.getParameter("t6");
		String type1=request.getParameter("ty");
		
		System.out.println("declared");
		String sql="insert into userdetails values(?,?,?,?,?,?,?,?,?)";
		
		System.out.println("executed");
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.println("123");
		ps.setString(1, email);
		ps.setString(2, name);
		ps.setString(3, userid);
		ps.setString(4, address);
		ps.setDate(5, d);
		ps.setString(6, phone);
		ps.setString(7, sex);
		ps.setString(8, password);
		ps.setString(9, type1);
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
