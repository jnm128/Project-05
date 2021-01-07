package lab05;
public class SortedBinarySet {
	/** represent the simple array that holds the list values */
	public double[] theData;
	/** holds the length of the storage array */
	private int capacity;
	/** holds the number of elements in the list */
	private int size;

	/** constant for initial storage array capacity */
	private static final int INITIAL_STORAGE_CAPACITY = 11;

	/** keep this FALSE for lab; we will play with this in the assignment **/
	public boolean usesBinarySearch = true;

	/** default constructor */
	public SortedBinarySet(){
		theData = new double [INITIAL_STORAGE_CAPACITY];
		capacity = 11;
		size = 0;
	}

	public SortedBinarySet(double[] input){
		// TODO (for assignment, not lab)
		theData = new double [INITIAL_STORAGE_CAPACITY];
		capacity = 11;
		size = 0;
		for(int i=0;i<input.length;i++) {
			this.insert(input[i]);
		}
		
	}

	public boolean empty(){
	
		for (int i=0;i<this.capacity;i++) {
			if(theData[i] != 0) {
			return false;
			}
		}
		
		return true; 
	}

	public int size(){
		// TODO
		return this.size;
	}

	public void grow(){
		this.capacity= this.capacity*2;
		double [] temp= new double [capacity];
		//copy items from data to temp
		for (int i=0; i<this.size;i++) {
			temp[i] = theData[i];
		}
		theData=temp;
		 
	}

	public String toString(){
		// TODO
		String sentence=" ";
		sentence += "the elements in the list \n ";
		for (int i=0; i<theData.length;i++) {
			sentence += theData[i] + "\n ";
		}
		
		sentence += "the Capacity: "+ this.capacity + "\n";
		sentence += "the size of the array: "+ this.size +"\n";		
		   return sentence;
	   }
	

	public void clear() {
		
		for (int i=0;i<this.capacity;i++) {
			theData[i]=0;
		}
		this.size=0;
		
	}

	public boolean insert(double newVal){
		// TODO
		
			if(this.size+1==this.capacity) {
				grow();
			}
				int index= findIndex(newVal);
				if(index<0) {
					index=Math.abs(index)-1;
					
					for(int i = 0; i<this.capacity;i++) {
						double temp = theData[i];
						theData[i] = newVal;
						newVal = temp;
					}
				    this.size++;
				    return true;
				}
			
		
		return false;		
			
		
	}

	public boolean remove(double element){ //not working 
		// TODO
		int index = findIndex(element);
		
		//System.out.print(index);
	
		
		if (index>=0) {
		
			theData[index]=0;
			for(int i=index; i<size;i++) {
				theData[i]=theData[i+1];
			}
			this.size--;
			return true;	
		}	
		
		return false;
	}


	private int sequentialFind(double target) {
		// TODO
		for (int index=0;index<this.capacity;index++) {
			if(theData[index]== target) {
			return index;
			}
			else if (theData[index]<target ) {
			return (-index -1);
			}
		}
		return 0;
	}

	private int binaryFind(double target) {
		// TODO
		int min=0;
		int max= size;
		int mid=0;
		
	   
	
		while(min<=max) {
			mid=(min+max)/2;
			
			
			if (theData[mid]==target) {
				return mid;
			}
			else if(theData[mid]<target) {
				max=mid-1;
				
	
			}
			else if(theData[mid]>target){
				
			min = mid+1;
			}
			
		}
		return -mid-1;
				
		
		
		
	
	
	}

	public int findIndex(double target) {
		if (usesBinarySearch) {
			return binaryFind(target);
		} else {
			return sequentialFind(target);

		}
	}

	public boolean containsAll(double[] elements){
		for (int i=0; i<elements.length;i++) {
			if(this.findIndex(elements[i])<0){
				return false;
			}
			
		}
		return true;
	
	}

	public boolean contains(double element){
			if(this.findIndex(element)>=0) {
				return true;
			}
		return false;
	}
	
}
