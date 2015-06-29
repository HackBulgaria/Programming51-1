package week4;

public class Vector<T> {
	private T[] data;
	private int size = 0;
	private int capacity = 10;

	public Vector() {
		data = (T[]) new Object[capacity];
	}

	public T get(int index) {
		return data[index];
	}

	public void set(int index, T el) {
		data[index] = el;
	}

	public void add(T el) {
		if(size == capacity){
			resize();
		}
		data[size] = el;
		size++;
	}
	
	public void insert(int index, T el){
		
	}
	
	public void remove(int index){
		
	}
	
	private void resize(){
		capacity = capacity * 2 + 1;
		T[] temp = (T[])new Object[capacity];
		for(int i=0;i<size;i++){
			temp[i] = data[i];
		}
		data = temp;
	}	
}