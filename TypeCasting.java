package task;

public class TypeCasting {

	public static void main(String[] args) {
		
        System.out.println("Implicit Type Casting (Widening):");
        int intValue = 100;
        long longValue = intValue;  
        float floatValue = longValue;
        double doubleValue = floatValue; 

        System.out.println("Integer value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);

        
        System.out.println("\nExplicit Type Casting (Narrowing):");
        double doubleNum = 99.99;
        float floatNum = (float) doubleNum; 
        long longNum = (long) floatNum;     
        int intNum = (int) longNum;         
        
        System.out.println("Double value: " + doubleNum);
        System.out.println("Float value: " + floatNum);
        System.out.println("Long value: " + longNum);
        System.out.println("Integer value: " + intNum);
        


	}

}
