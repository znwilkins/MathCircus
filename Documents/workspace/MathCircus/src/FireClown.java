/**
 * The FireClown holds a fire extinguisher,
 * which knocks down every other clown
 * standing to his left.
 * @author Zachary Wilkins
 */
public class FireClown extends Clown {

	public FireClown(int position) {
		super(position);
	}

	public Clown[] standUp(Clown[] arr) {
		standing = true;
		// If it's farthest to the left, do nothing.
		if(position == 0){}
		// If not, make all clowns to the left sit down.
		else{
			for(int i = position - 1; i >= 0; --i){
				arr = arr[i].sitDown(arr);
			}
		}
		
		return arr;
	}

	public String toString(){
		if(standing)
			return "S";
		else
			return "F";
	}
}
