import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	    
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter thr number of overs");
		int len=sc.nextInt();
		int[] over=new int[len];
		System.out.println("Enter thr number of runs for each overs");
		for(int i=0;i<len;i++)
		{
			over[i]=sc.nextInt();
		}
		
			System.out.println("Enter thr over number");
			int num=sc.nextInt();
			System.out.println("Runs scored in over : "+over[num]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}