package Java8Coding;

import java.util.Arrays;
import java.util.List;

public class FindMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 myList.stream().max((a,b)->a.compareTo(b)).ifPresent(System.out::println);
		 myList.stream().min((a,b)->a.compareTo(b)).ifPresent(System.out::print);
	}

}
