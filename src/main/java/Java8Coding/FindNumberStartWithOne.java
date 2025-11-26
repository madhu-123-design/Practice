package Java8Coding;

import java.util.Arrays;
import java.util.List;

public class FindNumberStartWithOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		
		myList.stream().map(n->String.valueOf(n)).filter(n1->n1.startsWith("1")).forEach(System.out::println);
	}

}
