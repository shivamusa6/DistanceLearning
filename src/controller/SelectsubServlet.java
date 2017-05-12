package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SelectsubServlet
 */
public class SelectsubServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectsubServlet() {
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
		// TODO Auto-generated method stub
		String sub=request.getParameter("s1");
		System.out.print(sub);
		if(!sub.equals("")||sub==null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("sub", sub);
			System.out.println(sub);
			getServletContext().getRequestDispatcher("/Showques.jsp").forward(request, response);
		}
		else
		{
			getServletContext().getRequestDispatcher("/SelectSuject.jsp").forward(request, response);
		}
		
		
	}

}
