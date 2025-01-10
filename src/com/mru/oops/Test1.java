package com.mru.oops;


	class Test1 implements Interface1{

		@Override
		public void addition() {
			// TODO Auto-generated method stub
			int num1 = 100;
			int num2 = 50;
			int res = num1 + num2;
			System.out.println("Addition...."+res);
			
		}

		@Override
		public int subtraction(int num1, int num2) {
			int res = num1 - num2;
			// TODO Auto-generated method stub
			return res;
		}

		@Override
		public void multiplication(int num1, int num2) {
			int res = num1*num2;
			System.out.println("Multiplication......."+res);
			
			
		}

		@Override
		public int division() {
			// TODO Auto-generated method stub
			int  num1 = 100;
			int num2 = 50;
			int res =  num1/num2;
			return res;
		}
		
	}


