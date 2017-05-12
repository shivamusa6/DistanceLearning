<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<link rel="stylesheet" href="css/jquery-ui.css"></link>
  <script src="js/jquery-1.10.2.js"></script>
  <script src="js/jquery-ui.js"></script>
  <link rel="stylesheet" href="css/style.css"></link>



<script type="text/javascript">




$(function() {
    $( "#datepicker" ).datepicker();
  });

$(function() {
    $( "#datepicker1" ).datepicker();
  });


function myAlert()
{
    alert("For More Info,You please Log In or Register");
}
function fx1()
{
now =new Date();
document.f1.t12.value=now.getDate()+"/"+eval(now.getMonth()+1)+"/"+eval(now.getYear()-100);
document.f1.t13.value=now.getHours()+":"+now.getMinutes()+":"+now.getSeconds();
}

function fx()
  {
	  
 if(document.f1.t1.value=="")
     {
          alert("Enter Subject Name properly");
          document.f1.t1.focus();
          return false;
     }
     
     
     if(document.f1.t2.value=="")
     {
          alert("Enter Subject code properly");
          document.f1.t2.focus();
          return false;
     }
     
     if(document.f1.strtdt.value=="")
     {
          alert("Enter Start date properly");
          document.f1.strtdt.focus();
          return false;
     }
     
     if(document.f1.enddt.value=="")
     {
          alert("Enter End date properly");
          document.f1.enddt.focus();
          return false;
     }
     
     if(document.f1.t3.value=="")
     {
          alert("Enter duration properly");
          document.f1.t3.focus();
          return false;
     }
     
     if(document.f1.t4.value=="")
     {
          alert("Enter fees properly");
          document.f1.t4.focus();
          return false;
     }
     
     if(document.f1.t5.value=="")
     {
          alert("Enter Eligibility in X properly");
          document.f1.t5.focus();
          return false;
     }
     
     if(document.f1.t6.value=="")
     {
          alert("Enter Eligibility in XII properly");
          document.f1.t6.focus();
          return false;
     }
     
     if(document.f1.t7.value=="")
     {
          alert("Enter passmarks properly");
          document.f1.t7.focus();
          return false;
     }
     
     f1.submit();
  }
</script>
  <title>Your Company</title>
   <meta name="description" content="">
  <meta name="keywords" content="">
  <meta http-equiv="Content-Type"
 content="text/html; charset=iso-8859-1">
  <link href="css/style1.css" rel="stylesheet" type="text/css">
</head>
<body onLoad="t=setInterval('fx1()',100)">
<form action="AddSubjectServlet" name="f1" method="post" onSubmit="return fx()">
<div class="page-out">
<div class="page-in">
<div class="page">
<div class="main">
<div class="header">
<div class="header-top">
<h1>Distant Education</h1>
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
  <li><a href="ContactUs.jsp"><span>Contact Us</span></a></li>
  <li><a href="#"><span>Resources</span></a></li>
  <li><a href="reg_form.jsp"><span>Register</span></a></li>
</ul>
</div>
</div>
<div class="content">
<div class="content-left">
<div class="row1">
<h1 class="title"> <span>Enter Subject Details</span></h1>


<hr>
<tr align="right">
  <td >
  
 <embed src=http://flash-clocks.com/free-flash-clocks-blog-topics/free-flash-clock-64.swf width=250 height=100 wmode=transparent type=application/x-shockwave-flash></embed>
  
 <!-- <embed src=http://flash-clocks.com/free-flash-clocks-blog-topics/free-flash-clock-193.swf width=200 height=100 wmode=transparent type=application/x-shockwave-flash></embed>
  -->
  <!--  
  <p>Date :
      <input type="text" name="t12" disabled="true" />
  </p>
    <p>&nbsp;</p></td>
  </tr>
   <tr align="right">
  <td >Time :<input type="text" name="t13" disabled="true"></td>
  </tr>
  
  -->
  
  
   </hr>
   </br>
</br>
</br>


<table align="center">
 <tr>
 <td>Subject Name :</td>
  <td><input type="text" name="t1"></td>
  </tr>
 
 
  <td>Subject Code :</td>
  <td><input type="text" name="t2"></td>
  </tr>
   
   <tr>
	<td>
		Start Date :
	</td>
	<td>
	<input type="text" id="datepicker"  name="strtdt">
		
	</td>
	</tr>
	
	<tr>
	<td>
		End Date :
	</td>
	<td>
	<input type="text" id="datepicker1"  name="enddt">
		
	</td>
	</tr>
	
	
	<tr>
	<td>Duration :</td>
  <td><input type="text" name="t3"></td>
  </tr>
 
 <tr>
	<td>Fees :</td>
  <td><input type="text" name="t4"></td>
  </tr>
	
 <tr>
	<td>Eligibility at X % :</td>
  <td><input type="text" name="t5"></td>
  </tr>
   
<tr>
	<td>Eligibility at XII % :</td>
  <td><input type="text" name="t6"></td>
  </tr>
  
  
  <tr>
	<td>Passing Criteria % :</td>
  <td><input type="text" name="t7"></td>
  </tr>
    
    
    <tr align="center">
   <td colspan="2">
  		<input type="submit" name="b1" value="SAVE" style="width:100px; height:40px; color:black;">
        <input type="reset" name="b2" value="RESET" style="width:100px; height:40px; color:black;">
    </td>
    </tr>
  
</table> 
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
</body>
</html>
