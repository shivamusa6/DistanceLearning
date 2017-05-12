<%@page import="java.sql.*"%>
<%@page import="java.util.*" import="dao.*" import="java.sql.ResultSet" import="model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript">

x=60;
function fx()
{
  alert("time is out");
  f.submit();
}

function fx1()
{
	fx3();
	fx2();
	setTimeout("fx();",60000);
	
} 
function fx2()
{
	t=setInterval("fx3();",1000);	
}
function fx3()
{
   document.f.l1.value=x--;
}








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
<body onload="fx1()">

<form name="f" action="questionback.jsp" method="post">
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
 href="index.html"><span>Home</span></a></li>
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
<h1 class="title"><span>Your Times Starts Now</span></h1>
<table width="">

<center>
Time :<input type="label" name="l1" style="t" readonly="true" size="1">
</center>
<%
Dao d=new Dao();
//String sql="select * from java2 where sno=?";
//session=request.getSession();
	//String usrid=(String)session.getAttribute("email");
String dd=(String)session.getAttribute("sub");
String sql="";
if(dd.equals("DBMS"))
{
	sql="select * from c2 where sno=?";
}
else if(dd.equals("JAVA"))
{
	sql="select * from java2 where sno=?";
}
ArrayList u=d.showques(sql);
session.setAttribute("u1",u);
%>
<br></br>
<%
int k=1;
for(int i=0;i<=u.size()-6;i=i+7)
{
%>
<p><tr>
<td>Ques. <%= k%>&nbsp;&nbsp;&nbsp;<%=u.get(i+1)%>
</tr>
<tr>
<td>
&nbsp;&nbsp;<input type="radio" name=<%=String.valueOf(k)%> value="1"><%=u.get(i+2)%>&nbsp;
<br>
&nbsp;&nbsp;<input type="radio" name=<%=String.valueOf(k)%> value="2"><%=u.get(i+3)%>&nbsp;
<br>
&nbsp;&nbsp;<input type="radio" name=<%=String.valueOf(k)%> value="3"><%=u.get(i+4)%>&nbsp;
<br>
&nbsp;&nbsp;<input type="radio" name=<%=String.valueOf(k)%> value="4"><%=u.get(i+5)%>&nbsp;
</tr></p>
<%
k++;
}
%>
<tr align="center">
<td><input type="submit" name="b1" value="Submit" style="width:100px; height:30px; color:blue;">
</tr>
</table>



<p>&nbsp;</p>
<p>&nbsp;</p>
<p><br>
  <br>
</p>
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
  <li style="border-left: medium none;"><a href="index.html"><span>Home</span></a></li>
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
</form>
</body>
</html>
