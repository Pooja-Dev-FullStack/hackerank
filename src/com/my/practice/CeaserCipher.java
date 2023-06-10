package com.my.practice;
public class CeaserCipher {
	public static void main(String[] args) {
		String s= "Hello_World!";
		String sLower=s.toLowerCase();
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
	    String newS="";
	    String b="";
	    int k=4;
	    for(int i=0; i<sLower.length();i++){
	    	Character ch= sLower.charAt(i);
	    	if(Character.isLetter(ch)) {
	    			int pos= alphabets.indexOf(ch)+k;
	    			if(pos>=alphabets.length()) {
	    			pos= pos % alphabets.length();
	    		}
	    			newS+= alphabets.charAt(pos);	
	    }
	    	else {
	    		newS=newS+ch;
	    	} 

	}
	for(int i=0;i<s.length();i++) {
		Character ch =s.charAt(i);
		    if(Character.isUpperCase(ch)) {
		    	b=b+newS.substring(i, i+1).toUpperCase();
		    }
		    else {
		    b=b+newS.substring(i, i+1);
		    }
		 }
	    System.out.println(b);
 }
	
//	Always-Look-on-the-Bright-Side-of-Life
//	k = 5
//	OUTPUT -    Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj 
//	Lipps_Asvph!
//	Lipps_Asvph!
	
}
