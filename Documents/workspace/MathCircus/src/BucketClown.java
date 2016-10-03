/**
 * The BucketClown throws a bucket
 * of water when he stands up, forcing
 * the clown to the right to sit down.
 * @author Zachary Wilkins
 */
public class BucketClown extends Clown {

	public BucketClown(int position) {
		super(position);
	}

	public Clown[] standUp(Clown[] arr) {
		standing = true;
		// If it's farthest to the right, do nothing.
		if(position == arr.length - 1){}
		// If not, make the clown to the right sit down.
		else{
			arr = arr[position + 1].sitDown(arr);
		}
		
		return arr;
	}

	public String toString(){
		if(standing)
			return "S";
		else
			return "B";
	}
}
