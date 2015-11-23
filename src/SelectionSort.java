public class SelectionSort extends Helper {

	public SelectionSort( int[] a) {
		super.setArray(a);
	}
	
	public void sort() {
		
		int[] v = super.getArray();
		
		for( int i =0; i<v.length-1; i++) {
			int current = super.getMinIndex(i);
			
			super.swap(current,i);
			super.display();
		}
	}
}
