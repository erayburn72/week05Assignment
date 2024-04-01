package week05Assignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String str) {

		CharSequence cs = "***";
		StringBuffer sbr = new StringBuffer(cs);
		sbr.append(str);
		sbr.append(cs);
		System.out.println(sbr);
	}

	@Override
	public void error(String str) {

		String asterisk = "*";
		String line2 = "***Error: " + str + "***";
		String line = asterisk.repeat(line2.length());
		String text = """
				$line
				$ln
				$line
				""";
		System.out.println(text.replace("$line", line).replace("$ln",line2).replace("$line",line));
		
	}

}
