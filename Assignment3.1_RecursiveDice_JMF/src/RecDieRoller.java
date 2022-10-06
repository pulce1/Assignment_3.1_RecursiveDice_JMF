/**
* This class is used to roll dice, whether to roll until a certain number, or roll 1000 times
* RecDieRoller.java
* @version 10/06/2022
* @author James Frayser
*/
public class RecDieRoller {

	/**
	 * methods
	 */
	static int sides = 6; 
	static int result;
	static int times = 1000;
	int rolls;
	static int res[] = new int[6];
	
	/**
	 * empty argument constructor
	 */
	public RecDieRoller()
	{
		sides = 6;
		result = 0;
		times = 1000;
	}
	
	/**
	 * Rolls a die, and if it doesn't hit 1, it rolls again, displaying the result
	 * @return int result, calling the program until it hits 1
	 */
	public static int roll()
	{
		result = (int) (Math.random() * sides) +1;
		while(result != 1)
		{
			System.out.println(result + ", Roll again");
			return roll();
		}
		System.out.println("The result is 1!: " +result);
		return result;
	}
	/**
	 * rolls a die 1000 times, counting how many times it hits 1, and displaying the mean amount of times it takes to roll a 1
	 * @return the number of times 1 is hit, and the mean number of rolls it takes
	 */
	public static int thousand()
	{
		System.out.println("Number of rolls: "+ times);
		for(int i=0; i<times; i++)
		{
			result = (int) (Math.random() * sides) +1;
			res[result-1]++;
		}
		
			for(int i=0; i<=0; i++)	
			{
				System.out.println("Number of times " + (i + 1) +  " was rolled =  "+ res[i]);
				System.out.println("The mean number of times it takes to roll a 1 is: " + (times/res[i]));
			}
		
		return result;
	}
}
