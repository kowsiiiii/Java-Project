
public class Prime_Number {
	
	public static void main(String[] args) {
		
		
		int num;
		
		boolean flag = false;
		
		for (num = 1;  num<=1000; num++) {
			
			for (int i = 2; i <num/2; i++) {
				
				if (num%i==0) {
					
					flag = true;
					
				}
				
			}
			
			if (!flag) {
				
				System.out.println("Prime");
				
				
			}else {
				System.out.println("not prime");
			}
			
		}
		
		
		
	}

}
