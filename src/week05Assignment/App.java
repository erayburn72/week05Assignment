package week05Assignment;

public class App {

	public static void main(String[] args) {

		String str = "Hello";
		
		System.out.println("AsteriskLogger in Action!");
		
		AsteriskLogger al = new AsteriskLogger();
		al.log(str);
		
		al.error(str);
		
		System.out.println("SpacedLogger in Action!");
		
		SpacedLogger sl = new SpacedLogger();
		sl.log(str);
		
		sl.error(str);
		
		System.out.println("DONE!!!!");
		
		
		
		
		
	}

}
