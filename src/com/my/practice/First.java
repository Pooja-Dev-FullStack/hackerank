package com.my.practice;

import java.util.ArrayList;
import java.util.List;

public class First {
	public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positive=0, negative=0, zero=0;
        // positive= negative= zero = 0;
        for(int i=0; i<arr.size(); i++){
                if(arr.get(i)>0) {
                	positive++;
                	System.out.println(arr.get(i)+"*****"+ positive);
                }
                else if(arr.get(i)<0) { 
                 negative++;}
                else
                 zero++;
        }
        double max = positive/arr.size();
        char c= 'g';
        int pos=c;
        System.out.println(max+"5555"+" "+pos); // 0.05555
        System.out.println(positive/arr.size()); //0  ....why?
        
// 1 is an int and 10 is an int and when you do int/int you
//        get an int.
// If you do 1.0/10 or 1/10.0 or 1.0/10.0 you will get a 
//        double as 0.1
        System.out.println(negative/arr.size());// 0
        System.out.println(zero/arr.size());//0
        }

public static void main(String[] args) throws Exception {

    List<Integer> arr = new ArrayList<>();
    arr.add(-4);
    arr.add(3);	
    arr.add(-9);
    arr.add(0);
    arr.add(4);
    arr.add(1);
	First.plusMinus(arr);   
	}
}