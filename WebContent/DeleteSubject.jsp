<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript">
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
     
     if(document.f1.t3.value=="")
     {
          alert("Enter dept properly");
          document.f1.t3.focus();
          return false;
     }
     
      if(document.f1.t4.value=="")
     {
          alert("Enter design properly");
          document.f1.t4.focus();
          return false;
     }
    
     if(document.f1.t5.value=="")
     {
         alert("Enter salary properly");
         document.f1.t5.focus();
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
<form action="DeleteSubjectServlt" name="f1" method="post" onSubmit="return fx()">
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
 href="#"><span>Home</span></a></li>
  <li><a href="index.jsp"><span>About&nbsp;us</span></a></li>
  <li><a href="#"><span>What's&nbsp;new</span></a></li>
  <li><a href="#"><span>Services</span></a></li>
  <li><a href="contact.jsp"><span>Contact Us</span></a></li>
  
  <li><a href="reg_form.jsp"><span>Register</span></a></li>
  <li><a href="index.jsp"><span>Log out</span></a></li>
</ul>
</div>
</div>
<div class="content">
<div class="content-left">
<div class="row1">
<h1 class="title"> <span>Delete Faculty Details</span></h1>


<table align="center">
  
   <tr>
   <td>Enter subject code :</td>
  <td><input type="text" name="t1"></td>
  </tr>
  

  <tr>
   <td colspan="2">
  		<input type="submit" name="b1" value="Delete" style="width:100px; height:40px; color:black;">
        
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
  <li style="border-left: medium none;"><a href="#"><span>Home</span></a></li>
  <li><a href="index.jsp"><span>About&nbsp;us</span></a></li>
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
