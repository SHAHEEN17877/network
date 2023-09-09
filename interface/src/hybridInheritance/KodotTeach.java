package hybridInheritance;

public  class KodotTeach implements EdTeach{

	@Override
	public void developProduct() {
		// TODO Auto-generated method stub
		System.out.println("product developed");
		
	}

	@Override
	public void BuildProject() {
		// TODO Auto-generated method stub
		System.out.println("we builded project of driver hiring manangement system");
		
	}

	@Override
	public void buildsoftware() {
		// TODO Auto-generated method stub
		System.out.println("software was builted");
		
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("Lecturers teach us very well in doing project");
	}

	@Override
	public void opportunites() {
		// TODO Auto-generated method stub
		System.out.println("we got placement opportunities");
		
	}

	@Override
	public void performProjectTesting() {
		// TODO Auto-generated method stub
		System.out.println("We tested our project");
		
	}

	@Override
	public void performProductTesting() {
		// TODO Auto-generated method stub
		System.out.println("we performed product testing");
		
	}

public static void main(String[]args) {
	KodotTeach k=new KodotTeach();
	k.BuildProject();
	k.buildsoftware();
	k.performProjectTesting();
	k.performProductTesting();
	k.teach();
	k.developProduct();
}
}
	
	
	


