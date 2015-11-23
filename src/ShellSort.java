public class ShellSort extends Helper {

	public ShellSort(int[] a) {
		super.setArray(a);
	}
	
	public void sort() {
		int divide = super.getLen()/2, c=0,i=0;
		int[] v = super.getArray();
		
		while(divide >= 1) {
			i = divide;
			while( c>0) {
				
				if(v[divide] < v[c]) {
					v[i] = v[c];
					c=i-divide;
					i=c;
				}
				
				i += divide;
			}
			divide = divide/2;
		}
	}
}
