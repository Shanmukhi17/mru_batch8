package com.mru.ooops;

public class SubstractionImpl extends AdditionImpl implements SubstractionInterface {

	@Override
	public void sub1() {
		int num1 = 100;
		int num2 = 200;
		int res =  num1 - num2;
		System.out.println(res);
		// TODO Auto-generated method stub

	}

	@Override
	public void sub2(int num1, int num2) {
		int res = num1 - num2;
		System.out.println(res);
		// TODO Auto-generated method stub

	}

	@Override
	public int sub3() {
		int num1 = 100;
		int num2 = 200;
		int res = num1 - num2;
		
		// TODO Auto-generated method stub
		return res;
	}

	@Override
	public int sub4(int num1, int num2) {
		int res = num1 - num2;
		// TODO Auto-generated method stub
		return res;
	}

}
