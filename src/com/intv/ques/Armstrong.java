package com.intv.ques;

public class Armstrong {
	

	public static boolean isArmstrongNumber(int n) {
		int temp;
		int digits=0;
		int last=0;
		int sum=0;

		temp=n;
		while(n>0) {
			temp = n%10;
			digits++;
		}
		temp=n;
		
		while(n>0) {
			last = temp%10;
			sum = (int) (sum + Math.pow(last, digits));
			temp=temp/10;			
		}
		if (n==sum) return true;
				
		else return false;	
	}
	
	public static void main(String[] args) {
		Armstrong.isArmstrongNumber(153);
	}
}
