import java.util.Scanner;

/**
 * 
 */

/**
 * @author t.marten
 *
 */
public class Part3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		double[] userArray = new double[5];
		int index = 0;
		double max;
		
		System.out.println("Please insert an array, then the largest number will be given back to you.");
		
		for(int i = 0; i < userArray.length; i++){
			System.out.println("Please insert a number into the array.");
			userArray[i] = userInput.nextDouble();
			
		}
		
		max = userArray[0];
		
		for(int i = 0; i < userArray.length; i++){
			
			if(userArray[i] > max){
				max = userArray[i];
			}
			
		}	
		System.out.println("The Largest Number is " + max + ".");
		userInput.close();
	}

}
