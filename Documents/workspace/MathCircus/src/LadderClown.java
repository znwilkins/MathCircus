/**
 * The LadderClown knocks the clowns
 * on his immediate left and right down.
 * @author Zachary Wilkins
 */
public class LadderClown extends Clown {

	public LadderClown(int position) {
		super(position);
	}

	public Clown[] standUp(Clown[] arr) {
		standing = true;
		
		if(position == 0)
			arr = arr[1].sitDown(arr);
		else if(position == arr.length - 1)
			arr = arr[arr.length - 2].sitDown(arr);
		else{
			arr = arr[position + 1].sitDown(arr);
			arr = arr[position - 1].sitDown(arr);
		}
		
		return arr;
	}

	public String toString(){
		if(standing)
			return "S";
		else
			return "L";
	}
}
