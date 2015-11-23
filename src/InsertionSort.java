import java.util.ArrayList;

public class InsertionSort extends Helper {

private ArrayList<Integer> v = new ArrayList<Integer>();

	public InsertionSort(int[] a) {
		
		for(int all:a) {
			v.add(all);
		}
	}
	
	public void sort() {
		
		boolean sorted = false; int c = 0;
		
		for( int i=1; i<v.size(); i++) {
			
			while( v.get(i) < v.get(c) && !sorted) {
				c--; 
				//c = (c < 0) ? 0:i;
				System.out.println("I:" + i);
				System.out.println("C:" + c);
				if(c==0 || v.get(i) > v.get(c)) {
					v.add(c,v.get(i));
					v.remove(i);
					sorted = true;
				}
			}
			c=i;
		}
	}
	
	public void display() {
		for(Integer a:v) {
			System.out.print(a);
		}
	}
}
