package nonstatic_members;

public class P1 {
int i;//non-static variable
	
	public static void main(String[] args) {
		
		P1 a = new P1();
		System.out.println(a);
		System.out.println(a.i);
	}

}
