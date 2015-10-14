import java.util.Scanner;

public class CreatingObjPrac 
{
	// say hello
	public void hello()
	{
		System.out.println("hello");
	}
	// ask for name
	public void displayName(String name )
	{
		System.out.println(name);
	}
	// ask if they are having fun
	public void fun(String Y)
	{
		System.out.println(Y);
	}
	
	// call in the main method
	@SuppressWarnings("unused")
	public static void main(String [] args)
	{
		CreatingObjPrac hi = new CreatingObjPrac();
		
		hi.hello();
	
		
		Scanner n = new Scanner(System.in);
		
		// take name
		System.out.print("please state your name: ");
		String yourName= n.nextLine();
		System.out.println();
		
		//n.displayName(whatisyourname);
		// 
		hi.displayName("Welcome to CS101, " + yourName+ "\n");
		// System.out.println();
	
		System.out.print("Are you having fun?(yes/no): ");
		String f = n.nextLine();
		System.out.println();
		
		
		if(f == "yes"){
			System.out.println("we're so excited for you.");
		}
		
		else{
			System.out.println("keep trying");
			}
		
		System.out.println();
		
		//Gradebook gb = 
		
	//	gb.displayMessage();

		
	}
	
}
