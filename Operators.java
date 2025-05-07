package task;

public class Operators {

	public static void main(String[] args) {
		
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        
        
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        
       
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        
        
        System.out.println("\nAssignment Operators:");
        int c = 5;
        c += 2;
        System.out.println("c += 2: " + c);
        c -= 1;
        System.out.println("c -= 1: " + c);
        c *= 3;
        System.out.println("c *= 3: " + c);
        c /= 2;
        System.out.println("c /= 2: " + c);
        
        
        System.out.println("\nUnary Operators:");
        int d = 10;
        System.out.println("d++: " + (d++));
        System.out.println("++d: " + (++d));
        System.out.println("d--: " + (d--));
        System.out.println("--d: " + (--d));
        
        
        System.out.println("\nTernary Operator:");
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);


	}

}
