
public class Exception1 {
	
	private void validate(int side) throws Exception {
		if (side>0) {
			int area = side * side;
			System.out.println(area);
			
		} else {
             throw new Exception();
		}	

	}
public static void main(String[] args) throws Exception {
	Exception1 e = new Exception1();
	e.validate(-1);
}
}
