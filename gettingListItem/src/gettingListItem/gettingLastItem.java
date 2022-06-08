package gettingListItem;

public class gettingLastItem {

	public static void main(String[] args) {
		
		//creating a list in reverse order
		IntList L  = new IntList (15,null);
		L = new IntList (10,L);
		L = new IntList (7,L);
		L = new IntList (8,L);
	
		System.out.println("First Item " + L.getItem(0));
		System.out.println("Second Item " + L.getItem(1));
		System.out.println("Third Item " + L.getItem(2));
		System.out.println("Fourth Item " + L.getItem(3));

	}
	
}

