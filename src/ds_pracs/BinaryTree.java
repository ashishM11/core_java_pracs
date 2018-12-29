/*
	Why Use Trees ?
	1.Searching, Insertion and Deletion items quickly in a tree.
	2.ordered Array are bad at Insertion / Deletion
	3.Finding Items in LinkedList is slow
	4.Time needed to perform an operation on a tree is O(log N).
	5.On average a tree is more efficient if you need to perform many different types of operations. 
*/
package ds_pracs;

public class BinaryTree {

	Node root;

	public void addNode(int key, String value) {
		Node newNode = new Node(key, value);
		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;
			while (true) {
				parent = focusNode;
				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;
					if(focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
				}else {
					focusNode  = focusNode.rightChild;
					if(focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}

		}
	}

	public static void main(String[] args) {

	}

}

class Node {

	int key;
	String value;

	Node leftChild;
	Node rightChild;

	Node(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public String toString() {
		return "My Key is " + key + " and My value is" + value;
	}

}
