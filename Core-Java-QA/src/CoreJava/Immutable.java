package CoreJava;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public final class Immutable {
	
	private final String name;
	private final Date date;
	private final List<String> list;
	private final Address address;
	public Immutable(String name, Date date, List<String> list,Address address) {
		super();
		this.name = name;
		this.date = date;
		this.list = list;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public Date getDate() {
		return (Date) new Date().clone();
	}
	
	public List<String> getList() {
		return new ArrayList<>(list);
	}
	
	public Address getAddress() {
		return new Address(address.getCity(),address.getZip());
	}

	
	@Override
	public String toString() {
		return "Immutable [name=" + name + ", date=" + date + ", list=" + list + ", address=" + address + "]";
	}
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		l.add("1223");
		l.add("456");
		
		Address adress = new Address("Banglore", "1234");
		
		Immutable immutable = new Immutable("Rohan", new Date(),l,adress);
		
		immutable.getDate().setDate(20);
		immutable.getList().add("9876");
		immutable.getAddress().setCity("Delhi");
		System.out.println(immutable);
		
		String str = "Unknown";
		
		char [] ch = new char[] {'U','n','k','n','o','w','n'};
		System.out.println(str);
		System.out.print(ch.toString());
		
	}
	
	

}
