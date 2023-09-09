package interfaceEx;

import java.util.Scanner;

public class SceintificCalculator implements Calculator{
	private Scanner scan=new Scanner(System.in);

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("enter two numbers for addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a==0||b==0) {
			System.out.println("go to LKG");
		}
		else {
			int c=a+b;
			System.out.println("Sceintific addition is "+c);
		}
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers for substarction");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a==0||b==0) {
			System.out.println("Go to LKG");
		}
		else {
			int c=a-b;
			System.out.println("Sceintific Substarction is"+c);
		}
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers for multiplication");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a==0||b==0) {
			System.out.println("Go to LKG");
		}
		else
		{
			int c=a*b;
			System.out.println("DSceintific multiplication "+c);
		}
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method 
       System.out.println("Enter two numbers for division");
       int a=scan.nextInt();
       int b=scan.nextInt();
       if(a==0||b==0) {
    	   System.out.println("Go to LKG");
       }
       else
       {
    	   int c=a/b;
    	   System.out.println("Scentific Division is "+c);
       }
		
	}

}
