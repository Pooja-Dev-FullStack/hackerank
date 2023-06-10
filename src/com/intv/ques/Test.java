package com.intv.ques;

import java.util.HashMap;
import java.util.Map;

public class Test {
	   
    public static void gfg(String s)
    {    
        System.out.println("String");
    }
    public static void gfg(Object o)
    {
        System.out.println("Object");
    }
  	    public static void main(String args[])
    {
        gfg(null);
        String a = "abc";
      	a = "xyz";
      	System.out.println(a);
      	a.concat("test");
      	System.out.println(a);
      	Map<Integer, Integer> map = new HashMap<>();
     	map.put(1,10);
      	map.put(2,20);
      	Integer data = map.put(1,30);
      	System.out.println(data);
    }
}
