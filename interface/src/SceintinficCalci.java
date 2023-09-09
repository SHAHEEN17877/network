
public class SceintinficCalci extends Calculatoor implements CalculatorInterface {

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		int c1=a+b;
		System.out.println(c1);
		
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		int c2=a*b;
		System.out.println(c2);
		
	}

	@Override
	public void mod(int a, int b) {
		// TODO Auto-generated method stub
		int c3=a%b;
		System.out.println(c3);
		
	}

	@Override
	public void square(int a) {
		// TODO Auto-generated method stub
		int c4=a*a;
		System.out.println(c4);
		
	}

}
