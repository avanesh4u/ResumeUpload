package com.cap.resume.test;

public class Widening1 {
	 public void f1(Integer i){
	     System.out.println("inside 1");
	   }
	   public void f1(int i){
	     System.out.println("inside 2");
	   }
	   public static void main(String args[]){
	     new Widening1().f1(8);
	   }
	}