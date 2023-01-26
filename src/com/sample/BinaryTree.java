package com.sample;
import java.util.*;
import java.io.*;
class BNode{
    BNode left,right;
    int data;
    BNode(int data){
        this.data=data;
        left=right=null;
    }
}
class BinaryTree{

	
		public static int getHeight(BNode root){
	        if (root == null) return -1;
	        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	    }

    public static BNode insert(BNode root,int data){
        if(root==null){
            return new BNode(data);
        }
        else{
            BNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        BNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}