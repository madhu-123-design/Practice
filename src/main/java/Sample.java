import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,3,2,4,5,6,7,8,19,30);
		
		
		int sum = list.stream().mapToInt(n->n).sum();
		System.out.println(sum);

		 List<Integer> l= list.stream().filter(i->String.valueOf(i).startsWith("1")).map(k->Integer.valueOf(k)).collect(Collectors.toList());

		 List<Integer> list2 = list.stream().map(i->""+i).filter(s->s.startsWith("1")).map(m->Integer.valueOf(m)).toList();
		 
         System.out.println(list2);

         
         
         
         Map<Integer,String> map=new HashMap<>();
         map.put(1, "A");
         map.put(2, "B");
         map.put(3, "C");
         map.put(4, "D");
         map.put(5, "E");
         
         System.out.println(map);
         
         List<Integer> list3 = map.entrySet().stream().map(e->e.getKey()).toList();
         System.out.println(list3);
		
         
         String s="madhurim";
         Map<Character, Long> collect = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
         System.out.println(collect);
         
         List<Character> collect2 = collect.entrySet().stream().filter(m->m.getValue()>1).map(l1->l1.getKey()).collect(Collectors.toList());
         System.out.println(collect2);
         
         
         List<Integer> l1=Arrays.asList(1,3,2,4,5,6,6,8,19,30);
         Map<Integer, Long> collect3 = l1.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
         collect3.entrySet().stream().filter(v->v.getValue()>1).forEach(k->System.out.println(k.getKey()));
         
         String str="mmadhuri";
         Map<Character, Long> collect4 = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
         System.out.println(collect4);
		
         
         List<Integer> sort=Arrays.asList(1,3,2,4,5,6,6,8,19,30);
         List<Integer> collect5 = sort.stream().sorted((a,b)->b-a).collect(Collectors.toList());
         System.out.println(collect5);
         
         List<Integer> max=Arrays.asList(1,3,2,4,5,6,6,8,19,30);
         Optional<Integer> first = max.stream().sorted((a,b)->b-a).findFirst();
         first.ifPresent(System.out::print);
         
         Optional<Integer> max2 = max.stream().max((a,b)->a.compareTo(b));
	}
	
	

}
