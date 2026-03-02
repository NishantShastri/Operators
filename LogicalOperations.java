package logicalOperations;

/* Logical operations include different type of operators such as
 * && -> also known as AND operator 
 * || -> also known as OR operator 
 * !  -> also known as NOT operator
*/

public class LogicalOperations {
	
	/* The && operator returns true only if both conditions being evaluated are true, else it will return false
	 * The || operator returns true if at least one of the conditions being evaluated is true, else it will return false
	 * The ! operator reverses the logical state of its operand, means true will be false and false will be true
    */
	public static void main(String[] args) {
		
		/* 1) &&
		 *    true && true -> true
		 *    true && false -> false
		 *    false && true -> false
		 *    false && false -> false
		 */    
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("--------------------------------------------------------------");
		
		 /* 2) ||
		 *    true || true -> true
		 *    true || false -> true
		 *    false || true -> true
		 *    false || false -> false
		 */    
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("--------------------------------------------------------------");
		
		 /* 3) !
		 *    !true -> false
		 *    !false-> true 
		 *       
		 */
		
		System.out.println((!true ));
		System.out.println((!false ));
		
		System.out.println("--------------------------------------------------------------");
		
		// Now lets try it with some harder example which will include Relational Operators 

		boolean check = true;

		System.out.println(10 > 42 && 10 < 9 && check && true);
		System.out.println((true) || 0 < 9 || check || 0 > 0);
		System.out.println(1 > 5 || 7 < 9 && false);
		System.out.println(check && (25 < 9) || 45 != 0 && true);
		System.out.println(!(1 > 4) && 10 < 8);
		System.out.println(!(1 > 4 && 10 < 8));
		System.out.println(!(1 == 4) && 45 > 44 || !(10 < 8));
		
	}
}
