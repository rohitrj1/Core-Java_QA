import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,2,8,5,89,34,67,99);
		
		list.stream().filter(m -> m>5).sorted().forEach(System.out::println);
		
		List<User> listUser = (List<User>) Stream.of(new User("user1","9879878889",Arrays.asList(null)));
		
		
	}

}
