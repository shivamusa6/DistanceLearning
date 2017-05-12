package dao;

import java.sql.*;
import java.util.ArrayList;
import java.io.*;

import model.Model;

public class Dao {
	static int[] ans=new int[5];
	private static String driver="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://ec2-50-19-213-178.compute-1.amazonaws.com:3306/satya1989";
	private static String username="user";
	private static String password="password";
private static Connection con=null;
private static ResultSet rs=null;
public static int[] get_ans()
{
return ans;
}
public static Connection connect()
{
	try
	{
		Class.forName(driver);
	 	con=DriverManager.getConnection(url, username, password);
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("CNFE occured");
		e.printStackTrace();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return con;
}
/*public static int max()
{

}*/public static boolean addsubject(Model m, String sql)
{
	boolean status=false;
	try
	{
		connect();
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, m.getSubname());
		ps.setString(2, m.getSubcde());
		ps.setString(3, m.getStrtdte());
		ps.setString(4, m.getEnddte());
		ps.setString(5, m.getDurtn());
		ps.setString(6, m.getFees());
		ps.setString(7, m.getEligX());
		ps.setString(8, m.getEligXII());
		ps.setString(9, m.getPassmrk());
		
		int i=ps.executeUpdate();
		if(i!=0)
		{
			status=true;
			
		}
		else
		{
			status=false;
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
return status;
}
public static ResultSet validate(Model m, String sql)
{
	boolean status=false;
	
	try
	{
		connect();
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, m.getemail());
		ps.setString(2, m.getPassword());
		rs=ps.executeQuery();
		}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return rs;
}
public static boolean DeleteSubject(Model m,String sql)
{
	boolean status=false;
	try
	{
		connect();
		PreparedStatement ps2=con.prepareStatement(sql);
		
		//ps1.setString(1, m.getemail());
		ps2.setString(1, m.getSubcde());
		
		
		System.out.println("exe update");
		int i=ps2.executeUpdate();
		System.out.println("afterexe update");
		//PreparedStatement ps1=con.prepareStatement(sql1);
		//ps1.setString(1, m.getemail());
		//ps1.setString(2, m.getPassword());
		//int j=ps1.executeUpdate();
		if(i!=0)
		{
			status=true;
			
		}
		else
		{
			status=false;
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return status;
}
public static boolean regisques(Model m,String sql)
{
	boolean status=false;
	try
	{
		connect();
		System.out.println("connected");
		String sql1="select max(sno) from java2";
		PreparedStatement ps1=con.prepareStatement(sql1);
		ResultSet rs=ps1.executeQuery();
	 	  String v="";
	 	  if(rs.next())
	 	  	   v=(String) rs.getString(1);
	 	 int q=Integer.parseInt(v)+1;
	 	 //String rr=q.toString();
	 	// String jj=q;
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.println("prepared");
		ps.setString(1,"254");
		ps.setString(2,m.getQuestion());
		ps.setString(3,m.getOption1());
		ps.setString(4,m.getOption2());
		ps.setString(5,m.getOption3());
		ps.setString(6,m.getOption4());
		ps.setString(7,m.getAnswer());
		System.out.println("before execute update");
		int i=ps.executeUpdate();
		System.out.println("after execute update");
		System.out.println(i);
		if(i!=0)
		{
			status=true;
			
		}
		else
		{
			status=false;
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return status;

}
public static boolean register(Model m,String sql)
{
	boolean status=false;
	try
	{
		connect();
		System.out.println("connected");
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.println("prepared");
		ps.setString(1, m.getemail());
		ps.setString(2, m.getname());
		ps.setString(3, m.getuserid());
		ps.setString(4, m.getAddress());
		//ps.setDate(5, m.getdob());
		ps.setString(5, m.getdob());
		ps.setString(6, m.getphone());
		ps.setString(7, m.getsex());
		ps.setString(8, m.getPassword());
		ps.setString(9, m.getsquestion());
		ps.setString(10, m.getsanswer());
		System.out.println("before execute update");
		int i=ps.executeUpdate();
		System.out.println("after execute update");
		System.out.println(i);
		if(i!=0)
		{
			status=true;
			
		}
		else
		{
			status=false;
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return status;
}
public static ArrayList fac_list(String sql)
{
	ArrayList p=new ArrayList();
	try
	{
		connect();
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			for(int i=1;i<=11;i++)
			{
				p.add(rs.getString(i));
			}
		}
		System.out.println (p.listIterator(1));
	}
	catch(Exception ex)
	{
		System.out.println ("List Search Error");
	}
	return p;
}
public static ArrayList list(String sql)
{
	ArrayList p=new ArrayList();
	try
	{
		connect();
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			for(int i=1;i<=7;i++)
			{
				p.add(rs.getString(i));
			}
		}
		System.out.println (p.listIterator(1));
	}
	catch(Exception ex)
	{
		System.out.println ("List Search Error");
	}
	return p;
}
public static boolean HODregister(Model m,String sql)
{
	boolean status=false;
	try
	{
		connect();
		PreparedStatement ps1=con.prepareStatement(sql);
		
		ps1.setString(1, m.getemail());
		ps1.setString(2, m.getname());
		ps1.setString(3, m.getuserid());
		ps1.setString(4, m.getAddress());
		ps1.setString(5, m.getdob());
		ps1.setString(6, m.getphone());
		ps1.setString(7, m.getsex());
		ps1.setString(8, m.getPassword());
		ps1.setString(9, m.getsquestion());
		ps1.setString(10, m.getsanswer());
		ps1.setString(11, m.getDept());
		ps1.setString(12,m.getDegree());
		
		System.out.println("exe update");
		int i1=ps1.executeUpdate();
		System.out.println("afterexe update");
		//PreparedStatement ps1=con.prepareStatement(sql1);
		//ps1.setString(1, m.getemail());
		//ps1.setString(2, m.getPassword());
		//int j=ps1.executeUpdate();
		if(i1!=0)
		{
			status=true;
			
		}
		else
		{
			status=false;
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return status;
}
public static boolean registerfac(Model m,String sql)
{
	boolean status=false;
	try
	{
		connect();
		System.out.println("connected");
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.println("prepared");
		ps.setString(1, m.getemail());
		ps.setString(2, m.getname());
		ps.setString(3, m.getAddress());
		ps.setString(4, m.getdob());
		ps.setString(5, m.getphone());
		ps.setString(6, m.getsex());
		ps.setString(7, m.getPassword());
		ps.setString(8, m.getsquestion());
		ps.setString(9, m.getsanswer());
		ps.setString(10, m.getDegree());
		System.out.println("before execute update");
		int i=ps.executeUpdate();
		System.out.println("after execute update");
		System.out.println(i);
		if(i!=0)
		{
			status=true;
			
		}
		else
		{
			status=false;
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return status;
}
public static boolean regisfacbyhod(Model m,String sql)
{
	boolean status=false;
	try
	{
		connect();
		System.out.println("connected");
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.println("prepared");
		ps.setString(1, m.getemail());
		//ps.setString(2,m.getuserid());
		ps.setString(2,m.getDept());
		ps.setString(3,m.getDesignation());
		ps.setString(4,m.getSalary());
		System.out.println("before execute update");
		int i=ps.executeUpdate();
		System.out.println("after execute update");
		System.out.println(i);
		if(i!=0)
		{
			status=true;
			
		}
		else
		{
			status=false;
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return status;
}

public static  boolean update(Model m,String sql)
{
	boolean status=false;
	try
	{
		connect();
		System.out.println("connected");
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, m.getname());
		ps.setString(2, m.getAddress());
		ps.setString(3, m.getphone());
		ps.setString(4, m.getsex());
		ps.setString(5, m.getPassword());
		ps.setString(6, m.getsquestion());
		ps.setString(7, m.getsanswer());
		ps.setString(8, m.getemail());
		 int i=ps.executeUpdate();
		 if(i!=0)
			{
				status=true;
				
			}
			else
			{
				status=false;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return status;
	}


public static boolean reset(Model m, String sql)
{
	boolean status=false;
	try
	{
		connect();
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, m.getPassword());
		ps.setString(2, m.getemail());
		int i=ps.executeUpdate();
		if(i!=0)
		{
			status=true;
			
		}
		else
		{
			status=false;
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
return status;
}
public int[] qno()
{
	int[] x=new int[5];
	int i=0;
	while(i<x.length)
	{
		int c=(int)(Math.random()*10);
		if(c>=1 && c<=5)
		{
			boolean flag=false;
			for(int j=0;j<i;j++)
			{
				if(x[j]==c)
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				x[i]=c;
				i++;
			}
		}
	}
	return x;
} 
public ArrayList showques(String sql)
{ 
	
	int ctr=0;
	ArrayList ls=new ArrayList();
	try
	{
		connect();
		int[] v=qno();
		for(int f=0;f<v.length;f++)
		{
		System.out.print(v[f]+"  ");
		}
		for(int j=0;j<v.length;j++)
		{
		PreparedStatement ps=con.prepareStatement("select * from java2 where sno='1'");
		
	//	ps.setString(1,"1"); changes done here.........................
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
		String a1=rs.getString(7);
		System.out.println(a1);
		for(int i=1;i<=6;i++)
		{
			if(a1.equals(rs.getString(i)))
			{
				ans[ctr]=i-2;
				ctr++;
			}
					
			ls.add(rs.getString(i));
		}
		ls.add(rs.getString(7));
		System.out.println(ls);
	}
	}
}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println ("find error");
	}
	System.out.println("answer");
	for(int f=0;f<ans.length;f++)
	{
	System.out.print(ans[f]+"  ");
	}
	
	return ls;
}
   
public static ArrayList list()
{
	System.out.println("in aaay");
	ArrayList v=new ArrayList();
	try
	{
		connect();
		String sql="select name from userdetails";
		PreparedStatement ps=con.prepareStatement(sql);
	  ResultSet rs=ps.executeQuery();
	  System.out.println("aftr rs exe");
		if(rs.next())
		{
			System.out.println("befr print");
			System.out.println((String)rs.getString(0));
			System.out.println("ssssssssss");
			
		}
		
	
	}
	catch(Exception e)
	{
		System.out.println ("insert error");
	}
	return v;
}

public static ArrayList find(String sql,String s1)
{
	ArrayList v=new ArrayList();
	try
	{
		connect();
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,s1);
		
		ResultSet rs=ps.executeQuery();
		System.out.println("In arraylist");
		
		if(rs.next())
		{
			for(int i=1;i<=10;i++)
			{
				v.add(rs.getString(i));
				//System.out.println(rs.getString(i));
			}
		}
		
	
	}
	catch(Exception e)
	{
		System.out.println ("insert error");
	}
	return v;
}

public static boolean reset1(Model m,String sql,String sql1)
{
	boolean status=false;
	try
	{
		connect();
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, m.getemail());
		ps.setString(2, m.getname());
		ps.setString(3, m.getuserid());
		ps.setString(4, m.getAddress());
		ps.setString(5, m.getdob());
		ps.setString(6, m.getphone());
		ps.setString(7, m.getsex());
		ps.setString(8, m.getPassword());
		ps.setString(9, m.getsquestion());
		ps.setString(10, m.getsanswer());
	int i=ps.executeUpdate();
	PreparedStatement ps1=con.prepareStatement(sql1);
	ps1.setString(1, m.getPassword());
	ps1.setString(2, m.getemail());
	int j=ps1.executeUpdate();
	if(i!=0 && j!=0)
	{
		status=true;
	}
	else
	{
		status=false;
	}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return status;
}
	
public static  boolean facupdate(Model m,String sql)
{
	boolean status=false;
	try
	{
		connect();
		System.out.println("connected");
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, m.getname());
		ps.setString(2, m.getAddress());
		ps.setString(3, m.getdob());
		ps.setString(4, m.getphone());
		ps.setString(5, m.getsex());
		ps.setString(6, m.getPassword());
		ps.setString(7, m.getsquestion());
		ps.setString(8, m.getsanswer());
		ps.setString(9, m.getDegree());
		ps.setString(10, m.getemail());
		 int i=ps.executeUpdate();
		 if(i!=0)
			{
				status=true;
				
			}
			else
			{
				status=false;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return status;
	}


public static ArrayList fac_find(String s1)
{
	ArrayList v=new ArrayList();
	try
	{
		connect();
		String sql="select userid, email, dept, design, salary from facultydetails where email=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,s1);
		
		ResultSet rs=ps.executeQuery();
		System.out.println("In arraylist");
		
		if(rs.next())
		{
			for(int i=1;i<=10;i++)
			{
				v.add(rs.getString(i));
				//System.out.println(rs.getString(i));
			}
		}
		
	
	}
	catch(Exception e)
	{
		System.out.println ("insert error");
	}
	return v;
}
public static ResultSet forget(Model m,String sql) 
{	
	boolean status=false;
	try
	{
		connect();
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, m.getemail());
		ps.setString(2, m.getsquestion());
		ps.setString(3, m.getsanswer());
		rs=ps.executeQuery();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return rs;
}

}
