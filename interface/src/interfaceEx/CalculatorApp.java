package interfaceEx;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m=new Maths();
		m.accept(new SimpleCalculator());
		m.accept(new SceintificCalculator());

	}

}
