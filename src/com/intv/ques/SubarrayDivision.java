package com.intv.ques;

import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision {

	public static void main(String[] args) {
		int count=0,sum,m=7,d=18;
	     List<Integer>a = new ArrayList<>();
			a.add(2);
			a.add(5);
			a.add(1);
			a.add(3);    
		    a.add(4);
			a.add(4);
		    a.add(3);
			a.add(5);
			a.add(1);
			a.add(1);
			a.add(2);
			a.add(1);
			a.add(4);
			a.add(1);
			a.add(3);
			a.add(3);
			a.add(4);
			a.add(2);
			a.add(1);
			
	     List<Integer> tempList = new ArrayList<>();
	      for(int i=0; i<a.size();i++){
	    	sum=0;
	    	if((a.size() - i)>=m) {
	        tempList = a.subList(i, m+i);
	          for(int j : tempList){
	            sum = sum+j;
	            }}
	          if(sum==d){ 
	        	  count++;
	          } 
	      }
	     System.out.println(count); 

	}

}
