package shape;

public interface Shape {
	float pi=3.147f;
	void findArea();
	void displayArea();

}
//after compilation
/*
 public interface Shape {
	public static final float pi=3.147f;
public abstract void  findArea();
	 public abstract void displayArea();
*/
