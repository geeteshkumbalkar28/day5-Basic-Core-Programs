//Java Program to Find the Largest Among Three Numbers
import java.util.*;

public class LargestNumber
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr the first element");
		int firstNumber=scan.nextInt();
		System.out.println("Enetr the Second element");
		int secondNumber=scan.nextInt();
		System.out.println("Enetr the third element");
		int thirdNumber=scan.nextInt();
		
		LargestNumber obj = new LargestNumber();
		LargestNumber obj2=new LargestNumber();
		int iAns=obj.checkMaximumNumber(firstNumber,secondNumber,thirdNumber);
		System.out.println(iAns);
		if(iAns == firstNumber && iAns == secondNumber && iAns == thirdNumber)
		{
				System.out.println("First second and third number is the largest number");
			
		}
		else if(iAns == firstNumber && iAns == secondNumber )
		{
				System.out.println("First and second number is the largest number");
		}
		else if(iAns == firstNumber && iAns == thirdNumber )
		{
				System.out.println("First and third Number number is the largest number");
		}
		else if(iAns == secondNumber && iAns == thirdNumber )
		{
			System.out.println("second and third Number number is the largest number");
		}
		else if(iAns == firstNumber)
		{
			System.out.println("first number is the largest number");
		}
		else if(iAns == secondNumber)
		{
			System.out.println("second number is the largest number");
		}
		else if(iAns == thirdNumber)
		{
			System.out.println("third number is the largest number");
		}
		
		
	}
	public int checkMaximumNumber(int no1,int no2,int no3)
	{
		
		int iMax=no1;
		if(no2 >= no3)
		{
			if(iMax < no2)
			{
				iMax = no2;
			}
		}
		else if(no2 <= no3)
		{
			if(iMax < no3)
			{
				iMax = no3;
			}
		}
		return iMax;
	}
	public int checkSecondMaximumNumber(int no1,int no2,int no3,int max)
	{
		int iMax = 0;
		if((no1!=max)&&(no1>iMax))
		{
			iMax=no1;
			
		}
		if((no2!=max)&&(no2>iMax))
		{
			iMax=no2;
		}
		if((no3!=max)&&(no3>iMax))
		{
			iMax=no3;
		}
		System.out.println(iMax);
		return iMax;
		
		
	}
}
	