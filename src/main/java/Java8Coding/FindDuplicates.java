package Java8Coding;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 List<Integer> list = myList.stream().collect(Collectors.groupingBy(c1->c1,Collectors.counting())).
				 entrySet().stream().filter(k->k.getValue()>1).map(k1->k1.getKey()).toList();
		 System.out.println(list);
		 
		 Set<Integer> collect = myList.stream().collect(Collectors.toSet());
		 System.out.println(collect);
	}

}
