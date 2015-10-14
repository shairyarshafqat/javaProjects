// Create a class called Invoice that a hardware store might use to represent
// an invoice for an item sold at the store.

public class Invoice {

	private String partNumber;
	private int quantity;
	private String partDescription;
	private double PricePerItem;
	
	// Invoice Constructor
	public Invoice(String partNumber, String description, int count, double cost)
	{
		this.partNumber = partNumber;
		this.partDescription = description;
		if ( count > 0 ) // determine whether count is positive
	         quantity = count;
		if ( cost > 0.0 ) // determine whether price is positive
	         PricePerItem = cost; 
	}
	// four piece of info as instance variable
	// a part number(type String)
	
	// set method for partNumber
	public void setPartNumber(String number)
	{
		this.partNumber = number;
	}
	
	// get method for partNumber
	public String getPartNumber()
	{
		return partNumber;
	}
	
	// set description(type String)
	public void setPartDescription(String type)
	{
		this.partDescription = type;
	}
	// get description
	public String getPartDescription()
	{
		return partDescription;
	}
	
	// a quantity of a item being purchased(type int)
	public void setQuantity(int count)
	{
		if(count > 0)
			quantity = count;
		if(count <= 0)
			quantity = 0;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	// a price per item(type double)
	public void setPricePerItem(double cost)
	{
		 if ( cost > 0.0 ) // determine whether price is positive
	           PricePerItem = cost; // valid price assigned to pricePerItem

	      if ( cost <= 0.0 ) // determine whether price is zero or negative
	         PricePerItem = 0.0;
	}
	// provide a set and get method for each instance variable
	public double getPricePerItem()
	{
		return PricePerItem;
	}
	
	public double getInvoiceAmount(double quantity, double price)
	{
		return getQuantity() * getPricePerItem();
		
	}
	
	// provide a method named getInvoiceAmount that calculates the invoice amount and returns the amount in double
	
}	










