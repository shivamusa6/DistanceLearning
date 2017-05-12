<%@page import="dao.*" %>
<%@page import="java.util.*" %>
<html>
<head>
</head>
<body bgcolor="grey">
<% 
ArrayList v=(ArrayList) session.getAttribute("u1");
int n=v.size()/6;
int r=0,ctr=0;
int arr[]=Dao.get_ans();
out.println("Correct Answer : ");
for(int yy=0;yy<arr.length;yy++)
{
	out.println(arr[yy]+" , ");
}
out.println("Answers submitted : ");
for(int i=1;i<=n;i++)
{
String m=String.valueOf(i);
String z1=(String) request.getParameter(m);
out.println(z1+" , ");
if(arr[r]==Integer.parseInt(z1))
	{
	ctr++;
	}
/*for(int j=0;j<v.size();j+=6)
{
 String mm=(String) v.get(j);
 if(mm.equals(z1))
 {
 
  out.println((String)v.get(j+1));
  
  }



}*/
r++;
}
out.println("Correct = "+ctr);
 %>
<a href="Showques.jsp">Back</a>
</body>
</html>