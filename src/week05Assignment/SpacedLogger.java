package week05Assignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String str) {
		
		str = str.replaceAll(".", "$0 ");
		System.out.println(str);
	}

	@Override
	public void error(String str) {

		str = str.replaceAll(".", "$0 ");
		System.out.println("ERROR: " + str);
	}

	
}
