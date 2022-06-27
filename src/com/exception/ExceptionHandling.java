package com.exception;

public class ExceptionHandling {
	public static void main(String[] args) throws Exception {
//		try {
//			int a=10;
//			int b=0;
//			int c=a/b;
//			System.out.println(c);
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("run finally");
//		}
		
		//throw
		int marks=30;
		if(marks>50) {
			System.out.println("pass");
			
		}
		else {
			throw new Exception("fail");
		}
	}

}
