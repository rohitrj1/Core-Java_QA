package CoreJava;

public class Notes {
	public static void main(String[] args) {
		
		String s1 = new String("javatechie");
		String s2 = "javatechie";
		
		System.out.println(s1.intern());
		System.out.println(s1.intern().hashCode()==s2.hashCode());
	}

}
 