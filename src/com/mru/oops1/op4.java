package com.mru.oops1;

public class op4 {
	public void addition (int num1,int num2) {
		int res1 = num1+num2;
		System.out.println(res1);
	}
	public void addition(int num1,int num2,int num3) {
		int res2 = num1+num2+num3;
		System.out.println(res2);
	}

	public static void main(String[] args) {
		op4 obj = new op4();
		obj.addition(10,5);
		obj.addition(10,5,3);
		// TODO Auto-generated method stub

	}

}
