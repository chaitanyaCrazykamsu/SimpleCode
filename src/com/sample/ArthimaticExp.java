package com.sample;

import java.util.LinkedList;
import java.util.Scanner;

public class ArthimaticExp {
//https://www.hackerrank.com/challenges/arithmetic-expressions/problem
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        for(int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();            
	        }
	        
	        LinkedList<Character> sol = new LinkedList<Character>();
	        int[] inv = new int[101];
	        inv[1] = 1;
	        for(int i = 2; i <= 100; i++) {
	            for(int j=i; j <= 100; j++) {
	                if(((i*j)%101) == 1) {
	                    inv[i] = j;
	                    inv[j] = i;
	                }
	            }
	        }
	        
	        backtrack(a,n-1,0,sol,inv);
	        
	        while(sol.size() < n-1) {
	            sol.addFirst('*');
	        }
	        
	        for(int i = 0; i < n-1; i++) {
	            System.out.print(a[i]+""+sol.get(i));
	        }
	        System.out.println(a[n-1]);
	        
	        
	    }
	    
	    public static boolean backtrack(int[] a, int index, int mod, LinkedList<Character>sol, int[] inv) {
	        if(index == 0) {
	            return ((a[index] % 101) == mod);
	        }
	        
	        if(a[index] == 0) {
	            if(mod == 0) {
	                sol.add('*');
	                return true;
	            }
	        } else {
	            if(mod == 0) {
	                if(backtrack(a,index-1,0,sol,inv)) {
	                    sol.add('*');
	                    return true;
	                }
	            } else {
	                if(backtrack(a,index-1,(mod*inv[a[index]])%101,sol,inv)) {
	                    sol.add('*');
	                    return true;
	                }
	            }
	        }
	        
	        if(backtrack(a,index-1,(mod+a[index])%101,sol,inv)) {
	            sol.add('-');
	            return true;
	        }
	        
	        int t = mod-a[index];
	        if(t < 0) {
	            t = t + 101;
	        }
	        if(backtrack(a,index-1,t,sol,inv)) {
	            sol.add('+');
	            return true;
	        }
	        
	        return false;
	    }
	    
	    
	}
