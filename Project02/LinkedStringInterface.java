package Project02;

public interface LinkedStringInterface {
/**
 * Return the value of char at the requested value
 * @param num The location of char
 * @return WHere the char stores in the input. 
 * @throws LinkedStringOutofBoundsException
 * @throws LinkedStringException
 */
	public char charAt(int num) throws LinkedStringOutofBoundsException;
	/**
	 * Combine a linked string that is specific to the end of the linked string.
	 * @param 
	 */
	public LinkedString concat(LinkedString str) throws LinkedStringEmptyException;
	/**
	 * Returns true if the linked string is 0, and only if its 0.
	 * @return Returns true if its empty
	 */
	public boolean isEmpty();
	/**
	 * The length of the linked string is returned
	 * @return
	 */
	public int length();
	/**
	 * A new linked link string is returned.
	 * @param startnum
	 * @param endnum
	 * @return
	 * @throws LinkedStringOutofBoundsException if list is empty
	 * @throws LinkedStringEmptyException
	 */
	public LinkedString substring(int startnum, int endnum) throws LinkedStringEmptyException;
	
}
