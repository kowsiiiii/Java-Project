package org.task;

public class Prime_Number2 {

	public static void main(String[] args) {

		int c = 0;

		for (int i = 1; i <=10; i++) {

			int count = 0;

			for (int j = i; j>=1; j--) {
				
				//System.out.println(i+","+j);

				if (i % j == 0) {
					
					//System.out.println(i+",,,"+j);
					

					count = count+1;

				}

			}

			if (count == 2) {
				
				System.out.println(i);

				

			}


		}

	}

}
