import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.stream.Collectors;


public final class ImmutableDemo {
	private final int id;
	private final String name;
	private final List<String> mobile;
	 
	ImmutableDemo(int id,String name,List<String> mobile){
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public List<String> getMobile() {
		return new ArrayList<>(mobile);
	}



	@Override
	public String toString() {
		return "ImmutableDemo [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}

	public static void main(String[] args) {
		
		ImmutableDemo immutableDemo = new ImmutableDemo(12, "Mohan",Arrays.stream(new String[] {"1234","56543"})
				.collect(Collectors.toList()));
		immutableDemo.getMobile().add("9999090");  

		System.out.println(immutableDemo.toString());
	}

}
