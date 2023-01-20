//Java Program to Swap Two Numbers
import java.util.*;

public class SwapTwoNumber
{
	int num1,num2;
	
	public void Swap(SwapTwoNumber no)
	{
		int temp=no.num1;
		no.num1=no.num2;
		no.num2=temp;
		
	}
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		SwapTwoNumber obj = new SwapTwoNumber();
		
		System.out.println("Enter the first number :");
		obj.num1=scan.nextInt();
		System.out.println("Enter the second number :");
		obj.num2=scan.nextInt();
		
		obj.Swap(obj);
		System.out.println("first number :"+obj.num1);
		System.out.println("second number :"+obj.num2);
		
		
	}
}