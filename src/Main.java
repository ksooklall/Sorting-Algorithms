public class Main {
	
	public static void main(String[] args) {
		
		int[] test = {1,3,5,6,2,4,7,9};
		
		/*System.out.println("This is BubbleSort:");
		BubbleSort bubble = new BubbleSort(test);
		bubble.display();		
		bubble.sort();*/
		
		/*System.out.println(); 
		System.out.println("This is BidirectionalBubbleSort: "); 
		
		BidirectionalBubbleSort doubleBubble = new BidirectionalBubbleSort(test);
		doubleBubble.display();
		doubleBubble.sort();*/
		
		InsertionSort insert = new InsertionSort(test);
		insert.display();
		insert.sort();
		
		System.out.println(); 
		System.out.println("This is SelectionSort: ");
		insert.display(); 
		
		/*SelectionSort selection = new SelectionSort(test);
		selection.display();
		selection.sort();*/
		
		/*System.out.println(); 
		System.out.println("This is MergeSort: ");
		
		MergeSort merge = new MergeSort(test);
		merge.display();
		merge.sort();*/
		
		/*System.out.println("This is QuickSort: ");
		
		QuickSort quick = new QuickSort(test);
		quick.display();
		quick.sort();*/
		
	}

}
