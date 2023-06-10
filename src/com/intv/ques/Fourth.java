package com.intv.ques;


public class Fourth {

	public static void main(String[] args) {
		String string = "12:45:54PM";
		String modifiedTimeString;
// 04:59:59AM
// 12:45:54PM
// 12:40:22AM
		String newString = string.substring(0, 8);
		System.out.println(newString);
		String[] srr = newString.split(":");
		if(string.endsWith("PM")) {
			int no = Integer.parseInt(srr[0]);
			if(no==12) {System.out.println(newString);}
			else {
				System.out.println(no);
				int newNo= no+12;
				String a = Integer.toString(newNo);
				modifiedTimeString = newString.replaceFirst(srr[0], a);
				System.out.println(modifiedTimeString);
			}
		}
			else{
				int no = Integer.parseInt(srr[0]);
				System.out.println(no);
				if(no<12) {
					System.out.println(newString);
				}
				else {
					int newNo= 12-no;
					String a = Integer.toString(newNo);
					if(newNo == 0){modifiedTimeString = newString.replace(srr[0], "00");
					System.out.println("if"+modifiedTimeString);
					}
					
					else {
						modifiedTimeString = newString.replaceFirst(srr[0], a);
						System.out.println(modifiedTimeString);

					}
				}
				
				
		}
	}
}
