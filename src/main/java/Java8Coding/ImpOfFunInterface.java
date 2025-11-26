package Java8Coding;

import java.util.Arrays;
import java.util.List;

public class ImpOfFunInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting greet=(name)->System.out.print("Hello");
		greet.sayHello("madhuri");
		
		
		List<String> names = Arrays.asList("Madhuri", "Pankaj", "Vasudev");
		names.forEach(name->System.out.println(name));
	}

}
