package Java8Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcanateTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("Java", "8");
		List<String> list2 = Arrays.asList("explained", "through", "programs");
		
		Stream<String> concat = Stream.concat(list1.stream(),list2.stream());
		concat.forEach(System.out::print);
	}

}
