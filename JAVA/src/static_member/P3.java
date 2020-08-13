package static_member;

public class P3 {

static int i = 90;//global
	
	public static void main(String[] args) {
		System.out.println("local: ");
		int i = 45;//local
		System.out.println(i);//45
		i = 75;//re-initialization of local variable
		System.out.println(i);//75
		System.out.println("======================");
		System.out.println("global: ");
		System.out.println(P3.i);//90
		P3.i = 60;//re-initialization of global variable
		System.out.println(P3.i);
	}
}
