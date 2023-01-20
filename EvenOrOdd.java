 // Java Program to Check Whether a Number is Even or Odd
 import java.util.*;
 
 public class EvenOrOdd
 {
	public static void main(String arg[])
	{
		EvenOrOdd obj = new EvenOrOdd();
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the element :");
		
		int num1 = scan.nextInt();
		
		boolean iAns=obj.checkEvenOrOdd(num1);
		
		if(iAns == true)
		{
			System.out.println("Number is Even");
		}
		else if(iAns == false)
		{
			System.out.println("Number is Odd");
		}
	}
	private boolean checkEvenOrOdd(int no)
	{
		if(no%2 == 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
 }