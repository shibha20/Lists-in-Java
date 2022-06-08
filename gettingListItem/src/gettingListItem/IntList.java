package gettingListItem;

public class IntList {
	public int first;
	public IntList rest;
	
	public IntList(int f, IntList r) {
		first =f;
		rest =r;
	}
	
	public int size() {
		if (rest == null) {
			return 1;
		}
		return 1+this.rest.size();
	}
	
	//loop through multiple instances of IntList
	public int getItem(int i) {	
		//returns the data once the loop finally reaches the last list
		if (i==0) {
			return first;
		}else{
			return rest.getItem(i-1);
		}
	}
}