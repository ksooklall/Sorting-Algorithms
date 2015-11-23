public class BubbleSort extends Helper {

	
	public BubbleSort(int[] a) {
			super.setArray(a);
		}

		
	public void sort() {
		
		int [] v = super.getArray();
		
		boolean sorted = false;
		
		while(!sorted) {
			
			sorted = true;			
		for(int i = 0; i<v.length-1; i++) {
			
		if( v[i] > v[i+1]) {
			super.ascendingSwap(i);
			super.display();
			sorted = false;
			}
		}	
	}
}
}