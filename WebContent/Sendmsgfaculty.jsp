<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<link rel="stylesheet" href="css/jquery-ui.css"></link>
  <script src="js/jquery-1.10.2.js"></script>
  <script src="js/jquery-ui.js"></script>
  <link rel="stylesheet" href="css/style1.css"></link>



<script type="text/javascript">




$(function() {
    $( "#datepicker" ).datepicker();
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
	  var ph=new RegExp("^[+91,0]+[0-9]{10}$");
	var eml=new RegExp("^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{3})$");
   if(!eml.test(document.f1.t1.value))
     {
          alert("Enter valid email");
          document.f1.t1.focus();
          return false;
     }
 if(document.f1.t2.value=="")
     {
          alert("Enter Name properly");
          document.f1.t2.focus();
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
<form action="facmsgServlet" name="f1" method="post" onSubmit="return fx()">
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
  <li><a href="ContactUs.jsp"><span>Contact Us</span></a></li>
  <li><a href="#"><span>Resources</span></a></li>
  <li><a href="#"><span>Logout</span></a></li>
</ul>
</div>
</div>
<div class="content">
<div class="content-left">
<div class="row1">
<h1 class="title"> <span>Enter Faculty Details</span></h1>


<hr>
  <embed src=http://flash-clocks.com/free-flash-clocks-blog-topics/free-flash-clock-64.swf width=250 height=100 wmode=transparent type=application/x-shockwave-flash></embed>
     </hr>
<table border="0" width="300" height="200">
<caption><h2>New Faculty Added</h2></caption>
<br></br>
<br></br>
<tr >
<td><label>Faculty Email :</label>  <label>${email}</label></td>
</tr>
<tr >
<td><label>Faculty Department : </label>  <label>${dept}</label></td>
</tr>
<tr >
<td><label>Faculty Designation : </label>  <label>${design}</label></td>
</tr>
<tr>
<td><label>Salary : </label>  <label>${salary}</label></td>
</tr>

<br />
<br />


  
   <tr align="center">
   <td colspan="2">
  		<input type="submit" name="b1" value="Send Message" style="width:100px; height:40px; color:red;">
        </td>
    </tr>
 
  
</table> 
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
