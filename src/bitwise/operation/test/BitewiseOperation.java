package bitwise.operation.test;

import java.util.Arrays;

public class BitewiseOperation {
	
	public static void main(String[] args){
		BitewiseOperation bo = new BitewiseOperation();
		bo.testBitOperation();
	}
	
	//bitewise operation test method
	public void testBitOperation() {
		int a [] = {1,2,3,4,5}; 
		int b [] = {11,12,13,14,15};
		int lenght = a.length;
		
		   System.out.println("Original Array A" + Arrays.toString(a));
		   System.out.println("Original Array B" + Arrays.toString(b));
		   
		   decodeArray(encodeArray(a, b, lenght), lenght);
	}
	
	// method to encode the individual integers in the array, this has a Big O annotation of O(1)
	int encodeInteger(int x, int n){
		n = n<<(1<<(1<<(1<<1)));
		x = x | n;
		return x;
	}

	//Method to encode the arrays and write to a new array, this has a Big O annotation of O(n)
	int [] encodeArray(int [] A, int [] B, int n) {
		for(int i=0;i<n;i++) {
    	    A[i] = encodeInteger(A[i], B[i]);
		}
		return A;
	}
	
	//Method to decode a given encode array into two separate arrays and show their original values, this has a Big O annotation of O(n)
	void decodeArray(int [] originalArray, int count_of_elements_in_array) {
		System.out.println("Encoded Array A" + Arrays.toString(originalArray));
		final int arrayDecoder = 0b0000000000000011111111111111;
		int new_a_array1 [] = new int[count_of_elements_in_array], 
		new_b_array [] = new int[count_of_elements_in_array],  
		select;
	    
		for(int i = 0; i < count_of_elements_in_array; i++)
	    {
	    	select = originalArray[i];
	    	new_b_array [i] = select >> (1<<(1<<(1<<1))); 
			new_a_array1 [i] = select & arrayDecoder;
	    }
		
	   System.out.println("New Decoded Array A" + Arrays.toString(new_a_array1));
	   System.out.println("New Decoded Array B" + Arrays.toString(new_b_array));}
}
