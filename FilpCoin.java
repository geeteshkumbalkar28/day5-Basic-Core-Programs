//1. Flip Coin and print percentage of Heads and Tails
import java.lang.*;
import java.util.*;

public class FilpCoin
{ 
	public static void main(String arg[])
	{
		Random rand = new Random();
		
		int checkRandom=2;
		int intRandom=rand.nextInt(checkRandom);
		
		if(intRandom==1)
		{
			System.out.println("Head");
		}
		else
		{
			System.out.println("Tail");
		}
	}
}