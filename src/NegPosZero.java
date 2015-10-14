/**
 * 
 */
import java.util.Scanner;

/**
 * @author shairyarshafqat
 *
 */
public class NegPosZero {
	
	public NegPosZero()
	{
		
	}
	
	public NegPosZero(int what)
	{
		
	}
	
	@Override
	public String toString()
	{
		String Ret = null;
		
		Ret = "I am NegPosZero class";
		
		return Ret;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//  Auto-generated method stub
		NegPosZero n = new NegPosZero();
		
		//  create counters for pos, neg, and zero
		int pos_counter = 0, neg_counter = 0, zero_counter = 0;
		
		//  input the numbers from the console and create Scanner
		int num1, num2, num3, num4, num5;
		Scanner scanner = new Scanner(System.in);
		
		//
		num1 = scanner.nextInt();
		// count pos, neg, and zero's
		if (num1 < 0)
			neg_counter = neg_counter + 1;
		else if (num1 == 0)
			zero_counter = zero_counter + 1;
		else
			pos_counter++;
		
		//
		num2 = scanner.nextInt();
		// count pos, neg, and zero's
		if (num2 < 0)
			neg_counter = neg_counter + 1;
		else if (num2 == 0)
			zero_counter = zero_counter + 1;
		else
			pos_counter++;
		
		// print the output
		System.out.println("pos_counter: " + pos_counter);

		System.out.println("whoamI: " + n.toString());
		
	}

}
