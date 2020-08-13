package static_member;

public class P4 {
	static int i = 20;//i=20 is the static initializer
	
	public static void main(String[] args) {
		
		System.out.println("from main");
		System.out.println(P4.i);

	}

}
