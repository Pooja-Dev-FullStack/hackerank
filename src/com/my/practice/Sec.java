package com.my.practice;

import java.util.ArrayList;
import java.util.List;

public class Sec {
	 public static void miniMaxSum(List<Integer> arr) {
		    // Write your code here
		    long max, min, count =0;
		    min = arr.get(0);
		    max = arr.get(0);
		    for(int i=0;i< arr.size();i++){
		        count = count + arr.get(i);
		        if(min > arr.get(i))
		        min = arr.get(i);
		        if(max < arr.get(i))
		        max = arr.get(i);
		    }
	        System.out.println(count);
	        System.out.println(min);
	        System.out.println(max);
//System.out.println("popop"+ count-min);// error: The operator - is undefined for the argument type(s) String, long
	        System.out.println(count-min);

		    long fir= count-max;
		    long sec = count-min;
//		    System.out.print(fir);
//		    System.out.println(" "+ sec);
		    }	

	public static void main(String[] args) {
		 List<Integer> arr = new ArrayList<>();
		    arr.add(942381765);
		    arr.add(627450398);	
		    arr.add(954173620);
		    arr.add(583762094);
		    arr.add(236817490);
		Sec.miniMaxSum(arr);  
	}

}
