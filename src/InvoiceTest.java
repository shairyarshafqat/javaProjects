import java.util.Scanner;

public class InvoiceTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// create a scanner object
		Scanner input = new Scanner(System.in);
		
		//System.out.println("Enter an item: ");
		//String item = input.nextLine();
		
		// create an invoice object
		Invoice store = new Invoice("001232", "Shower gel", 1, 5.07);
		
		System.out.println("Store Invoice");
		System.out.println("Item number: "+store.getPartNumber());
		System.out.println("Item description: "+store.getPartDescription());
		System.out.println("item quantity: "+store.getQuantity());
		System.out.println("item price: "+store.getPricePerItem());
		
	}

}
