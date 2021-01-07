package lab05;

public class Tester {
	//testing for SortedBinarySet
	public static void main(String[] args) {
	       // TODO Auto-generated method stub
		SortedBinarySet set = new SortedBinarySet();
			
		System.out.println("TESTING THE EMPTY METHOD");
		if(set.empty()==false) {
		System.err.println("TEST FAILED--full list : SortedBinarySet: empty()");
		}
	
		System.out.println(set.toString());
		
		System.out.println("TESTING FOR INSERT METHOD 1");
		
		set.insert(2);
		set.insert(4);
		set.insert(5);
		set.insert(7);
		set.insert(10);
		System.out.println(set.toString());
			
			
		System.out.println("TESTING FOR CLEAR METHOD");
		set.clear();
		System.out.println(set.toString());
		
		
		//RE-ADDING ELEMENTS TO LIST
		set.insert(2);
		set.insert(4);
		set.insert(5);
		set.insert(7);
		set.insert(10);
		
		System.out.println("TESTING FOR INSERT METHOD (44)");
		if(set.insert(44) == false) {
		System.err.println("TEST FAILED-- the value is already in the list : SortedBinarySet: insert()");
		}
		System.out.println(set.toString());
		
		
		System.out.println("TESTING FOR REMOVE METHOD (7)");
		
		if(set.remove(7)==false) {
		System.err.println("TEST FAILED-- the value was not deleted : SortedBinarySet: remove()");
		}
		System.out.println(set.toString());
		
		
		System.out.println("TESTING FOR REMOVE METHOD (5)");
		
		if(set.remove(5)==false) {
		System.err.println("TEST FAILED-- the value was not deleted : SortedBinarySet: remove()");
		}
		System.out.println(set.toString());
		
	    
		
		
		System.out.println("TESTING FOR CONTAINSALL METHOD ");
		if(set.usesBinarySearch==true) {
		double [] tester = new double [] {2.0,4.0,5.0,10.0,44.0};
		System.out.println("does it contain the elements? \n" + set.containsAll(tester) + "\n");
		
		System.out.println("TESTING FOR CONTAINS METHOD ");
		
		System.out.println("Does this list contain 2?");
		System.out.println(set.contains(2.0) + "\n");
		}
		
		//TESTING TIME COMPLEXITY
		System.out.println("WHICH IS FASTER?");
		for (int i=0;i<10001;i++) {
		set.insert(i);	
		}
		//System.out.println(set.toString());
		
		System.out.println("time in nanoseconds: " + System.nanoTime() + " ns");
		
			
			
		
	

	
		
		
		System.out.println("\n TESTING DONE!");
	}
}


			

		

	
	
		
		
	

	
		
		
		

	
	




