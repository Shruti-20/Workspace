package static_member;

public class P1 {

	public static void main(String[] args) {	
		System.out.println(i);
		laila();
		sheela();
	}
	
	static int i;//static-global variable
	
	public static void laila() {
	
		System.out.println(i);
	}	
	public static void sheela() {
	
		System.out.println(i);
	}
}
