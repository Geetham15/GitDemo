import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		
		//ArrayList
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("geetha1");
		a.add("anand1");
		a.add("vignesh1");
		a.add("selenium");
		//a.remove(2);
		System.out.println(a.get(3));
		
		for(int i=0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println(("*********"));
		for(String s: a) {
			System.out.println(s);
		}
		
		//item is present in Arraylist
		System.out.println(a.contains("selenium"));
		
		String[] name= {"rahul","shetty","selenium"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("selenium"));
	}

}
