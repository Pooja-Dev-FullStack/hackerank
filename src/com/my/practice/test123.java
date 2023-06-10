package com.my.practice;

public class test123 {

	public static void main(String[] args) {
		String string = "zThere-a";
		String string2 ="";
		int k = 3;
		for (char c : string.toCharArray()) {
			c+=k;
//				System.out.print(c);
				string2+=c ;
			}
		System.out.println(string2);
	}

}
