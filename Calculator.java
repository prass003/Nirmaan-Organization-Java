package day6;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Which Operation you have to do ?");
		System.err.print("Just Type : addition / subtraction / multiplication / division / modulo division");
		String input = sc.nextLine();
		switch(input) {
			case "addition":
			System.out.println("Enter the First number :");
			int a = sc.nextInt();
			System.out.println("Enter the Second number :");
			int b = sc.nextInt();
			System.out.println("Addition :"+(a+b));
			break;
			case "subtraction":
				System.out.println("Enter the First number :");
				int c = sc.nextInt();
				System.out.println("Enter the Second number :");
				int d = sc.nextInt();
				System.out.println("Subtraction :"+(c - d));
				break;
			case "multiplication":
				System.out.println("Enter the First number :");
				int e = sc.nextInt();
				System.out.println("Enter the Second number :");
				int f = sc.nextInt();
				System.out.println("Multiplicationb : "+(e * f));
				break;
			case "division":
				System.out.println("Enter the First number :");
				int g = sc.nextInt();
				System.out.println("Enter the Second number :");
				int h = sc.nextInt();
				System.out.println("DiVision :"+(g / h));
				break;
			case "modulo division":
				System.out.println("Enter the First number :");
				int i = sc.nextInt();
				System.out.println("Enter the Second number :");
				int j = sc.nextInt();
				System.out.println("Modulo Division :"+(i % j));
				break;
			
		}

	}

}
