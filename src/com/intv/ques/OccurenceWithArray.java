package com.intv.ques;

public class OccurenceWithArray {

	public static void main(String[] args) {
		String string = "pooja";
		int [] freq = new int[string.length()];
		char [] c= string.toCharArray();
		for(int i=0; i<c.length;i++) {
			freq[i]=1;
			for(int j=i+1; j<c.length; j++) {
				if(c[i]==c[j])
				freq[i]= freq[i]+1;
			}
		}
		for(int i=0; i<c.length;i++) {
			System.out.println(c[i]+ " : "+ freq[i]);
				if(i!=c.length-1 && c[i]==c[i+1] ) { // i!=c.length-1 == i<c.length-1
					i++;
				}
			}
		}
	}
