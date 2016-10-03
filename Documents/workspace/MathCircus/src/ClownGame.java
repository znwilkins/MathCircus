
import java.util.Scanner;

/**
 * This class contains the ClownGame class.
 * It is a textual version of the standing
 * clowns game from M*A*T*H*S Circus.
 * @author Zachary Wilkins
 */
public class ClownGame {
	
	/**
	 * This method prints the current game board.
	 * @param arr the clowns in game
	 */
	public static void printGame(Clown[] arr){
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < arr.length; ++i){
			sb.append(arr[i].toString());
		}
		
		sb.append("\n");
		System.out.print(sb.toString());
	}
	
	/**
	 * This method determines if the game has been
	 * won by checking the status of each clown.
	 * @param arr the clowns in game
	 * @return true, iff every clown is standing
	 */
	private static boolean isComplete(Clown[] arr){
		for(int i = 0; i < arr.length; ++i){
			if (!arr[i].isStanding())
				return false;
		}
		return true;
	}
	
	/**
	 * The main method, where the program runs from.
	 * @param args arguments, not used
	 */
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Clown[] arr = new Clown[8];
		
		arr[0] = new BucketClown(0);
		arr[1] = new FireClown(1);
		arr[2] = new StickClown(2);
		arr[3] = new BucketClown(3);
		arr[4] = new StickClown(4);
		arr[5] = new FireClown(5);
		arr[6] = new FireClown(6);
		arr[7] = new LadderClown(7);
		
		System.out.println("Make all the clowns stand up.\n");
		printGame(arr);
		
		while(!isComplete(arr)){
			try{
				int cmd = Integer.parseInt(keyboard.next());
				cmd--;
				if(arr[cmd].isStanding()){
					arr[cmd].sitDown(arr);
				}
				else
					arr[cmd].standUp(arr);
			}
			catch(NumberFormatException excep){
				System.out.print("Incorrect input!\n");
			}
			finally{
				printGame(arr);
			}
		}
		
		keyboard.close();
		System.out.println("You won!");
	}
}
