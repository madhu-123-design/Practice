package Java8Coding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesWithCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(c->c,Collectors.counting())).
		entrySet().stream().filter(c->c.getValue()>1).
		collect(Collectors.toMap(entry->entry.getKey(),e->e.getValue()));
		System.out.println(collect);
		
		
		String s = "string data to count each character";
		Map<Character, Long> collect2 = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	    System.out.println(collect2);
	}

}
