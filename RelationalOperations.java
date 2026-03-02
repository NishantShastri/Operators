package relationalOperations;

public class RelationalOperations {
	
	/* Relational Operator are used to Compared Two things 
	 * Result Declared in Boolean (True/False) 
	 
	 * >   -> Greater than
	 * <   -> Less than
	 * >=  -> Greater than equals to 
	 * <=  -> Less than equals to 
	 * ==  -> Equals to 
	 * !=  -> Not Equals to 
	 */
	
	public static void main(String[] args) {
		
		int a = 10, b = 13;

		System.out.println(a + "is Greater than" + b + "-" + (a > b));
		System.out.println(16 < 9);

		System.out.println(7 >= 11); 
		System.out.println(13 <= 12); 

		System.out.println(a == b);
		System.out.println(16 != 18); 
		
		System.out.println("-------------------------------------------------"); 
		
		int c = 4, d = 10;

		int e = 19;
		int f = 12;

		System.out.println(c > d);
		System.out.println(4 < 1);

		System.out.println(c >= f*e); 
		System.out.println(d <= f/e);

		System.out.println(4 == 2);
		System.out.println(e > e/f);
		
	}

}
