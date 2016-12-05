import java.util.Scanner;

/**
 * 
 */

/**
 * @author t.marten
 *
 */
public class Part1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in); 
		double[] arraySearch = {1, 3, 5, 7, 9, 11};
		int index = -1;
		double searchNum;
		
		
		System.out.println("The Array: ");
		
		for(int i = 0; i < arraySearch.length; i++){
			
			System.out.print(arraySearch[i] + " ");
			
		}
		System.out.println("\n What value do you want the next index of?");
		searchNum = userInput.nextDouble();
		
		for( int i = 0; i < arraySearch.length; i++){
			
			if(arraySearch[i] == searchNum){
				index = i;
				
				
				
			}
			if(index == -1){
				System.out.println("The Number you searched the index of is not a valid number.");
			}
			else{
				System.out.println("The number you searched for was at the index of " + index + ".");
		
			}
		}
		

		userInput.close();
	}

}
