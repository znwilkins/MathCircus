/**
 * The BoringClown does nothing when
 * he stands up, and exists solely
 * for testing purposes.
 * @author Zachary Wilkins
 */
public class BoringClown extends Clown {

	public BoringClown(int position) {
		super(position);
	}

	public Clown[] standUp(Clown[] arr) {
		standing = true;
		return arr;
	}

	public String toString(){
		if(standing)
			return "S";
		else
			// Z as in Zzzzz...
			return "Z";
	}
}
