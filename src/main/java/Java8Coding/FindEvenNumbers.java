package Java8Coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
	      List<Integer> list2 = list.stream().filter(e->e%2==0).toList();
	      System.out.println(list2);

	      /* When numbers are given as Array */
	      
	      int[] arr = {10,15,8,49,25,98,32};
	      Map<Boolean, List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(e1->e1%2==0));
	      System.out.println(collect.get(true));
	}

}
