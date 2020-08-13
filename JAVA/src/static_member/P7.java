package static_member;

public class P7 {
	static int a = snake()+mangoose();
	static double b = mangoose() ;	
	public static void main(String[] args) {	
		System.out.println("main begins");
		lion();
		System.out.println(a);
		System.out.println(b);
	}
	public static int snake() {	
		System.out.println("snake sees mangoose");
		System.out.println(a);
		System.out.println(b);
		return 15+lion();
	}
	public static int mangoose() {
		System.out.println("mangoose fights with snake");
		System.out.println(a);
		System.out.println(b);
		return 25+snake();
	}
	public static int lion() {
		System.out.println("lion watches the fight");
		System.out.println(a);
		System.out.println(b);
		return 35;
	}

}
