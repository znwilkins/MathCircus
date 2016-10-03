/**
 * The StickClown forces the clowns
 * on his immediate right and left to
 * swap their stance.
 * @author Zachary Wilkins
 */
public class StickClown extends Clown {
	
	public StickClown(int position) {
		super(position);
	}

	public Clown[] standUp(Clown[] arr) {
		standing = true;
		
		if(position == 0)
			arr = arr[1].swapStance(arr);
		else if(position == arr.length - 1)
			arr = arr[arr.length - 2].swapStance(arr);
		else{
			arr = arr[position + 1].swapStance(arr);
			arr = arr[position - 1].swapStance(arr);
		}
		
		return arr;
	}

	public String toString(){
		if(standing)
			return "S";
		else
			return "$";
	}
}
