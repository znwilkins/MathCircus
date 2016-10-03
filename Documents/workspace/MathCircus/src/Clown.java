/**
 * This abstract class defines a basis
 * for all other clowns to extend from.
 * @author Zachary Wilkins
 */
public abstract class Clown {
	/** This field stores the clown's status. */
	protected boolean standing;
	/** This field stores the clown's position. */
	protected int position;
	
	/**
	 * This constructor initializes a clown to be
	 * sitting at a specified position.
	 * @param position the clown's spot in order
	 */
	public Clown(int position){
		standing = false;
		this.position = position;
	}
	
	/**
	 * This method gets the position of the clown
	 * @return the position of the clown, an integer
	 */
	public int getPosition(){
		return position;
	}
	
	/**
	 * This method stands the clown up, with
	 * implementation specified by each subclass.
	 * @param arr the clowns in game
	 * @return the clowns in game
	 */
	public abstract Clown[] standUp(Clown[] arr);
	
	/**
	 * This method sits a clown down, and
	 * is universal amongst subclasses.
	 * @param arr the clowns in game
	 * @return the clowns in game
	 */
	public Clown[] sitDown(Clown[] arr) {
		standing = false;
		return arr;
	}
	
	/**
	 * This method is used to change a clown's
	 * status without invoking their side effect.
	 * @param arr the clowns in game
	 * @return the clowns in game
	 */
	public Clown[] swapStance(Clown[] arr){
		if(standing){
			standing = false;
			return arr;
		}
		else{
			standing = true;
			return arr;
		}
	}
	
	/**
	 * This method determines if a clown is
	 * standing.
	 * @return true, iff the clown is standing
	 */
	public boolean isStanding(){
		return standing;
	}
}
