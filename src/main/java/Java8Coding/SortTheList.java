package Java8Coding;

import java.util.Arrays;
import java.util.List;

public class SortTheList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		List<Integer> list = myList.stream().sorted().toList();
		System.out.println(list);
		
		List<Integer> list2 = myList.stream().sorted((a,b)->b.compareTo(a)).toList();
		System.out.println(list2);
	}

}
