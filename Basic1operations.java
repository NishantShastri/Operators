package basic1operations;

public class Basic1operations {
	
	public static void main(String[] args) {

		int a = 20;
		int b = 10;

		double c = a/b; //10
		
		double d = a+2; //22

		System.out.println("Addition of " + a + " + " + b + " = " + (a+b)); 
		System.out.println("Subraction of " + a + " - " + b + " = " + (a-b)); 
		System.out.println("Multiplication of " + a + " * " + b + " = " + (a*b)); 
		System.out.println("Divison of " + a + " / " + b + " = " + (a/b)); //Quotient
		System.out.println("Mod of " + a + " % " + b + " = " + (a%b)); //Remainder
		
		// Or simply can write it in long text to avoid confusion 
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Addition of a+b that is 20+10 is =" + (a+b)); 
		System.out.println("Subtraction of a-b that is 20-10 is =" + (a-b));
		System.out.println("Multiplication of a*b that is 20*10 is =" + (a*b));
		System.out.println("Divison of a/b that is 20/10 is =" + (a/b)); //Quotient
		System.out.println("Mod of a%b that is 20%10 is =" + (a%b)); //Remainder
		
		// Using the double datatype for c and d so that the answer comes in exact value 
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Addition of " + c + " + " + d + " = " + (c+d));
		System.out.println("Subtraction of " + c + " - " + d + " = " + (c-d));
		System.out.println("Multiplication of " + c + " * " + d + " = " + (c*d));
		System.out.println("Divison of " + c + " / " + d + " = " + (c/d)); //Quotient
		System.out.println("Mod of " + c + " % " + d + " = " + (c%d)); //Remainder
		
		// Or simply can write it in long text to avoid confusion
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Addition of c+d that is 10+22 is =" + (c+d)); 
		System.out.println("Subtraction of c-d that is 10-22 is =" + (c-d));
		System.out.println("Multiplication of c*d that is 10*22 is =" + (c*d));
		System.out.println("Divison of c/d that is 10/22 is =" + (c/d)); //Quotient
		System.out.println("Mod of c%d that is 10%22 is =" + (c%d)); //Remainder
		 
	}

}

