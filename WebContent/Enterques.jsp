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
document.f1.t12.value=now.getDate()+"/"+eval(now.getMonth()+1)+"/"+now.getYear();
document.f1.t13.value=now.getHours()+":"+now.getMinutes()+":"+now.getSeconds();
}

function fx()
  {
   if(document.f1.t1.value=="")
     {
          alert("Enter question properly");
          document.f1.t1.focus();
          return false;
     }
   
   if(document.f1.t2.value=="")
   {
        alert("Enter option1 properly");
        document.f1.t2.focus();
        return false;
   }
   if(document.f1.t3.value=="")
   {
        alert("Enter option2 properly");
        document.f1.t3.focus();
        return false;
   }
   if(document.f1.t4.value=="")
   {
        alert("Enter option3 properly");
        document.f1.t4.focus();
        return false;
   }
   if(document.f1.t5.value=="")
   {
        alert("Enter option4 properly");
        document.f1.t5.focus();
        return false;
   }
   if(document.f1.t6.value!=document.f1.t2.value && document.f1.t6.value!=document.f1.t3.value && document.f1.t6.value!=document.f1.t4.value && document.f1.t6.value!=document.f1.t5.value)
   {
        alert("Enter answer properly");
        document.f1.t6.focus();
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
<body onload="fx1()">
<form action="QuestionServlet" name="f1" method="post" onSubmit="return fx()">
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
  <li><a href="Logoutpage.jsp"><span>Logout</span></a></li>
</ul>
</div>
</div>
<div class="content">
<div class="content-left">
<div class="row1">
<h1 class="title"> <span>Enter Questions</span></h1>


<hr>
<tr >
  <td align="right"><p>Date :
      <input type="text" name="t12" disabled="true" />
  </p>
    <p>&nbsp;</p></td>
  </tr>
   <tr>
  <td align="right">Time :<input type="text" name="t13" disabled="true"></td>
  </tr>
   </hr>

<table  align="center">
 <tr>
 <td width="112" height="28">Question:</td>
  <td width="385"><textarea rows="5" cols="50" name="t1"></textarea></td>
  </tr>
 
 <tr>
  <td>Option 1 :</td>
  <td><input type="text" name="t2"></td>
  </tr>

  <tr>
  <td>Option 2 :</td>
  <td><input type="text" name="t3"></td>
  </tr>
   
   <tr>
   <td>Option 3 :</td>
  <td><input type="text" name="t4"></td>
  </tr>
    <tr>
   <td>Option 4 :</td>
  <td><input type="text" name="t5"></td>
  </tr>
   <tr>
   <td>Answer :</td>
  <td><input type="text" name="t6"></td>
  </tr>
  
   
   
  
 <tr align="center">
   <td colspan="2">
  		<p>
  		  <input type="submit" name="b1" value="Add" style="width:100px; height:40px; color:red;">
  		  <input type="reset" name="b2" value="Reset" style="width:100px; height:40px; color:red;">
  		</p>
  		<p>&nbsp;</p>
  		<p>&nbsp; </p>
    </td>
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
