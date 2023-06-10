package com.intv.ques;

import java.util.HashMap;

public class CharOccurenceWithMap {
	public HashMap<Character, Integer> findCharFreq(HashMap<Character,Integer> map,String str) {
		for(int i=0; i<str.length(); i++) {
				Character character = str.charAt(i);
				if(character!=' ') {
					if(map.containsKey(character)) {
						Integer count = map.get(character);
						map.put(character, count+1);
					}
					else {
						map.put(character, 1);
					}
				}	
		}
		return map;
	}
	
	public void toPrint(HashMap<Character, Integer> map, String str) {
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ' && map.get(str.charAt(i))!=-1) {
				System.out.println(str.charAt(i)+ " : "+ map.get(str.charAt(i)));
				map.put(str.charAt(i), -1);
			}
		}
	}
	
	
	public static void main(String[] args) {
		HashMap<Character, Integer> map=new HashMap<>();
		String str="pooja";
		CharOccurenceWithMap occurenceWithMap = new CharOccurenceWithMap();
		occurenceWithMap.findCharFreq(map, str);
		occurenceWithMap.toPrint(map, str);
	}

}
