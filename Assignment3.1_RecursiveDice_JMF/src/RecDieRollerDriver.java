/**
* This class is used to roll dice from the RecDieRoller class, taking input from a scanner class to determine which method is used
* RecDieRollerDriver.java
* @version 10/06/2022
* @author James Frayser
*/
import java.util.Scanner;
public class RecDieRollerDriver {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan =  new Scanner(System.in);
		System.out.println("Press A to roll until you hit 1:\nPress B to roll 1000 times and see how many times it hits 1:  ");
		String input = scan.nextLine();
		if(input.equals("A"))
		{
			RecDieRoller.roll();
		}
		if(input.equals("B"))
		{
			RecDieRoller.thousand();
		}

    }//end main
}//end class
