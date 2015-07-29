package BST;

import java.util.LinkedList;
import java.util.List;

public class BST<T extends Comparable<T>> {
	private Node<T> root;

	public BST() {
		root = null;
	}

	public boolean empty() {
		return root == null;
	}

	public void add(T data) {
		if (empty()) {
			root = new Node<T>(data); // Случай че дървото е празно
		} else {
			if (data.compareTo(root.data) < 0) {
				// Добавяме в ляво
				if (root.left == null) {
					root.left = new Node<T>(data);
				} else {
					addRecursive(data, root.left);
				}
			} else {
				// Добавяме в дясно
				if (root.right == null) {
					root.right = new Node<T>(data);
				} else {
					addRecursive(data, root.right);
				}
			}
		}
	}

	private void addRecursive(T data, Node<T> root) {
		if (data.compareTo(root.data) < 0) { // Проверка дали data е по-малко
			// Ще добавяме в ляво
			if (root.left == null) {
				root.left = new Node<T>(data);
			} else {
				addRecursive(data, root.left);// Добавяме в лявото поддърво
			}
		} else {
			// Ще добавяме в дясно
			if (root.right == null) {
				root.right = new Node<T>(data);
			} else {
				addRecursive(data, root.right); // Добавяме в дясното поддърво
			}
		}
	}

	private String toStringRecursive(Node<T> root) {
		if (root == null)
			return "";
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

	public T findSmallest() {
		return findSmallestRecursive(root);
	}

	private T findSmallestRecursive(Node<T> root) {
		if (root.left == null) {
			return root.data;
		} else {
			return findSmallestRecursive(root.left);
		}
	}

	public T findSmallest2() {
		Node<T> current = root;
		while (current.left != null) {
			current = current.left;
		}
		return current.data;
	}

	public void printLevel(int level) {
		printLevelRecursive(level, root, 1);
	}

	private void printLevelRecursive(int level, Node<T> root, int counter) {
		if (root == null) {
			return;
		}
		if (level == counter) {
			System.out.print(root.data + " ");
		} else {
			printLevelRecursive(level, root.left, counter + 1);
			printLevelRecursive(level, root.right, counter + 1);
		}
	}
	
	public int getLevel() {
		return getLevelRecursive(root);
	}
	
	private int getLevelRecursive(Node<T> root) {
		if(root == null) {
			return 0;
		}
		int left = getLevelRecursive(root.left);
		int right = getLevelRecursive(root.right);
		
		if(left < right) return right + 1;
		return left + 1;
	} 
	

	

	
	public void clear() {
		root = null;
	}
	
	public int getHeight() {
		return getHeightRecursive(root);
	}
	
	public int getHeightRecursive(Node<T> root) {
		if(root == null) { 
			return 0;
		}
		int left = getHeightRecursive(root.left);
		int right = getHeightRecursive(root.right);
		if(left < right) {
			return right + 1;
		}
		return left + 1;
	}
	
	public void balance() {
		LinkedList<T> l = toList();
		clear();
		balanceRecursive(l);
	}

	public LinkedList<T> toList() {
		LinkedList<T> l = new LinkedList<>();
		toListRecursive(root, l);
		return l;
	}

	private void toListRecursive(Node<T> root, LinkedList<T> l) {
		if(root == null) return;
		toListRecursive(root.left,l);
		l.add(root.data);
		toListRecursive(root.right,l);
	}

	private void balanceRecursive(List<T> l) {
		if(l.isEmpty())return;

		int size = l.size();
		int middle = size/2;
		if(size == 1) {
			add(l.get(0));
			return;
		}
		
		add(l.get(middle));
		balanceRecursive(l.subList(0, middle));
		balanceRecursive(l.subList(middle + 1, size));
	}
}