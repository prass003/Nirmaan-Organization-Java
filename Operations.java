package Day10;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		CalculatorMethod O = new CalculatorMethod();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number :> "); 
		int one = sc.nextInt();
		System.out.println("Enter the Second Number :> "); 
		int two = sc.nextInt();
		O.Add(one , two);
		O.Sub(one , two);
		O.Mul(one , two);
		O.Div(one , two);
		O.Mod(one , two);
	}

}