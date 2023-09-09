package rbiEx;

public interface RBIStandard {
	void withdraw();
	void balance();
	void miniStatement();
	default void withdrawLimits() {
		System.out.println("withdraw limits is 200 per day");
	}
	 static void denominationType() {
		 System.out.println("500 and thousand rs notes are not available");
		 
	 }

}
