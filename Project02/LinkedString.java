/* Primary constructor program file that creates various empty linked strings.
 * 
 * @author Athina Halkiadakis
 */ 

package Project02;

public class LinkedString<E> implements LinkedStringInterface {
private Node<Character> head; 
/**
 *  Variable used to store the head
 */
private int count; //Variable to maintain of LinkedString length
/**
 * Constructor
 * created an empty LinkedString
 */
public LinkedString() {
	this.head = null;
	this.count = 0;
	
}
/**
 * Constructor
 * Create a LinkedString from an ArrayType char
 * @param strArr receives a character; array type.
 * @throws LinkedStringEmptyException If the list is empty. 
 */
public LinkedString(String newString) throws LinkedStringEmptyException {
Node<Character> current = null; 
/**
 *  Sets node to empty for char value to be manipulated easily
 */
char[] currentArray =  new char[newString.length()];

/**
 *  Verifies that the new string is empty
 */
if(newString.equals(null)) {
	new LinkedStringEmptyException("This list is empty");
}
else {
/**
 * Adds a copy of each element conforming the string to the char array
 */
for(int k = 0; k < newString.length(); k++) {
currentArray[k] = newString.charAt(k);
}
new LinkedString(currentArray);
}

}

public LinkedString(char[] newArr)throws LinkedStringEmptyException{

//Checks if the char is empty or not
if(newArr.length == 0) 
	/**
	 *  newArr.length is the array's length
	 */
	 new LinkedStringEmptyException("The list is empty.");

else {
	Node <Character> current = null;
	Node <Character> temp = null;
   this.head = new Node<Character>(newArr[0]);
   /**
    * Current char is the head of the new array
    */
   current = this.head;
   /**
    * This.count is the Incremental operator.
    */
   this.count++; // Incremental operator

   /**
    * The for loop's condition and update are based on the length 
    * that the array holds for the values in the lists
    */
   for(int i = 1; i < newArr.length; i++) {
	   temp = new Node<Character>(newArr[i]);
	   current.setnewNode(temp);
	   temp.setoldNode(current);
	   current = temp;
	   this.count++;
   }
	}
}
/**
 * Function runs the lengths of the data values taken in by the current head of the node
 */
public char charAt (int pos) {
	Node<Character> current = this.head;
	/**
	 * Check for any checked and unchecked exceptions
	 */
	if((length() > 0) && (pos >= 0 || pos <= length() )) {
		for(int k = 0; k < pos; k++) {
			current = current.getnewNode();
		}
		return current.getElement();
	}
	else {
	new LinkedStringEmptyException("The list is empty.");
	}
	return 0;
		
	
}
/**
 * // Returns count of the length
 */
public int length() { 
	return this.count;
}
/**
 * Checks if head is empty
 */
public boolean isEmpty() { 
	if(this.length() == 0) {
		return true;
	}
	else {
		return false;
	}
}

/**
 * Creates indexes for the strings and exceptions for both the lists and indexes
 */
public LinkedString substring(int initialIndex, int finishIndex) throws LinkedStringEmptyException {
	String str = ""; // Empty string value to start so values can be taken in
	int index = 0; // Zero value for the index to start
	Node<Character> current = this.head;
	if(initialIndex < 0 || finishIndex > this.count) {
		new LinkedStringOutofBoundsException("This index is wrong.");
	}
		else if(isEmpty()) {
			new LinkedStringEmptyException("This list is empty.");
		}
			else {
			while(index <= finishIndex) {
				if(index >= initialIndex) {
					str+= Character.toString(current.getElement());
					index++;
				}
				current = current.getnewNode();  
				index++;
					
			}
				
		}
return new LinkedString(str); 
/**
 * New instance of the string
 */
}

public LinkedString concat(LinkedString j) throws LinkedStringEmptyException {
	String temp = "";
	Node<Character> current = this.head;
	if(this.count > 0 && j.length() > 0) {
		
		for(int i = 0; i < this.count; i++) {
	temp+= Character.toString(current.getElement());
	current = current.getnewNode();
		}
		for(int k = 0; k < j.length() ; k++) {
			temp+= Character.toString(j.charAt(k));
		}
	}
	else {
		new LinkedStringEmptyException("One or both link string are empty");
	}
	/**
	 * @returns new LinkedString
	 */
	return new LinkedString(temp);
}
	
	


}

