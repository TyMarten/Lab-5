import java.util.Scanner;

/**
 * 
 */

/**
 * @author t.marten
 *
 */
public class Part2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		int[] userNum = new int[10];
		int userSer;
		int index = 0; 
		
		
		// the user inputs numbers into the array
		for(int i = 0; i < userNum.length; i++){
			System.out.println("What Number would you like to input into the array.");
			userNum[i] = userInput.nextInt();
		}
		
		// get the users number that they would like to search
			System.out.println("What number would you like to check the number of times that shows in the array.");
			userSer = userInput.nextInt();
		
		// checks to see if the the number the user searched for is in the array if it is then change the index to add one every time it is shown in the array 	
		for(int i = 0; i < userNum.length; i++){
		
		if(userNum[i] == userSer){
			index ++;
			
		}
		}
		// if there is that number in the array display how many times it shows up in the array
		if(index > 0){
			System.out.println("That number shows up " + index + " times in the array.");
		}
		// if the number the user inserted into the array then be cheeky about them screwing up 
		if(index == 0){
			System.out.println("Really you put the numbers into the array and you manged to ask for a number that isnt there -_-");
		}
		userInput.close();
	}
}
