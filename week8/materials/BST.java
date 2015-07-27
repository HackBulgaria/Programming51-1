package BST;

public class BST <T extends Comparable<T>> {
	private Node<T> root;
	
	public BST() {
		root = null;
	}
	
	public boolean empty() {
		return root == null;
	}
	
	public void add(T data) {
		if(empty()) {
			root = new Node<T>(data); // Случай че дървото е празно
		} else {
			if(data.compareTo(root.data) < 0 ){
				// Добавяме в ляво
				if(root.left == null) {
					root.left = new Node<T>(data);
				} else {
					addRecursive(data, root.left);
				}
			} else {
				// Добавяме в дясно
				if(root.right == null) {
					root.right = new Node<T>(data);
				} else {
					addRecursive(data, root.right);
				}
			}
		}
	}
	
	private void addRecursive(T data, Node<T> root) {
		if(data.compareTo(root.data) < 0) { // Проверка дали data е по-малко
			// Ще добавяме в ляво
			if(root.left == null) {
				root.left = new Node<T>(data);
			} else {
				addRecursive(data, root.left);// Добавяме в лявото поддърво
			}
		} else {
			// Ще добавяме в дясно
			if(root.right == null) {
				root.right = new Node<T>(data);
			} else {
				addRecursive(data, root.right); // Добавяме в дясното поддърво
			}
		}
	}
	
	private String toStringRecursive(Node<T> root) {
		if(root == null) return "";
		String str = "";
		str += toStringRecursive(root.left);
		str += root.data + " ";
		str += toStringRecursive(root.right);
		return str;
	}
	
	public String toString() {
		String str = "";
		str += toStringRecursive(root);
		return str;
	}
	
	
}