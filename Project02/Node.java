package Project02;
public class Node<E> {


private E info;          //Variable that contains the node's element.
private Node<E> oldNode;// Variable that stores reference to the old node.
private Node<E> newNode;// Variable that stores reference to the new node.

/**
*Constructor
* It creates a node
*/
public Node() {
info = null;
oldNode = null;
   newNode = null;
}
/**
* Constructor
* @param Makes a reference to info to save it inside a node.
*/
    public Node(E info) {
this(info, null, null);
}
    /**
     * Class constructor
     * @param Makes a reference to info to save it inside a node.
     * @param oldNode is reference to the old node.
     * @param newNode reference to the new node.
     */
public Node(E info, Node<E> oldNode, Node<E> newNode) {
this.info = info;
this.oldNode = oldNode;
this.newNode = newNode;
}
/**
* Returns info stored back into the node
* @return Returns and stores info
*/
public E getElement() {
return this.info;
}
/**
* Makes a reference to info to save it inside a node.
* @return Returns the reference to the old node.
*/
public Node<E> getoldNode() {
return this.oldNode;
}
/**
* Returns the reference to the new node
* @return This returns the reference to the new node
*/
public Node<E> getnewNode() {
return this.newNode;
}
/**
* It changes the info inside the node.
* @param info This changes the info within the node.
set
public void setElement(E info) {
this.info = info;
}
/**
*  Makes a reference to info to save it inside a node.
* @param oldNode  Makes a reference to info to save it inside a node.
*/
public void setoldNode(Node<E> oldNode) {
this.oldNode = oldNode;
}
/**
* Makes a reference to info to save it inside a new node.
* @param newNode Sets a new reference to the new node.
*/
public void setnewNode(Node<E> newNode) {
this.newNode = newNode;
}

}