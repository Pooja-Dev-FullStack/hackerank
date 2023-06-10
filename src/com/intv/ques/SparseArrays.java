package com.intv.ques;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SparseArrays {

	public static void main(String[] args) {
		int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int chunkSize = 2;
			
        int[][] output = splitArray(inputArray, chunkSize);
        for (int[] x : output)
            System.out.println(Arrays.toString(x));
    }
    
    public static int[][] splitArray(int[] inputArray, int chunkSize) {
        return IntStream.iterate(0, i -> i + chunkSize)
                .limit((int) Math.ceil((double) inputArray.length / chunkSize))
                .mapToObj(j -> Arrays.copyOfRange(inputArray, j, Math.min(inputArray.length, j + chunkSize)))
                .toArray(int[][]::new);
    }
//    This function returns a sequential ordered stream whose elements are the specified values.
//
//    It comes in two versions i.e. single element stream and multiple values stream.
//
//    IntStream of(int t) – Returns stream containing a single specified element.
//    IntStream of(int... values) – Returns stream containing specified all elements.
//    IntStream.of(10); 		//10
//    IntStream.of(1, 2, 3); 	//1,2,3
	
//    iterate() method returns an infinite sequential ordered stream. The first element (index 0) in the Stream will be the 
//    provided seed. For n > 0, the element at position n, will be the result of applying the function f to the element at
//    position n - 1.
	
}
