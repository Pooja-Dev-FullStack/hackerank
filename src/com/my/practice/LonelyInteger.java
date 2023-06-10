package com.my.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
	
	public static int lonelyinteger(List<Integer> a) {
	    // Write your code here
	    int lonelyInt=0;
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for(int i=0; i< a.size(); i++){
	    if(map.containsKey(a.get(i))){
	      int count= map.get(a.get(i));
	      map.put(a.get(i), count+1);
	    }
	    else{
	      map.put(a.get(i), 1);
	      }
	    }
	    for(Map.Entry<Integer,Integer> entry: map.entrySet() ){
	      if(entry.getValue()==1)
	      lonelyInt = entry.getKey();
	    }
	  return lonelyInt;
	}

	public static void main(String[] args) {
		List<Integer> a= new ArrayList<Integer>();
		a.add(1);
		a.add(1);
		a.add(2);
		a.add(5);
		a.add(5);
		int b =LonelyInteger.lonelyinteger(a);
		System.out.println(b);
	}


}