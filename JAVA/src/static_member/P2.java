package static_member;

public class P2 {
		static
		{
			int x=10;
			System.out.println( x++);
			
			}
		static int i = 10;//global

		public static void main(String[] args) {
			
			int i = 20;//local
			
			System.out.println(P2.i);//10-global 
			System.out.println(i);//20-local 
		}
	
}
