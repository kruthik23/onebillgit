
public class StringArray {
	public static void main(String[] args) {
		String s1 ="java is fun to learn";
		String s2 ="andearn";
		String s3 ="learn share learn  ";
		String s4="learn";
		String s5 ="java";
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("fun"));
		System.out.println(s1.concat(s2));
		boolean check ="java".equals("java");
		System.out.println(check);
		System.out.println(s3.trim());
		String originalString ="java makes the web move";
		String subString= originalString.substring(5);
		System.out.println(subString);
	}

}
