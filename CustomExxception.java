

class ExceptionClass extends Throwable {
	Exception(){
		super();
	}
	Exception(String msg){
		super(msg);
	}
}
public class CustomExxception {
	public static void main(String[] args) {
		int abc =50;
		int def = 0;
	if(def=0) {
			try {
				System.out.println(abc/def);
				}catch (Exception e) {
					e.printStackTrace()
				}
			else {
				int result=abc/def;
			System.out.println(result);
			}
			}
	}

}
