package org.abstraction;

//another class for example2
public class Client extends Abstract2 {
	@Override
	public void name(String name1) {
		super.name(name1);
	}

	@Override
	public void product() {
		super.product();
	}

	@Override
	public void price() {
		super.price();
	}

	@Override
	public void brand() {
		super.brand();
	}

	@Override
	public void payment() {
		super.payment();
	}

	@Override
	void scan() {
		System.out.println("your code is : JjhgI23187JHGF");
	}

	@Override
	void otp() {
		System.out.println("234242");
	}

	public static void main(String[] args) {
		Client obj = new Client();
		obj.name("kowsalya");
		obj.product();
		obj.price();
		obj.brand();
		obj.payment();
		obj.scan();
		obj.otp();
	}

}
