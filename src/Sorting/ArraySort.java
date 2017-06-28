package Sorting;

	public class ArraySort {

	    public static void main(String[] args) { // Main Method
	        // TODO Auto-generated method stub
	        int [] r = {23, 75, 2, 13, 57, 4, 34, 9, 32, 6}; // Initialize the array 
	        
	        System.out.println("Array of elements:");
	        printArray(r, r.length); // Prints the whole array 
	        r = recursiveCall(r, r.length, 0); // Create Recursion object
	        System.out.println("\n\nArray after sorting:"); //Prints the sorted array 
	        printArray(r, r.length);
	    }
	    
	    public static int[] recursiveCall(int[] r, int n, int index){ //Recursive Method
	        int temp;
	        /** Compare the elements in the array one by one 
            and put the smallest number at the top and the largest
            number at the end of the array 
            **/
	       
	         if(n==index){
	            return r;
	        }else{
	            for(int i=index+1;i<n;i++){ 
	            	if(r[index]>r[i]){       
	                    temp = r[index];
	                    r[index] = r[i];
	                    r[i] = temp;
	                }
	            }
	            index++;
	            recursiveCall(r, n, index); // Recursion Call
	        }
	        
	        return r; //return array
	        
	    }
	    
	    public static void printArray(int[] arr, int len){
	        for(int i=0; i<len; i++){
	            if(i==len-1){ // Sort array in ascending order 
	                System.out.print(arr[i]); // Prints the sorted array in ascending order 
	            }else{
	                System.out.print(arr[i] + " "); // Puts spaces between the elements of array
	            }
	        }
	    }

	}

