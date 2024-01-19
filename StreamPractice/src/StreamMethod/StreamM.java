package StreamMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamM {

	public static void main(String[] args) {

		int arr[] = { 3, 2, 6, 3, 8, 9, 2, 8 };

		List<String> vehicleLst = Arrays.asList("bus", "car", "motobike", "bus", "train", "car");

//		List<Integer> duplicate = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
//		List<Integer> duplicate = IntStream.of(arr)    // returns IntStream
//                .boxed()
//                .collect(Collectors.toList());
//		duplicate.stream().distinct().forEach(System.out::println);
		
		
		
		String str = "aanewrnetqpopo";
		String [] res = str.split("");
//		System.out.println(Arrays.toString(res));
		
		// counting occurance string
		
		Map<String, Long> map = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
//		System.out.println(map);
		
			int a[] = {1,2,3,1,5,3,7,6,5,9,2};
			Map<Integer, Long> collect = Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()));
			System.out.println(collect);
			
		
		/* duplicate element in a string */
		
		List<String> duplicateelmt  = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(m -> m.getValue()>1)
				 .map(m-> m.getKey())
				.collect(Collectors.toList());
		
//		System.out.println(duplicateelmt);
		
		
	
		
	}
	


	

}
