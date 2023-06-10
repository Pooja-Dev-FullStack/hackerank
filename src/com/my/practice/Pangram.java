package com.my.practice;

import java.util.HashSet;

public class Pangram {
	
	public String checkPangram() {
		int count=0;
		String s="We promptly judged antique ivory buckles for the next prize";
	      HashSet<Integer> h = new HashSet<>();
	      String s2= s.toLowerCase();
	      for(int i=0; i<s.length();i++){
	        if(s2.charAt(i)!=' '){
	         Character ch= s2.charAt(i);
	          h.add((int)ch);
	        }
	      }
	      for(int i: h){
	    	  if(i>=97 && i<=122) {
	    		  count++;
	    	  }
	    	}
	        
	      if(count==26) return "pangram";
	       else return "not pangram";
	}
	public static void main(String[] args) {
		Pangram pangram= new Pangram();
		String reString = pangram.checkPangram();
		System.out.println(reString);   
	}
}
