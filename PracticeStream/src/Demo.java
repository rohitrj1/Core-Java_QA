import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.*;

public class Demo {
	
	public static void main(String [] args) {
		
//		List<Integer> lst = Arrays.asList(1,2,3,7,6,9);
//		
//		List<Integer> square = lst.stream().map(x < x*x).collect(Collectors.toList());
		
		  // create a list of integers
		int [] arr= {2,4,5,6,7,10,15};
        List<Integer>number = Arrays.stream(arr).boxed().collect(Collectors.toList());
       
        System.out.println("foreach");
        
        number.forEach(element->{
        	System.out.println(element+" ");
        });
 
        // demonstration of map method
        List<Integer> square
            = number.stream().map(x -> x * x).collect(
                Collectors.toList());
        System.out.println(square);
        
        List<String> filterString = Arrays.asList("Mohan","Sohan","Rakesh");
       List<String> ans = filterString.stream().filter(s->s.startsWith("R")).collect(Collectors.toList());
        System.out.println(ans);
        
//      List<String> sortString =  filterString.stream().sorted().map(s-> s.length()).forEach(System.out::println);
        filterString.stream().map(str -> str.length()).forEach(System.out::println);
//      System.out.print(sortString);
        
		
	}

}
