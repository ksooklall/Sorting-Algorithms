import java.util.Arrays;

public class MergeSort extends Helper {

	/* Constructs an array
	 * 
	 * @param a the unsorted array
	 */
	
	public MergeSort( int [] a) {
		super.setArray(a);
	}
	
	/* Sorts array into ascending order */
	
	public void sort() {
		int[] v = super.getArray();
		
		int l=v.length/2, r=v.length-l, li=0, ri=0,si=0;
		int[] lv = Arrays.copyOfRange(v,0,l), rv = Arrays.copyOfRange(v, l, v.length);
		super.display(lv); super.display(rv);
		int[] sA = new int[v.length];
		boolean sorted = false;
		
		while(!sorted) {
			sorted = true;
			if((li < l) && (lv[li] < rv[ri]) ) { sA[si] = lv[li]; li++; si++; sorted = false;}  
			else if(ri < r) { sA[si] = rv[ri]; ri++; si++; sorted = false;}
		}
		
		super.display(sA);
		
	}
}

