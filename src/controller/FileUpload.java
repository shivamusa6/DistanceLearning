package controller;


import java.io.BufferedInputStream ;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class FileUpload
 */
//@WebServlet("/FileUpload")
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileUpload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//HttpSession session = request.getSession(true);
		   
		
		String path = request.getParameter("path1");
		ServletOutputStream out = response.getOutputStream();
		File myfile = new File(path);
		response.setContentType("file/pdf");
		BufferedInputStream bis = null;
		int byteReads = 0;
		bis = new BufferedInputStream(new FileInputStream(myfile));
		//bos = new BufferedOutputStream(out);
		while ((byteReads = bis.read()) != -1) {
			out.write(byteReads);
			
		}
		bis.close();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String emp_name="";         
        String emp_c_number="";
        String emp_emailid="";
        String address1="";
        String address2="";
        String path="";
       boolean isMultipart = ServletFileUpload.isMultipartContent(request);
       if(!isMultipart){
    	   
       }else{
    	   FileItemFactory factory = new DiskFileItemFactory();
    	   ServletFileUpload fileUpload = new ServletFileUpload(factory);
    	   List list = null;
    	   try {
			list = fileUpload.parseRequest(request);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				FileItem item = (FileItem) iterator.next();
				if (item.isFormField())
		           {
		              String name = item.getFieldName();
		                  String value = item.getString();
		                  if(name.equals("emp_name"))
		                   {
		                           emp_name=value;
		                    }
		                    if(name.equals("address1"))
		                    {  
		                         address1=value;                         
		                    }
		                    if(name.equals("address2"))
		                    {  
		                         address2=value;                         
		                    }
		                    if(name.equals("contact_number"))
		                    {
		                         emp_c_number=value;
		                    }
		                    if(name.equals("email_id"))
		                    {
		                      emp_emailid=value;
		                    }          
		                              
		              }else{
		            	  String itemName = item.getName();
		            	  //path = "E:/FILEUPLOAD/"+itemName;
		            	  path = getServletContext().getRealPath("/")+"images/"+itemName;
		            	 
		            	// System.out.println(path);
		            	  
		            	  HttpSession session = request.getSession();
		            	  File savedFile = new File(path);
		            	   item.write(savedFile);
		            	   String path1  =getServletContext().getRealPath("/")+"images/";
		            	  session.setAttribute("allimgs",FileHelper.GetAllFiles(path1));
		            	  //session.setAttribute("path1", path1);
		            	  
		      
		              }
				
			}
			response.sendRedirect("index.jsp");
			
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   
       }

	}

}
