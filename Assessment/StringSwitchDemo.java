
public class StringSwitchDemo {
public static void main(String[] args) {
	

	String command="cancel";
	Switch(command){
		case "connect" : System.out.println("connect");
				       break;
		case "cancel" : System.out.println("cancel");
		                   break;
	}
}
}