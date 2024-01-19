public class SingletonC {

	private static SingletonC c =null;
	public String s;
	private SingletonC() {
		
	}
	
	public static synchronized SingletonC getInstance() {
		if(c== null) 
			c =  new SingletonC();
		return c;
	}
	
	public static void main(String[] args) {
		SingletonC s1 = new SingletonC();
		SingletonC s2 = getInstance();
		System.out.println(s1);
		System.out.println(s2);
	}
}
