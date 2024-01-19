
public class Test extends Parent{
	
	public void demo11() {
		System.out.println("Test");
//		super.demo11();
	}
	
	Test(){
		
		
	}
	
	public void check(){
		super.demo();
		this.demo11();
		
	}

	{
		System.out.println("instance block");
	}
	
	static
	{
		
		System.out.println("static block");
	}
	
	
	

	public static void main(String[] args) {
		Parent p = new Test();

		
		Test t = new Test();
		t.check();

	}
	

}
