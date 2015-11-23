public class CocktailSort extends Helper {
	
	public CocktailSort(int[] a ) {
		super.setArray(a);		
	}
	
	public void sort() {
		
		boolean sorted = false;

		int[] v = super.getArray();
		int len = v.length;
		
		while(!sorted) {
			
			sorted = true;
			for( int i =0; i<len-1; i++) {
				
				if( v[i] > v[i+1]) {
					
					super.ascendingSwap(i);
					super.display();
					sorted = false;
				}
				
			}
			
			for( int j = len-2; j>1; j--) {
				if(v[j] < v[j-1]) {
					super.decendingSwap(j);
					super.display();
				}
			}
			
		}
		
	}
	
	
}
