package static_member;

public class P5 {
	static int i = test();

	public static void main(String[] args) {

		System.out.println("from main");
		System.out.println(P5.i);
		test();
	}

	public static int test() {

		System.out.println("from test");
		System.out.println(P5.i);
		return 25;
	}


}
