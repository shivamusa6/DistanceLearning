<%@page  %>
<html>
<body>
<% 
String x1=(String) request.getParameter("t1");
String x2=(String) request.getParameter("t2");
String x3=(String) request.getParameter("t3");
String x4=(String) request.getParameter("t4");
String x5=(String) request.getParameter("d1");
String x6=(String) request.getParameter("d2");
String x7=(String) request.getParameter("d3");
String x8=(String) request.getParameter("t5");
String x9=(String) request.getParameter("t6");
String x11=(String) request.getParameter("r");
String x12=(String) request.getParameter("ty");

int mm=Integer.parseInt(x6);

String arr[]={"jan","feb","mar","apr","may","jun","july","aug","sep","oct","nov","dec"};
String dt=x5+"-"+arr[mm-1]+"-"+x7;

//dml dd=new dml();
//int k=dd.ins(x1,x2,x3,x4,dt,x8,x9,x11,x12);
 out.println(x1);
  out.println(x2);
   out.println(x3);
   out.println(x4);
   out.println(dt);
   out.println(x8);
       out.println(x9);
                 out.println(x11);
         out.println(x12);
       
//int k=d.ins("abhi","abhi@gmail","12345","13/08/1991","kolkata","male","c","c++","java","c#");
//int  k=d.ins('abhi@gmail.com','abhishek samanta',1,'maurigram','13-aug-1991',9062691773,'male','premium','westbengal');
/* if(k==1)
  out.println("succ");
else
  out.println("not succ"+k);   */

 %>
</body>
</html>