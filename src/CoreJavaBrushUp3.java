import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// String is an object
		//String literal
		//String s = "Rahul shetty Academy";
		//String s1 = "Rahul shetty Academy";
		String s5= "hello";
		//new
		String s2 = new String("Welcome");
		String s3= new String("Welcome");
		

		String s = "Rahul shetty Academy";
		String[] splittedString = s.split(" ");
		
		for( String val: splittedString) {
			System.out.println(val);
		}
		
		for(int i=0; i<s.length();i++) {
			System.out.println(s.charAt(i)); 
		}
		//print in reverse order
		System.out.println("Print in reverse order");
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}

}
