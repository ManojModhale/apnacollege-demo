import java.util.Scanner;
public class Star2 
{
	private int i,j;
	public void display(int l)
	{
		for(i=1;i<=l;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Star2 s2=new Star2();
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter range of pattern = ");
		int l=sc2.nextInt();
		s2.display(l);
	}

}
