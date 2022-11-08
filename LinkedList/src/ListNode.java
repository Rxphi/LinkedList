
public class ListNode {
	int data;
	ListNode next;
	
	// Constructor
	ListNode (int x, ListNode node){
		data = x;
		next = node;
	}
	// Constructor
	ListNode (int x){
		this(x, null);
	}
	// Constructor
	ListNode () {
		this (0);
	}
}
