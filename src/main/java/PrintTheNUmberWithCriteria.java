
public class PrintTheNUmberWithCriteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%3==0&&arr[i]%5==0)
			{
				System.out.println("usbdevice");
			}
			else if(arr[i]%3==0)
			{
				System.out.println("usb");
			}else if(arr[i]%5==0)
			{
				System.out.println("device");
			}
			else
			{
				System.out.println(arr[i]);
			}
		}
		

	}

}
