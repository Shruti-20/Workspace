package pattern_program;

public class P1 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0; j<n;j++)
			{
				if(i==2 || (j==0&&i>=2) || (i==1&&(j==1||j==3)) || (i==0&&j==2) || (j==4&&i>=2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");    
				}
			}
			System.out.println();
		}
		
		

	}

}
