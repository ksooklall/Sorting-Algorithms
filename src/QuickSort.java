public class QuickSort extends Helper {

	/* Constructs an array
	 * 
	 * @param a the unsorted array
	 */
	
	public QuickSort(int[] a ) {
		super.setArray(a);
	}
	
	public void sort() {
		
		boolean rightSorted = false;
		int len = super.getLen();
		int[] v = super.getArray();
		int wall = 0;
		int pivot = v[len-1];
		
		//Initial sort then right side sort
		
		while(!rightSorted) {
			rightSorted = true;
			
			for( int i =wall; i<len; i++) {
				if(v[i] < pivot) {
					super.swap(wall, i);
					wall++;
					rightSorted = false;
					super.display();
				}
			} 
//			System.out.println("The wall is at: "+wall);
			super.swap(len-1, wall); pivot = v[len-1]; wall++; super.display();
//			System.out.println("The pivot is at: "+pivot);
//			System.out.println("The wall is at: " +wall);
		}
		
		//Sort left side of wall
		
		/*for( int i =0; i<wall; i++) {
			if(v[i] < pivot) {
				super.swap(wall, i);
				wall++;
				rightSorted = false;
				super.display();
			}
		}*/
		
	}
}
