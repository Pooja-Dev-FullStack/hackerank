package com.my.practice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PlusMinus {

	public static void main(String[] args) {
		// arr = [-4, 3, -9, 0, 4, 1]
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(3);
		list.add(9);
		list.add(0);
		list.add(4);
		list.add(1);
		//double q = list.size();
		double positive = list.stream().filter(n->n>0).count();
//		System.out.println(positive/q);
		System.out.println(String.format("%.6f", (positive/list.size())));
		
//		--------------------------------------------------------------
		long min=list.get(0), max=list.get(0),sum=0;
	    long add_min=0, add_max=0;
	        for (int i=0; i<list.size();i++) {
	            min = Math.min(min, list.get(i));
	            max = Math.max(max, list.get(i));
	            sum = sum + list.get(i);
	         }
	        System.out.println(sum);
	        System.out.println(max);
	        System.out.println(min);
	        add_max=sum-min;
	        add_min=sum-max;
	        System.out.println(add_min+" "+add_max);
	    
		}
	
}
