package bitwiseOperations;

public class BitwiseOperations {

	/* Bitwise operators are those operators in Java that perform operations bit by bit
	 * Types of bitwise operators :-
 
	 * & - AND
	 * | - OR
	 * ^ - XOR
	 * ~ - Compliment
	 * << - Left Shift
	 * >> - Right Shift 
	 */
	public static void main(String[] args) {
		
		/* The '&' AND operator is similar to the '&&' AND operator in the Logical Operations category but this involves binary
		 * If both the values are true then the final output is also true 
		  
		 * 1) &   

              true(1) & true(1)  = true(1)
              true(1) & false(0)  = false(0)
              false(0) & true(1)  = false(0)
              false(0) & false(0)  = false(0)
		 */
		System.out.println(Integer.toBinaryString(17)); // First lets check the binary of 17 
		System.out.println(Integer.toBinaryString(55)); // Next we check the binary of 55
		System.out.println(17 & 55); // Finally we compare both the binary results and only consider true cases for addition 
		
		/*                  128   64   32   16   8   4   2   1   0   (binary bits) 
		  
		 * 17                                1   0   0   0   1   -
		 * &
		 * 55                           1    1   0   1   1   1   -
		  
		 * Result                            1   0   0   0   1   -
		  
		 * Since '16' and '1'are the only true cases here and rest are false this bits will be added in binary (16+1) = 17
		 * '17' bits is basically same as '10001' binary
		 * The final result will be the binary of '17' but output displayed will be in bits and not binary
		 */
		 
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		/* Similarly lets take a bigger example but in the case of OR (|) 
		 * The '|' OR operator is similar to the '||' OR operator in the Logical Operations category but this involves binary
		 * If even one value is true out of both the values then the final output is also true 
		  
		 * 2) | :  

              true(1) && true(1)  = true(1)
              true(1) && false(0)  = true(1)
              false(0) && true(1)  = true(1)
              false(0) && false(0)  = false(0)
		 */
		
		System.out.println(Integer.toBinaryString(75)); // First lets check the binary of '75' 
		System.out.println(Integer.toBinaryString(53)); // Next we check the binary of '53'
		System.out.println(75 | 53); // Finally we compare both the binary results and only consider true cases for addition
		
		/*                  128   64   32   16   8   4   2   1   0   (binary bits) 
		  
		 * 75                      1    0    0   1   0   1   1   -
		 * |
		 * 53                      0    1    1   0   1   0   1   -
		  
		 * Result                  1    1    1   1   1   1   1   -
		  
		 * Since all cases are true here and final binary is '1111111' its bits will be added for result (64+32+16+8+4+2+1) = 127
		 * '127' bits is basically same as '1111111' binary
		 * The final result will be the binary of '127' but output displayed will be in bits and not binary
		 */
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		/* Lets take an even bigger example for XOR
		 * This '^' XOR operator is not similar to the '!' NOT operator from logical operations don't get confused
		 * The '^' XOR operator is similar to the '|' OR operator in the this Bitwise Operations category 
		 * Everything will be same except....the one which has both true will give the output as false
		  
		 * 3) ^ :  

              true(1) && true(1)  = false(0)
              true(1) && false(0)  = true(1)
              false(0) && true(1)  = true(1)
              false(0) && false(0)  = false(0)          
		 */
		
		System.out.println(Integer.toBinaryString(202)); // First lets check the binary of '202' 
		System.out.println(Integer.toBinaryString(157)); // Next we check the binary of '157'
		System.out.println(202 ^ 157); // Finally we compare both the binary results and only consider true cases for addition
		
		/*                  128   64   32   16   8   4   2   1   0   (binary bits) 
		  
		 * 202                1    1    0    0   1   0   1   0   -     
		 * ^                 
		 * 157                1    0    0    1   1   1   0   1   -      
		  
		 * Result             0    1    0    1   0   1   1   1   -     
		  
		 * Since all cases are true here and final binary is '1010111' its bits will be added for result (64+16+4+2+1) = 87
		 * '87' bits is basically same as '1010111' binary
		 * The final result will be the binary of '87' but output displayed will be in bits and not binary
		 */
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		/* Now the '~' is used to increase the positive bit number value by '1' and add a negative symbol
		 * It can be also used to reduce a negative number and add a positive sign 
		 * For example :- (~3) the output will be (-4)...and for...(~-4) the output will be (3)  
		 */
		
		System.out.println(~3); // Value will be increased and negative sign will be added in output
		System.out.println(~-4); // Value with negative integer will be reduced and a positive sign will be added 
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		/* Now lets start with the operators known as (<<) left shift and (>>) right shift 
		 * The (<<) left shift operator is used to shift the binary numbers of the bits towards the left side of table
		 * For example :- (13 << 3) In this the binary number will be shifted to the left side by 3 spaces 
		 */
		System.out.println(Integer.toBinaryString(13)); // First lets check the binary of '13' 
		System.out.println(13 << 3); // The '3' here refers to the amount of spaces the binary '13' will shift to left (<<) 
		
		/*                  128   64   32   16   8   4   2   1   0   (binary bits) 
		  
		 * 13                                    1   1   0   1   -
		 * >>
		 * 3                      
		  
		 * Result                  1    1    0   1   0   0   0   -  Here the binary from '13' shifted 3 spaces to the left
		  
		 * After shifting 3 spaces to the left the final binary will be '1101000' i.e (64+32+8) bits = 104 bits
		 * '104' bits is basically same as '1101000' binary
		 * The final result will be the binary of '104' but output displayed will be in bits and not binary 
		 */
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		/* Similarly the (>>) left shift operator is used to shift the binary numbers of the bits towards the right side of table
		 * For example :- (67 << 5) In this the binary number will be shifted to the right side by 5 spaces
		 */  
		
		System.out.println(Integer.toBinaryString(86)); // First lets check the binary of '86' 
		System.out.println(86 >> 5); // The '5' here refers to the amount of spaces the binary '86' will shift to right (>>) 
		
		/*                  128   64   32   16   8   4   2   1   0   (binary bits) 
		  
		 * 86                      1    0    1   0   1   1   0   -          
		 * >>
		 * 5                      
		  
		 * Result                                        1   0   (10110)   - Here the binary from '86' shifted 5 spaces to the right
		  
		 * After shifting 5 spaces to the right the final binary will be '10' i.e (2) bits 
		 * Due to shifting more spaces than allocated space as you can see the remaining binary (10110) is data loss 
		 * '2' bits is basically same as '10' binary
		 * The final result will be the binary of '2' but output displayed will be in bits and not binary 
		 */
		
	}
	
	
	
}
