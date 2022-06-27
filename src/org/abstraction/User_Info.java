package org.abstraction;

//another class for example1
public class User_Info extends Abstract1 {
	@Override
	public void fname() {
		super.fname();
	}

	@Override
	public void lname() {
		super.lname();
	}

	@Override
	void password() {
		System.out.println("test@123");

	}

	@Override
	public void email() {
		super.email();
	}

	public static void main(String[] args) {
		User_Info key = new User_Info();
		key.fname();
		key.lname();
		key.password();
		key.email();
	}

}
