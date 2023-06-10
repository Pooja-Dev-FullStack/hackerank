package com;

public class test2 {

	public static void main(String[] args) {
		String str = "www.google.com";
		String[] str2 = str.split("\\.",3);
		for(String s: str2) {
			System.out.println(s);
		}
		String s = "07:05:45PM";
        String string2;
        int temp=0;
            String string = s.substring(0, s.length()-2);
            String[] st = string.split(":");
            if(st[0].equals("12")){
                string2 = string.replaceFirst("12","00");
                System.out.println(string2);
            }
            else{
                temp = Integer.valueOf(st[0]);
                temp = temp+12;
                string2 = string.replaceFirst("12",String.valueOf(temp));
                System.out.println(string2);
            }
        }
}
//The split() method is called on the str variable, with two arguments:
//The regular expression pattern "\\.". This matches the dot character (.), and the double backslash is used to escape the dot 
//character because it has a special meaning in regular expressions.
//The integer 2, which specifies the maximum number of times the input string should be split. In this case, the input string will be
//split into at most two parts.
//The result of the split() method is an array of strings, which is assigned to the str2 variable.
//Finally, a for loop is used to print each element of the str2 array.
//So in this case, the 2 indicates that the input string should be split into at most two parts, which means that the first part 
//will be "www" and the second part will be "google.com".

//what . means in java
//
//In Java, the dot (.) is used as an operator to access members of a class or an object. This is known as the dot operator or 
//
//the member access operator.
//
//For example, if you have a class Person with a member variable name, you can access the name variable using the dot operator like 
//this:
//
//java
//Copy code
//Person person = new Person();
//person.name = "John Doe";
//Here, we're using the dot operator to set the name variable of the person object.
//
//In addition, the dot operator is also used in Java package names to separate the different parts of the package name. For example,
//the package name java.util consists of two parts: java and util, separated by a dot.