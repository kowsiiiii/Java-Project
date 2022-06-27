package org.oops;
//example1-Interface1-child class1

public class Interface_Child1 implements Interface_Parent1,Interface_Parent2 {
	
	
		@Override
		public void plan1() {
			System.out.println("done to plan :" + "\n" + "find out the needs");
		}

		@Override
		public void plan2() {
			System.out.println("overcome the mistakes");

		}

		@Override
		public void plan3() {
			System.out.println("satisfaction of the employees");
		}

		@Override
		public void plan4() {
			System.out.println("succeed");
		}

		@Override
		public void work1() {
			System.out.println("done to work :" + "\n" + "billing");
		}

		@Override
		public void work2() {
			System.out.println("bonding");
		}

		@Override
		public void work3() {
			System.out.println("pre request");
		}

		@Override
		public void work4() {
			System.out.println("invoice");
		}

		public static void main(String[] args) {
			Interface_Child1 user = new Interface_Child1();
			user.plan1();
			user.plan2();
			user.plan3();
			user.plan4();
			user.work1();
			user.work2();
			user.work3();
			user.work4();

		}
	}



