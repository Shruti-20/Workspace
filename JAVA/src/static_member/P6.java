package static_member;

public class P6 {
static int i = test1();
	
	static int j = test1()+test2();
	public static void main(String[] args) {
		
		System.out.println("main begins");
		System.out.println(P6.i);
		System.out.println(P6.j);
	}
	
	public static int test1() {
		
		System.out.println("from test-1");
		System.out.println(P6.i);
		System.out.println(P6.j);
		return 20;
	}
	public static int test2() {
		
		System.out.println("from test-2");
		System.out.println(P6.i);
		System.out.println(P6.j);
		return ( 10 + test1() );
	}

}
