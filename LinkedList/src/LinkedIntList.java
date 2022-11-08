
public class LinkedIntList {
	public ListNode front;
	
	public LinkedIntList() {
		front = null;
	}
	
	public LinkedIntList(int[] arr) {
		if (arr == null || arr.length == 0) {
			front = null;
			return;
		}
		
		ListNode current = new ListNode(arr[0]);
		front = current;
		
		for (int i = 1; i < arr.length; i++) {
			current.next = new ListNode(arr[i]);
			current = current.next;
		}
	}
	
	public void add(int value) {
		if (front == null) {
			front = new ListNode(value);
			return;
		}
		
		
	}
	
	public void add(int value, int index) {
		
	}
	/*
	public int remove() {
		
	}
	 
	public int remove(int index) {
		
	}
	
	public int[] toArray() {
		
	}
	
	public int getValue(int index) {
		
	}
	
	public int indexOf(int value) {
		
	}
	
	public int length() {
		
	}
	*/
	
	public String toString() {
		if (front == null) {
			return "null";
		}
		
		String out = "";
		
		ListNode current = front;
		
		while (current != null) {
			out += current.data + " ";
			current = current.next;
		}
		return out;
	}
	
	public void printMe() {
		System.out.println(toString());
	}
}
