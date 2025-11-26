import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="madhuri";
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char c:s.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for(Map.Entry<Character,Integer> map1:map.entrySet())
		{
			if(map1.getValue()==1)
			{
				System.out.println(map1.getKey());
				break;
			}
		}
		
		
		String s1="mad123 mad";
		int sum=0;
		for(char c1:s1.toCharArray())
		{
			if(Character.isDigit(c1))
			{
			  sum=sum+Character.getNumericValue(c1);	
			}
		}
		System.out.println(sum);
		
		
		String rev="";
		String[] str=s1.split(" ");
		for(int j=0;j<str.length;j++)
		{
			String r=str[j];
			for(int i=r.length()-1;i>=0;i--)
			{
				rev=rev+r.charAt(i);
			}
			rev=rev+" ";
		}
		
		System.out.println(rev.trim());
		
		
		int[] array= {1,2,2,3,4,4,5};
		
	}

}