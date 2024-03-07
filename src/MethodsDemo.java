import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo d = new MethodsDemo();
		String r = d.getData();		
		System.out.println(r);
		
		String s = getStaticData();
		System.out.println(s);
		
		MethodsDemo2 d2 = new MethodsDemo2();
		String u = d2.getUserData();
		System.out.println(u);

	}

	public String getData() {
		System.out.println("hello world");
		return "rahul";
				
	}
	//access static method in class level
	public static String getStaticData() {
		System.out.println("hello world static");
		return "static";
				
	}
}
