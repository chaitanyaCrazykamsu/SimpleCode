package com.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class RegularExp {
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int N = Integer.parseInt(bufferedReader.readLine().trim());
	        String nameRegex = "[a-z]";
	        String emailRegex="^([a-z].+)@gmail.com$";
	        List<String> names = new ArrayList<>();
	        IntStream.range(0, N).forEach(NItr -> {
	            try {
	                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	                String firstName = firstMultipleInput[0];
	                Pattern p = Pattern.compile(nameRegex);
	                Matcher m = p.matcher(firstName);
	               
	                
	              

	                String emailID = firstMultipleInput[1];
	                Pattern p1 = Pattern.compile(emailRegex);
	                Matcher m1 = p1.matcher(emailID);
	                
	                if(m.find()&& m1.find()) {
	                	names.add(firstName);
	                }
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });
	        Collections.sort(names);
	       System.out.println(names);
	        
	        bufferedReader.close();
	    }
}
