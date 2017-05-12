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
	  var ph=new RegExp("^[+91,0]+[0-9]{10}$");
	var eml=new RegExp("^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{3})$");
   if(!eml.test(document.f1.ts1.value))
     {
          alert("Enter valid email");
          document.f1.ts1.focus();
          return false;
     }
 if(document.f1.ts2.value=="")
     {
          alert("Enter Name properly");
          document.f1.ts2.focus();
          return false;
     }
 
 if(document.f1.ts3.value=="")
 {
      alert("Enter Userid properly");
      document.f1.ts3.focus();
      return false;
 }

     
     if(document.f1.ts4.value=="")
     {
          alert("Enter Address properly");
          document.f1.ts4.focus();
          return false;
     }
     
      if(document.f1.ts5.value.length!=10)
     {
          alert("Enter Mobile properly");
          document.f1.ts5.focus();
          return false;
     }
    
     if(document.f1.ts6.value.length<6)
     {
         alert("password length must be >=6");
         document.f1.ts6.focus();
          return false;
     }
      if(document.f1.ts6.value!=document.f1.ts7.value)
     {
         alert("password not mathched ");
         document.f1.ts6.focus();
          return false;
     }
    
 if(document.f1.ds1.selectedIndex==0)
     {         
         alert("select a day ");
         document.f1.ds1.focus();
          return false;
     }
	 
	 if(document.f1.ds2.selectedIndex==0)
     {         
         alert("select a month ");
         document.f1.ds2.focus();
          return false;
     }
	 
	 if(document.f1.ds3.selectedIndex==0)
     {         
         alert("select a year ");
         document.f1.ds3.focus();
          return false;
     }
     if(document.f1.rs[0].checked==false && document.f1.rs[1].checked==false)
     {
         alert("Choose Sex Option ");
         document.f1.r[0].focus();
          return false;
     }
     
     
      if(document.f1.ts9.value=="")
      {
           alert("Enter dept properly");
           document.f1.ts9.focus();
           return false;
      }
      if(document.f1.ts10.value=="")
      {
           alert("Enter degr properly");
           document.f1.ts10.focus();
           return false;
      }
  
     f1.submit();
  }
</script>
  <title>HOD Registration</title>
   <meta name="description" content="">
  <meta name="keywords" content="">
  <meta http-equiv="Content-Type"
 content="text/html; charset=iso-8859-1">
  <link href="css/style1.css" rel="stylesheet" type="text/css">
</head>
<body onLoad="t=setInterval('fx1()',100)">


<form action="HODServlet" name="f1" method="post" onSubmit="return fx()">



<div class="page-out">
<div class="page-in">
<div class="page">
<div class="main">
<div class="header">
<div class="header-top">
<h1>Distatnt Education</h1>
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
  <li><a href="AboutUs.jsp"><span>About&nbsp;us</span></a></li>
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
<h1 class="title"> <span>Enter HOD Registration Details</span></h1>


<hr>
<tr align="right">
  <td ><p>Date :
      <input type="text" name="t12" disabled="true" />
  </p>
    <p>&nbsp;</p></td>
  </tr>
   <tr align="right">
  <td >Time :<input type="text" name="t13" disabled="true"></td>
  </tr>
   </hr>
   </br>
</br>
</br>


<table align="center">
 <tr>
 <td>Email Id :</td>
  <td><input type="text" name="ts1"></td>
  </tr>
 
 
  <td>Name :</td>
  <td><input type="text" name="ts2"></td>
  </tr>

  <tr>
  <td>User Id :</td>
  <td><input type="text" name="ts3"></td>
  </tr>
   
   <td>Address :</td>
  <td><input type="text" name="ts4"></td>
  </tr>
   
   <tr>
	<td>
		Date Of Birth :</td>
	<td>
	<select name="ds1">
		<option>day</option>
	<% 
	for(int i=1;i<=31;i++)
	{	
	 %>
	 <option><%=i%></option>
	<% 
	}
	%>

	</select>
	
	<select name="ds2">
		<option>month</option> 
		<% 
	for(int i=1;i<=12;i++)
	{	
	 %>
	 <option><%=i%></option>
	<% 
	}
	%>

	</select>
	<select name="ds3">
		<option>year</option>  
		<% 
	for(int i=1950;i<=2014;i++)
	{	
	 %>
	 <option><%=i%></option>
	<% 
	}
	%>

	</select>
	</td>
	<tr>
	<td>Phone no :</td>
  <td><input type="text" name="ts5"></td>
  </tr>
 
 <tr>
  	<td>Sex</td>
    <td>
    	<input type="radio" name="rs" value="male">Male
    	<input type="radio" name="rs" value="female">Female	
    </td>
  </tr>
	
   
   <tr>
    <td>password :</td>
  <td><input type="password" name="ts6"></td>
  </tr>
  <tr>
  <td>Re-enter password :</td>
  <td><input type="password" name="ts7"></td>
  </tr>
   
<tr>
  	<td><label>Choose Security Question :</label></td>
<td><select name="st1">
<option >Your First School Name</option>
<option >Your First Pet Name</option>
<option >Your First Teacher Name</option>
<option >Your First Friend Name</option>
</select></td>
</tr>
<tr>
<td><label>Answer :</label></td>
<td><input type="text" name="ts8"></input></td>
  </tr>
 <tr>
  <td>Dept :</td>
  <td><input type="text" name="ts9"></td>
  </tr>
  
  <tr>
  <td>Degree :</td>
  <td><input type="text" name="ts10"></td>
  </tr>
  
   <tr align="center">
   <td colspan="2">
  		<input type="submit" name="bs1" value="Submit" style="width:100px; height:40px; color:black;">
        <input type="reset" name="bs2" value="Reset" style="width:100px; height:40px; color:black;">
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
