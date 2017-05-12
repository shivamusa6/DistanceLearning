<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" import="dao.*" import="java.sql.ResultSet"%>
    
   
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript">
function myAlert()
{
    alert("For More Info,You please Log In or Register");
}


function fx()
  {
	   var ph=new RegExp("^[+91,0]+[0-9]{10}$");
  
 if(document.f1.t1.value=="")
     {
          alert("Enter Name properly");
          document.f1.t1.focus();
          return false;
     }
     
     
     if(document.f1.t2.value=="")
     {
          alert("Enter Address properly");
          document.f1.t2.focus();
          return false;
     }
     
     /* if(document.f1.t4.value.length!=10)
     {
          alert("Enter Mobile properly");
          document.f1.t4.focus();
          return false;
     }*/
      if(document.f1.r[0].checked==false && document.f1.r[1].checked==false)
      {
          alert("Choose Sex Option ");
          document.f1.r[0].focus();
           return false;
      }
     
      if(document.f1.t6.value!=document.f1.t7.value)
      {
          alert("password not match");
          document.f1.t10.focus();
           return false;
      }
      
      if(document.f1.t6.value.length<6)
      {
          alert("password length must be >=6");
          document.f1.t7.focus();
           return false;
      }
      
     
      if(document.f1.t8.value=="")
      {
           alert("Enter Security answer");
           document.f1.t8.focus();
           return false;
      }
      
       
     f1.submit(); 
    
   
  }
</script>

  <title>Faculty Details</title>
   <meta name="description" content="">
  <meta name="keywords" content="">
  <meta http-equiv="Content-Type"
 content="text/html; charset=iso-8859-1">
  <link href="css/style1.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet" href="css/jquery-ui.css"></link>
  <script src="js/jquery-1.10.2.js"></script>
  <script src="js/jquery-ui.js"></script>
  <link rel="stylesheet" href="css/style1.css"></link>
</head>
<body onLoad="t=setInterval('fx1()',100)">
<form action="FacupdateServlet" name="f1" method="post"  onSubmit="return fx()">
<%
 session=request.getSession();
	String usrid=(String)session.getAttribute("email");
	System.out.println(usrid);
		ArrayList ar=Dao.fac_find(usrid);
		String[] x=new String[20];
		int k1;
		for(k1=0;k1<5;k1++)
		{
		x[k1]=(String)ar.get(k1);
		
		}
		//System.out.println(ar.get(5));
		
		%>
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
  <li><a href="#"><span>Resources</span></a></li>
  <li><a href="#"><span>Register</span></a></li>
</ul>
</div>
</div>
<div class="content">
<div class="content-left">
<div class="row1">
<h1 class="title"> <span>Enter All Details</span></h1>


<hr>
<tr align="right">
  <td >
  
  <embed src=http://flash-clocks.com/free-flash-clocks-blog-topics/free-flash-clock-64.swf width=250 height=100 wmode=transparent type=application/x-shockwave-flash></embed>
  
  </hr>
   </br>
</br>
</br>



<table align="center">
 
 <tr>
 <td>Userid :</td>
 <td><label name="l1" ><%=x[0] %></label></td>
 </tr>
 
 <tr>
 <td>Email :</td>
  <td><label name="l2" ><%=x[1] %></label></td>
  </tr>
 
 
  <td>Name :</td>
  <td><input type="text" name="t1" ></td>
  </tr>

  
   <td>Address :</td>
  <td><input type="text" name="t2" ></td>
  </tr>
   
   <tr>
	<td>Date Of Birth :</td>
	<td><input type="text" name="t3" ></td>
	<tr>
	<td>Phone no :</td>
  <td><input type="text" name="t4" ></td>
  </tr>
 
  <tr>
  	<td>Sex</td>
    
  	 <td>
	  	 <input type="radio" name="r" value="male" >Male</input>
	  	 <input type="radio" name="r" value="female">Female</input>
  	 </td>
 </tr>
 
  <tr>
    <td>Current Password :</td>
  <td><input type="password" name="t5" ></td>
  </tr>
  <tr>
  <tr>
    <td>New Password :</td>
  <td><input type="password" name="t6" ></td>
  </tr>
  <tr>
  <td>Re Enter Password :</td>
  <td><input type="password" name="t7"></td>
  </tr>
   
<tr>
  	<td><label>Choose Security Question :</label></td>
<td><select name="s1">
<option >Your First School Name</option>
<option >Your First Pet Name</option>
<option >Your First Teacher Name</option>
<option >Your First Friend Name</option>
<option >Your First Car Name</option>
<option >Your Favourite Book</option>
</select></td>
</tr>
<tr>
<td><label>Answer :</label></td>
<td><input type="text" name="t8" ></input></td>
  </tr>
  
  <tr>
 <td>Department :</td>
 <td><label name="l3" ><%=x[2] %></label></td>
 </tr>
  
  <tr>
 <td>Degree :</td>
 <td><input type="text" name="t9" ></td>
 </tr>
  
  <tr>
 <td>Designation :</td>
 <td><label name="l4" ><%=x[3] %></label></td>
 </tr>
  
  <tr>
 <td>Salary :</td>
 <td><label name="l5" ><%=x[4] %></label></td>
 </tr>
  
   <tr align="center">
   <td colspan="2">
  		<input type="submit" name="b1" value="Update" style="width:100px; height:40px; color:red;">
        
    </td>
    </tr>
  
  
</table> 
</div>
<div class="row2">
<h2 class="subtitle">&nbsp;</h2>
<h2 class="subtitle">About <span>Us</span></h2>
<p><strong>Lorem Ipsum is simply dummy text</strong> of the printing
and typesetting industry. Lorem Ipsum has been the aaaa industry's
standard dummy text ever since the 1500s, ass as dwhen an unknasdown
printer took a galley of type and scrambled it to make a type
speascimen book. <br>
It has survived not only five centuries, but also the leap into
electronic typesetting.and scrambled it to make a type speascimen book.</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p align="right"><a href="#" class="more">Read More</a></p>
</div>
</div>
<div class="content-right">
<div class="mainmenu">
<h2 class="sidebar1">Main Menu</h2>
<ul>
  <li><a href="#" onclick="myAlert()">this is a dummy link 1</a></li>
  <li><a href="#">this is a dummy link 2</a></li>
  <li><a href="#">this is a dummy link 3</a></li>
  <li><a href="#">this is a dummy link 4</a></li>
  <li><a href="#">this is a dummy link 5</a></li>
  <li><a href="#">this is a dummy link 6</a></li>
  <li><a href="#">this is a dummy link 7</a></li>
  <li><a href="#">this is a dummy link 8</a></li>
  <li><a href="#">this is a dummy link 9</a></li>
  <li><a href="#">this is a dummy link 10</a></li>
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
  <li style="padding-right: 0px;"><a href="#"><span>Links</span></a></li>
</ul>
</div>
</div>
</div>
</div>
</div>
</form>
${message };
</body>
</html>
