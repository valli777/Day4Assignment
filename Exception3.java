import java.util.Scanner;
class MyException extends Exception
{
	private String tName1;
	private String tName2;
	public MyException(String str1,String str2)
	{
		tName1=str1;
		tName2=str2;
	}
	public String toString()
	{
		return "TeamNameNotFoundException: Entered team is not a part of IPL Season 4";
	}
}
class Main
{
	static void check(String str1,String str2) throws MyException
	{
		int count=0;
        String[] str=new String[8];
        str[0]=	"Chennai Super Kings";
        str[1]="Deccan Chargers";
		str[2]="Delhi Daredevils";
        str[3]="Kings XI Punjab";
		str[4]="Kolkata Knight Riders";
		str[5]="Mumbai Indians";
		str[6]="Rajasthan Royals";
		str[7]="Royal Challengers Bangalore";
		for(int i=0;i<8;i++)
		{
			if(str1.equals(str[i])){
				for(int j=0;j<8;j++){
				if(str2.equals(str[j])){
				count=count+1;
				}
				}
			}
		}
		if(count==0)
			throw new MyException(str1,str2);
		else
			System.out.println("Expected IPL Season 4 winner: "+str1+"\n"+"Expected IPL Season 4 runner: "+str2);
	}	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the expected winner team of IPL Season 4");
			String str1=sc.nextLine();
			System.out.println("Enter the expected runner team of IPL Season 4");
			String str2=sc.nextLine();
			check(str1,str2);
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}