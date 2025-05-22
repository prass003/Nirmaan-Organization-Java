package day19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException: " + e);
		}

		try {
			System.out.println("Enter a number:");
			int y = sc.nextInt(); 
		} catch (InputMismatchException i) {
			System.out.println("Caught InputMismatchException: " + i);
		}

		try {
			int[] q = null;
			System.out.println(q[1]); 
		} catch (NullPointerException n) {
			System.out.println("Caught NullPointerException: " + n);
		}

		try {
			String na = "six";
			System.out.println(na.charAt(8));
		} catch (IndexOutOfBoundsException o) {
			System.out.println("Caught IndexOutOfBoundsException: " + o);
		}
	}
}

