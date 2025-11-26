import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInIntergerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {1,2,3,4,1,2,3,5,6};
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<array.length;i++)
		{
			map.put(array[i],map.getOrDefault(array[i],0)+1);
		}
		System.out.println(map);
		for(Map.Entry<Integer, Integer> m:map.entrySet())
		{
			if(m.getValue()>1)
			{
				System.out.println(m.getKey());
			}
		}
	}

}
