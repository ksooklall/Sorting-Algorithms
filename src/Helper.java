public class Helper {

	private int[] v;
	
	/* Displays all elements in the array v	 */
	public void display() {
		
		for(int c:v){
			System.out.print(c + " ");
		}
		
		System.out.println();
	}
	
	/* Displays all elements in an Array */
	public void display(int [] sA) {
		
		for(int c:sA){
			System.out.print(c + " ");
		}
		
		System.out.println();
	}
	
	/* Sets Array v to a for all subclasses 
	 * 
	 * @param a the unsorted array
	 */
	public void setArray(int[] a) {
		
		this.v = a;
	}
	
	
	/* Gets the array
	 *  
	 *  @return the array v
	 */
	
	public int[] getArray() {
		
		return v;
	}
	
	/* Swaps consecutive values in an array
	 * 
	 * @param array to obtain
	 * @param index starting index
	 */
	
	public void ascendingSwap(int index) {
		
		int temp = v[index+1];
		v[index+1] = v[index];
		v[index] = temp;
	}
	
	/* Swaps current and previous value in an array
	 * 
	 * @param array to obtain
	 * @param index starting index
	 */
	
	public void decendingSwap(int index) {
		
		int temp = v[index-1];
		v[index-1] = v[index];
		v[index] = temp;
	}
	
	public int getLen() {
		return v.length;
	}
	
	/* Gets the index of the minimum element
	 * 
	 * @param start where to begin searching 
	 * @return the index of the minimum element
	 */
	
	public int getMinIndex(int start) {
		int min = v[start];
		int index =0;
		for(int i =start; i<v.length; i++) {
			
			if(v[i] < min) {
				min = v[i];
				index = i;
			}
		}
		return index;
	}
	
	/* Gets the index of the maximum element
	 * 
	 * @param start where to begin searching 
	 * @return the index of the maximum element
	 */
	
	public int getMaxIndex(int start) {
	int max = v[start];
	int index = 0;
		
		for(int i =start; i<v.length; i++) {
			
			if(v[i] > max) {
				max = v[i];
				index = i;
			}
		}
		return index;
	}
	
	/*
	 * Swaps two values in array v
	 * 
	 * @param firstIndex the firstIndex
	 * @param secondIndex the secondIndex
	 */
	
	public void swap( int firstIndex, int secondIndex) {
		
		int temp = v[firstIndex];
		v[firstIndex] = v[secondIndex];
		v[secondIndex] = temp;
		
	}
}
	
