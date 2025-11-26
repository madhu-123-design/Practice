package Java8Coding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstNonRepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Java articles are Awesome";
		Map<Character, Long> collect = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
	    collect.entrySet().stream().filter(v->v.getValue()==1).findFirst().ifPresent(v1->System.out.print(v1.getKey()));
	   
	}

}
