<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript">
function myAlert()
{
    alert("For More Info,You please Log In or Register");
}
</script>
  <title>Your Company</title>
  <script
type="text/javascript" language="javascript">    
javascript:window.history.forward(1);
</script>
  <meta name="description" content="">
  <meta name="keywords" content="">
  <meta http-equiv="Content-Type"
 content="text/html; charset=iso-8859-1">
  <link href="css/style1.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="page-out">
<div class="page-in">
<div class="page">
<div class="main">
<div class="header">
<div class="header-top">
<h1>Distant Learning</h1>
</div>
<div class="header-bottom">
<h2>�Time to study no time to waste,
<br />I the great man must gain every second of the day.� </h2>
</div>
<div class="topmenu">
<ul>
  <li
 style="background: transparent none repeat scroll 0% 50%; -moz-background-clip: initial; -moz-background-origin: initial; -moz-background-inline-policy: initial; padding-left: 0px;"><a
 href="index.jsp"><span>Home</span></a></li>
  <li><a href="#"><span>About&nbsp;us</span></a></li>
  <li><a href="#"><span>What's&nbsp;new</span></a></li>
  <li><a href="#"><span>Services</span></a></li>
  <li><a href="#"><span>Contact</span></a></li>
  <li><a href="ac.html"><span>Resources</span></a></li>
  <li><a href="Logoutpage.jsp"><span>Logout</span></a></li>
</ul>
</div>
</div>
<div class="content">
<div class="content-left">
<div class="row1">
<h1 class="title"> Welcome To <span>Our Site</span></h1>
<p>&nbsp;</p>
<p><h2>Assign Faculty To a subject
<br/>

<p>&nbsp;</p>
<p>&nbsp;</p>



<%
     try
    {
     
    String sql1="select subname from subjectdetails";
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://ec2-50-19-213-178.compute-1.amazonaws.com:3306/satya1989","satyadb","java");
    System.out.println("Connected");
    PreparedStatement ps=con.prepareStatement(sql1);
      ResultSet rs=ps.executeQuery();
     System.out.println("executeUpdate");
          %>
<form action="AssignFacultySubjectServlet" method="post">
    
        <table>
        <tr>
        <td>
        <select name="s1">
        <%  while(rs.next()){ %>
            <option><%= rs.getString(1)%></option>
        <% } %>
        </select>
        </td>
       
        <%
        String sql="select name from facultydetails";
        System.out.println("Connected again");
    PreparedStatement ps1=con.prepareStatement(sql);
      ResultSet rs1=ps1.executeQuery();
     System.out.println("executeUpdate again"); %>
        
        <td>
        <select name="s2">
        <%  while(rs1.next()){ %>
            <option><%= rs1.getString(1)%></option>
        <% } %>
        </select>
        </td>
         </tr>
         <tr>
         <td><h6>Upload frequency</h6></td>
         <td><input type="text" name="t1"></input></td>
         </tr>
         <tr><td><input type="submit" value="ASSIGN"/></td></tr>
       </table>
       
</form>
<%
        }
        catch(Exception e)
        {
             out.println("wrong entry\n"+e);
        }
%>












</h2></p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p><br>
  <br>
</p>
</div>
<div class="row2">
<h2 class="subtitle">About <span>Us</span></h2>
<p><strong>Lorem Ipsum is simply dummy text</strong> of the printing
and typesetting industry. Lorem Ipsum has been the aaaa industry's
standard dummy text ever since the 1500s, ass as dwhen an unknasdown
printer took a galley of type and scrambled it to make a type
speascimen book. <br>
It has survived not only five centuries, but also the leap into
electronic typesetting.and scrambled it to make a type speascimen book.</p>
<p>&nbsp;</p>
<p><strong>Lorem Ipsum is simply dummy text</strong> of the printing
and typesetting industry. Lorem Ipsum has been the industry's standard
dummy text ever since the 1500s, when an unknown printer took a galley
of type and scrambled it to make a type specimen book.</p>
<p>&nbsp;</p>
<p align="right"><a href="#" class="more">Read More</a></p>
</div>
</div>
<div class="content-right">
<div class="mainmenu">
<h2 class="sidebar1">Main Menu</h2>
<ul>
  <li><a href="Addfaculty.jsp" >Add Faculty</a></li>
  <li><a href="AssignFacultySubject.jsp">Assign Subject to Faculty</a></li>
  <li><a href="StudentDetails.jsp">View Student Details</a></li>
  <li><a href="AddSubject.jsp">Add Course</a></li>
  <li><a href="Upload.jsp">Upload Study Materials</a></li>
  <li><a href="DeleteSubject.jsp">Delete Subject </a></li>
  <li><a href="Notices.jsp">View Notices,</a></li>
  <li><a href="update.jsp">Update Details</a></li>
 
</ul>

</div>
<div class="contact">
<h2 class="sidebar2">Contact</h2>
<div class="contact-detail">
<p class="green"><strong>Lorem Ipsum is simply dummy text</strong></p>
<p><strong>Adress :</strong> Lorem Ipsum has been the<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;dummy
text the 1500s,</p>
<p><strong>E-mail :</strong> &nbsp;&nbsp;&nbsp;when an unknown printer
took a</p>
<p><strong>Phone :</strong> &nbsp;&nbsp;&nbsp;00-0000000000<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;000-0000-0000</p>
</div>
</div>
</div>
</div>
<div class="footer">
<!--DO NOT Remove The Footer Links-->
<a href="http://www.htmltemplates.net">
<img src="images/footer.gif" alt="html templates" border="0" height="1" width="1"></a>
<p>&copy; Copyright 2010. Designed by <a target="_blank"
 href="http://www.htmltemplates.net">htmltemplates.net</a><br>
<!--DO NOT Remove The Footer Links-->
</p>
<ul>
  <li style="border-left: medium none;"><a href="index.jsp"><span>Home</span></a></li>
  <li><a href="#"><span>About&nbsp;us</span></a></li>
  <li><a href="#"><span>What's&nbsp;new</span></a></li>
  <li><a href="#"><span>Services</span></a></li>
  <li><a href="#"><span>Contact</span></a></li>
  <li><a href="#"><span>Resources</span></a></li>
  <li><a href="Logoutpage.jsp"><span>Logout</span></a></li>
  <li style="padding-right: 0px;"><a href="#"><span>Links</span></a></li>
</ul>
</div>
</div>
</div>
</div>
</div>
</body>
</html>
