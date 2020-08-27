import java.util.Scanner;
class CustomException extends Exception{
	private int a;
	CustomException(int num)
	{
		a=num;
	}
	public String toString(){
		return "CustomException: InvalidAgeRangeException";
}
}
class Main{
	static void checkAge(String strt,int num) throws CustomException
	{
	    if(num<19)
			throw new CustomException(num);
		else
	System.out.println("Player name : "+strt+"\n"+"Player age : "+num);
	}

	public static void main(String args[]){
		try{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the player name");
	String name=sc.nextLine();
	System.out.println("Enter the player age");
	int age=sc.nextInt();
	checkAge(name,age);
		}
		catch(CustomException e)
		{
			System.out.println(e);
		}
	}
}
	
	