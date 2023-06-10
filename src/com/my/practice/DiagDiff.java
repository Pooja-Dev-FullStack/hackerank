package com.my.practice;

import java.util.ArrayList;
import java.util.List;

public class DiagDiff {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
        // Creating innerList 
        List<Integer> innerList = new ArrayList<>();
        
        // Adding elements to innerList
        innerList.add(1);
        innerList.add(2);
        innerList.add(3);
        
        // Adding innerList to listOfLists
        list.add(innerList);
        
        // Creating another inner list 
        List<Integer> innerList2 = new ArrayList<>();
        innerList2.add(4);
        innerList2.add(5);
        innerList2.add(6);
        //[[1,2,3],[4,5,6]]
        list.add(innerList2);
        for(List innerlist : list)
        {
            for(Object i : innerlist)
            {
                System.out.print( i+ " ");
            }
            System.out.println("");
        }
        for(int i=0; i<list.size(); i++) {
        	System.out.println(("i "+i));
        	for(int j=0; j<innerList.size(); j++) {
            	System.out.println(("j "+j));
        		System.out.println("****" + list.get(i).get(j));
        	}
        }
        // diagonal diff
//        int lrSum=0, rlsum=0;
//        for(int i=0;i<arr.size();i++){
//          for(int j=0;j<arr.size();j++){
//          if(j==i){                                        //arr
//            lrSum= lrSum+arr.get(i).get(j);               //1 2 3
//          }                                               //4 5 6
//          int n = arr.size()-1;                          // 7 8 9    
//          if(j==n-i){
//            rlsum=rlsum+ arr.get(i).get(j);
//          }
//        }
//      }
//      int absDiff=Math.abs(lrSum-rlsum);
//      return absDiff;
	}

}
