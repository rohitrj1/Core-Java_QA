import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
			//	Lambda experssion with functional interface	
//	MyFunction myFunction =	(i) -> i*10;
//
//		System.out.println("this return integer type " + myFunction.run(15));
//		
//		 Stream Prcatice
		
		List<Integer> list = Arrays.asList(23,4,5,6,12,76);
		
//		list.stream().filter(i -> i > 4).sorted().forEach(System.out::println);
		
		List<User> user = Stream.of(
				new User("Mohan",989798779,Arrays.asList("rk786@gmail.com","est43@gmail.com")),
				new User("Sohan",878678675,Arrays.asList("mohn6@gmail.com","iut56@gmail.com")))
				.collect(Collectors.toList());
		
	
		List<Integer> collect = user.stream().map(User::getPhone).collect(Collectors.toList());
//		System.out.println(collect);
		
		List<String> collect2 = user.stream().flatMap(m->m.getEmail().stream()).collect(Collectors.toList());
		System.out.println(collect2);
		
		String str = "anbanbcdece";
		
		Map<String, Long> collect3 = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
//		System.out.println(collect3);
		
		List<Employee> employess = Stream.of(
				new Employee(1,"Basant" ,"DEV",50000),
				new Employee(2,"Santosh" ,"DEV",80000),
				new Employee(3,"Pratik" ,"QA",60000),
				new Employee(4,"Deepak" ,"QA",90000),
				new Employee(4,"Vikash" ,"DEVOPS",40000)).collect(Collectors.toList());
		
		// approach 1
			Comparator<Employee> compareBySal = Comparator.comparing(Employee::getSal);
			
			Map<String, Optional<Employee>> collect4 = employess.stream()
					.collect(Collectors.groupingBy(Employee::getDept,Collectors.reducing(
					BinaryOperator.maxBy(compareBySal))));
			System.out.println(collect4);
		
	
	


	}

}
