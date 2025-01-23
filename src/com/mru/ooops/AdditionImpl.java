package com.mru.ooops;

public class AdditionImpl implements AdditionInterface {

	@Override
	public void add1() {
		int num1 = 100;
		int num2 = 200;
		int res = num1+num2;
		System.out.println(res);
		
		// TODO Auto-generated method stub

	}

	@Override
	public void add2(int num1, int num2) {
		int res = num1+num2;
		System.out.println(res);
		// TODO Auto-generated method stub

	}

	@Override
	public int add3() {
		int num1 = 100;
		int num2 = 200;
		int res = num1+num2;
		// TODO Auto-generated method stub
		return res;
	}

	@Override
	public int add4(int num1, int num2) {
		int res = num1+num2;
		// TODO Auto-generated method stub
		return res;
	}

}
