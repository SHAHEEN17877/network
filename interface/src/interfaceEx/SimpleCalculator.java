package interfaceEx;

import java.util.Scanner;

public class SimpleCalculator implements Calculator {
	private Scanner scan=new Scanner(System.in);

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("enter two numbers for addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a+b;
		System.out.println("Simple Addition is"+c);
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers for substraction");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a-b;
		System.out.println("Simple substraction is"+c);
		
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers for multiplication");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a*b;
		System.out.println("Multiplication is "+c);
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers for division");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a/b;
		System.out.println("Division is"+c);
		
	}
	

}
