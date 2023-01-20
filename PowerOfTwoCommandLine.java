//Power of 2
import java.lang.*;

public class PowerOfTwoCommandLine
{
	public static void main(String args[])
	{
		System.out.println("Enetr the element"+args[0]);
		int table=Integer.parseInt(args[0]);
		for(int counter=1;counter<=table;counter++)
		{
			int mult=2*counter;
			System.out.println("2 * "+counter+"= "+mult);
		}
	}
}