package com.madan.git_demo;

public class AppPractice {
	
	public void addData(String message) {
		System.out.println("---passed value is-------: "+ message);
		if (message != null && message.equalsIgnoreCase("madan")){
			System.out.println("-----Welcome to Git again-----");
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------Hello World------");

	}

}
