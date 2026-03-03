package assignmentOperations;

public class AssignmentOperations {
	
	/* Assignment operators are used to assign values to variables.
	 * Assignment operators are quite similar to Arethmatic operators but the value gets assigned after each execution
	 
	 * Assign              =      a =  3
     * Add & assign       +=      a += 3 
     * Sub & assign       -=      a -= 3
     * Mul & assign       *=      a *= 3
     * Divide & assign  Q /=      a /= 3
     * mod & assign     R %=      a %= 3
	 */
	
	public static void main(String[] args) {
		
		int a = 7;
		int b = 8;
		a += 3;  //Here the value of 'a' i.e 3 gets assigned to the above integer 'a' i.e 7   ans10
		b -= 4;  //Here the value of 'b' i.e 4 gets assigned to the above integer 'b' i.e 8   ans4
		
		// Hence the final value of the 'a' is 10 and it will get assigned during printing output
		// Hence the final value of the 'b' is 4 and it will get assigned during printing output
		
		System.out.println(a); // So expected output while printing 'a' will be the result of [a = 7 + (a += 3)]
		System.out.println(a -= 8); // Since 'a' is already assigned as 10 it will get subtracted and new value of 'a' will be found
		System.out.println(a);  // The new value of 'a' is assigned after previous execution and will be used in next execution 
		System.out.println(a *= 7); // The previous value of 'a' is used again for finding the new value of 'a'
		System.out.println(a); //14
		System.out.println(b); // So expected output while printing 'b' will be the result of [a = 8 + (b -= 4)]
		System.out.println(b -= 8);	// Since 'b' is already assigned as 4 it will get subtracted and new value of 'b' will be found
		System.out.println(b); // The new value of 'b' is assigned here after previous execution and will be used in next execution 
		System.out.println(b *= -5); // The previous value of 'b' is used again for finding the new value of 'b' 
		System.out.println(b); //20
		System.out.println(a + b); // Both final assigned values from above execution will get added
		System.out.println(a /= b-13);
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		// Lets take some other examples from increment and decrement and apply assignment operators  
		
		int i = 3;
		i++; // 4
		--i; // 3
		System.out.println(i++); // 3 // 4
		i++; // 5
		System.out.println(i % 4); // 1....The value of 'i' is not stored to the code and it is printed as it is 
		System.out.println(i); //5
		--i; // 4
		System.out.println(i += 5); // 9.....Here due to the assignment the new 'i' value is stored to the code
		System.out.println(i); // 9
		i++; // 10
		int c = i + 2; // 12
		System.out.println(i++); // 10 // 11
		--i; // 10
		i %= 4; // 2
		System.out.println(i); // 2
		System.out.println(i++); // 2 // 3
		++i; // 4
		System.out.println(i);
		System.out.println(i -= c*4); //44
		
	}

}
