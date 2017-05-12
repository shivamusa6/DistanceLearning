<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" import="dao.*" import="java.sql.ResultSet" import="java.io.*"%>


<html xmlns="http://www.w3.org/1999/xhtml">
<head>

  <style>
table.a,td.a
{
font-family:comic sans ms;
caption-side:bottom
font-size:20;
background-color:white;
border:3px dotted red;
width:40px;
border-collapse:collapse;
text-align:center;
color:purple;
padding:4px;

}
td.b
{
font-family:ravie;
font-size:20;
background-color:aqua;
border:3px solid red;
border-collapse:collapse;
text-align:center;
color:purple;
padding:8px;
}
th
{
font-family:mistral;
font-size:30;
color:black;
border:4px solid blue;
text-transform:uppercase;
height:40px;
background-color:yellow;
}
</style> 


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
<h2>“Time to study no time to waste,
<br />I the great man must gain every second of the day.” </h2>
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
<p>&nbsp;</p>
<p><h2>${msg }
<br/>
This is Admin Page




</h2></p>

<!--  <p>&nbsp;</p>
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
<p>&nbsp;</p>-->
	
			 		

<% 

			ArrayList h=Dao.list("select email, name, userid, address, dob, phone, sex from userdetails");
			if(h.size()!=0)
			{
			 %>
			 <table border="1" bgcolor="lightyellow" class="a">
			 <tr align="center">
			 	<th colspan="11">
			 		Student Information
			 	</th>
			 </tr>
			 	<tr>
			 		<th>
			 			Email
			 		</th>
			 		<th>
			 			Name
			 		</th>
			 		<th>
			 			Userid
			 		</th>
			 		<th>
			 			Address
			 		</th>
			 		<th>
			 			DOB
			 		</th>
			 		<th>
			 			Phone
			 		</th>
			 		<th>
			 			Sex
			 		</th>
			 	</tr>
			 	<% 
			 		for(int i=0;i<h.size();)
			 		{
			 	 %>
			 	 <tr>
			 	 	<% 
			 	 		for(int j=0;j<7;j++)
			 	 		{
			 	 	 %>
			 	 	 <td>
			 	 	 	<%= (String)h.get(i)%>
			 	 	 </td>
			 	 <% i++;%>
			 <%}%>
			 </tr>
			 <%}%>
			 </table>
			 <% }
			else
				{
					out.println("Not Found");
			 	}
			 	%>
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
  <li><a href="#" onclick="myAlert()">Choose A Course to Enroll</a></li>
  <li><a href="#">Download Lectures</a></li>
  <li><a href="#">Take Exams</a></li>
  <li><a href="#">View progress Reports</a></li>
  <li><a href="#">View Assignments</a></li>
  <li><a href="#">View Journals </a></li>
  <li><a href="#">View Notices,</a></li>
  <li><a href="#">Subject Materials</a></li>
  <li><a href="update.jsp">User Details</a></li>
 
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
