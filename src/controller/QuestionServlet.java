package controller;



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
import javax.servlet.http.HttpSession;

import model.Model;
import dao.Dao;

/**
 * Servlet implementation class questions
 */
public class QuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionServlet() {
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
			
			
		String question=request.getParameter("t1");
		String optn1=request.getParameter("t2");
		String optn2=request.getParameter("t3");
		String optn3=request.getParameter("t4");
		String optn4=request.getParameter("t5");
		String ans=request.getParameter("t6");
		String num="3";
		
		
				
		System.out.println("declared");
		String sql="insert into java2(sno,question,option1,option2,option3,option4,answer) values(?,?,?,?,?,?,?)";
		
		Model m=new Model();
		m.setQuestion(question);
		m.setOption1(optn1);
		m.setOption2(optn2);
		m.setOption3(optn3);
		m.setOption4(optn4);
		m.setAnswer(ans);
		System.out.println("added in model");
		boolean status=Dao.regisques(m, sql);
		System.out.println("rs received");
		if(status)
		{
			System.out.println("status true");
			getServletContext().getRequestDispatcher("/Enterques.jsp").forward(request, response);
		}
		else
		{
			String message="Please Try Again";
			request.setAttribute("msg", message);
			getServletContext().getRequestDispatcher("/contact.jsp").include(request, response);
		}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}