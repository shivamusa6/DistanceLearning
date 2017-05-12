package helper;

public class PasswordGenerator {
public static String generatePassword()
{
	String passwrd="";
	String data="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0987654321";
	char[] arr=data.toCharArray();
	for(int i=0;i<8;i++)
	{
		int j=(int)((Math.random())*62);
		passwrd=passwrd+arr[j];
	}
	return passwrd;
}
}
