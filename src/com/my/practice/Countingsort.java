package com.my.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Countingsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a= new ArrayList<Integer>();
		a.add(1);
		a.add(1);
		a.add(2);
		a.add(5);
		a.add(5);
		List<Integer> freqL = new ArrayList<Integer>(Collections.nCopies(6, 0));
	    for(int i=0; i<a.size(); i++){
	      freqL.set(a.get(i),(freqL.get(a.get(i)))+1);	    	
	      }
	    for(int i: freqL) {
	    	System.out.println(i);
	    }
	}
}
