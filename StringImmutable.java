
public class StringImmutable {
	public static void main(String[] args) {
		String s1="CRIC";
		String s2="CRIC";
		System.out.println(s1=s2);
		s1 = s1 + "J2EE";
		System.out.println(s1=s2);
	}

}
