import javax.swing.JOptionPane;
public class Dialogbox {

	public static void main(String[]args){
			
			String numString;
			int numb;
			String inZone= "Enter";
			String noZone = "Get in the zone ASAP";
			
			//even though the user enters what appears to be a number it is real a String/Text into
			// a component (Textbox) that takes only text
			numString = JOptionPane.showInputDialog("Enter 1 if you are in the Java Zone or 0 otherwise ");
			
			//here you convert String to an Integer- don't need to memorize this
			numb = Integer.parseInt(numString);
			
			//System.out.println(numb);
			JOptionPane.showMessageDialog(null, numb);
			
		}

	}

