
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		int myNum = 5;
		String name ="Geetha";
		char letter ='g';
		double dec = 5.99;
		boolean myCard = true;
		System.out.println(myNum + " is the value stored in the myNum variable");
		System.out.println(name);

		//Arrays
		int[] arr= new int[5];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=3;
		arr[4]=4;
		
		int[] arr2 = {0,1,2,3,4};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		String[] names= {"geetha","anand","vignesh","vanathi"};
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		//Enhanced for loop
		System.out.println("Enhanced for loop");
		for(String s:names) {
			System.out.println(s);
		}
	}

}
