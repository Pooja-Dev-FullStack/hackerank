package com.intv.ques;

import java.util.HashMap;

public class StringReverse {

	public static void main(String[] args) {
		String string= "Pooja Rai";
		char[] charr = string.toCharArray();
		for(int i= charr.length-1; i>=0; i--) {
            System.out.print(charr[i]);// iaR ajooP
        }
		String str = "This this is is done by Saket Saket";
        String[] split = str.split(" ");
        for(int i = split.length-1; i>=0; i--) {
			System.out.println(split[i]); // Saket
//			Saket
//			by
//			done
//			is
//			is
//			this
//			This
        }
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length; i++) {
        	boolean y = map.containsKey(split[i]);
        	System.out.println("**"+y);
            if (map.containsKey(split[i])) {
            	System.out.println("####"+ map.get(split[i]));// The get() method of Map interface in 
            	//Java is used to retrieve or fetch the value mapped by a particular key mentioned in 
            	//the parameter.
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            }
            else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);
        
        int a = 0b1010;
        int b = 0b1100;
        System.out.println(a & b);// 8 in decimal
		
	}

}
