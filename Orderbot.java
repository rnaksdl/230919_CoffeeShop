import java.util.Scanner;

public class Orderbot {
    public static void main(String args) {
        
		Scanner scnr = new Scanner(System.in);
		String userInput;
		System.out.println("Hi, welcome to Leefy coffy.");
        System.out.println("Would you like to order?");
		userInput = scnr.nextLine();
		
		
		

    }

	public static boolean yes_or_no(String userInput) {
		if (userInput.charAt(0) == 'Y' || userInput.charAt(0) == 'y') {
			return true;
		}
		return false;
	}
}