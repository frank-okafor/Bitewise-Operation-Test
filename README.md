# java-interview-test
#### Java Backend Developer Interview

#### Solution to the below question 

#### Question
Amaka is a little girl who loves playing with array. In her 10th birthday, she got two arrays as presents. Let’s call them A and B. Both arrays have the same size n and contains integers between 0 to 30000.
Amaka’s hard-drive is almost full of presents and she barely has any space to keep the arrays. She discovered a brilliant function to merge the array into one:

```json
	int encodeInteger(int x, int n){
		n = n<<(1<<(1<<(1<<1)));
		x = x | n;
		return x;
	}
	void encodeArray(int []A, int []B, int n){
		for(int i=0;i<n;i++) {
	    	    A[i] = encodeInteger(A[i], B[i]);
		}
	}
```

Amaka passed A and B into the encodeArray function. After that she discarded array B and saved the modified version of array A in the hard-drive.

Now in her 15th birthday Amaka wants to play with those arrays again. She found the modified version of array A in the hard-drive but she forgot how to recover the original arrays from it.

a.	Help Amaka recover the original arrays.

b.	Specify the classification of the algorithm used in terms of BigO.

#### Preview
The proposed algorithm function as contained in the code is designed to decode the binary encryption values of any given array into two separate arrays
and the Big O notation for the function is termed as O(n).

#### Frank Okafor
