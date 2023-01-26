package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNumbers {

	public static void main(String[] args) {
		
		 List<Integer> arrayList
         = Arrays.asList(5, 3, 15, 234, 114, 1540);

     // Initialize with inbuilt Max function
     int maxValue = arrayList.stream()
                        .max(Integer::compareTo)
                        .get();
     System.out.println("The maximum value is "
                        + maxValue);
		
		
		List<Integer> binary = new ArrayList<>();
        int n = 6;
        while(n >0){
          binary.add(n%2);
          n=n/2;  
        }
        int count =0;
         System.out.println(binary);
          if(binary.get(0) == 1){
                count =1;
            }
         List<Integer> finalCount = new ArrayList<Integer>();
        for(int i=1;i<binary.size();i++){
           
            if(binary.get(i)== 1){
                count ++;
            }else{
               finalCount.add(count);
               count=0; 
            }
        }
        finalCount.stream().max(Integer::compareTo).get();
        System.out.println(finalCount);
        finalCount.stream().

	}

}
