
public class CharacterCheckInString {
	public static void main(String[] args)
    {
        String str1 = "Rajkumar is a well known actor";
        String str2 = "well";
        System.out.println("Original String: " + str1);
        System.out.println("Specified sequence of char values: " + str2);
        System.out.println(str1.contains(str2));
    }

}
