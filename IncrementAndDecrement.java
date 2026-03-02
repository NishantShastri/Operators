package incrementAndDecrement;

public class IncrementAndDecrement {

	/*
	 * It used to value update value by one 
	 * 
	 * 1) Increment :
	 * 
	 * pre - increment (++i) 
	 * post - increment (i++)
	 * 
	 * 2) Decrement :
	 * 
	 * pre - decrement (--i) 
	 * post - decrement (i--)
	 */

	public static void main(String[] args) {

		int i = 10;

		int a = i++; // The value of 'a' remains 10 and unchanged since post increment will be added in next line
		
		// The value of 'i' now became 11 (i++ i.e 10+1) because we added post increment in 'a = i++' line
		
		int b = ++i; // The value of 'b' after process is 12 since now 'i = 12' due to adding pre increment in this line (++i i.e 1+11) 
		
		// Due to adding pre increment in 'b = ++i' line the value will execute in the same line and not next line
		
		System.out.println(i); // The value of 'i' became 12 due to adding post increment and pre increment in 'a' and 'b'
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		System.out.println(a);   // The value of 'a' remains 10
		System.out.println(a++); // Now while printing this 'a++' value will be added by 1 in next line result (post increment)
		System.out.println(a);   // Here 'a' value has become 11 because in last line we added post increment
		System.out.println(++a); // Now while printing this '++a' value will be added by 1 in same line result (pre increment)
		System.out.println(a);   // In the last line the value of 'a' became 12 so its 12 now
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		System.out.println(b);   // Here 'b' value is execution of the code (i = 10...i++...++i) 
		System.out.println(b++); // Now while printing this 'b++' value will be added by 1 in next line result (post increment)
		System.out.println(b);   // Here 'b' value has become 13 because in last line we added post increment
		System.out.println(++b); // Now while printing this '++b' value will be added by 1 in same line result (pre increment)
		System.out.println(b);   // In the last line the value of 'b' became 14 so its 14 now  
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		System.out.println(a);   // 'a' value is 12 from previous code
		System.out.println(a--); // Now while printing this 'a--' value will be decreased by 1 in next line result (post decrement)
		System.out.println(a);   // Here 'a' value has become 11 because in last line we added post decrement
		System.out.println(--a); // Now while printing this '--a' value will be decreased by 1 in same line result (pre decrement)
		System.out.println(a);   // In the last line the value of 'a' became 10 so its 10 now
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		System.out.println(b);   // 'b' value is 14 from previous code
		System.out.println(b--); // Now while printing this 'b--' value will be decreased by 1 in next line result (post decrement)
		System.out.println(b);   // Here 'b' value has become 13 because in last line we added post decrement
		System.out.println(--b); // Now while printing this '--b' value will be decreased by 1 in same line result (pre decrement)
		System.out.println(b);   // In the last line the value of 'b' became 12 so its 12 now
		
		// Important note :- Java does line by line execution of code thats why the value of a and b needs to be stored 
		// Now taking an difficult example
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		int c = 67;
	
			c--;  // 'c' is decremented to 66
			++c;  // 'c' is incremented to 67 so value of 'c' now is 67
			System.out.println(c--); // The value printed in this line is of 'c' i.e 67 and then 'c' will decrement to 66
			--c;  // 'c' is decremented to 65
			System.out.println(c++); // The value printed in this line is of 'c' i.e 65 and then 'c' will increment to 66
			--c;  // 'c' is decremented to 65
			c = 42;
			c++;  // 'c' is incremented to 43
			System.out.println(--c); // The value printed in this line is of 'c' i.e 42 now because it already decremented in this line
			c++;  // 'c' is incremented to 43
			System.out.println(++c); // The value printed in this line is of 'c' i.e 44 now because it already incremented in this line
		
	}

}
