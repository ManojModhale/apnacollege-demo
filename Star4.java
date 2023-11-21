import java.util.Scanner;
public class Star4 
{
	private int i,j,k;
	public void display(int l)
	{
		for(i=1;i<=10;i++)
		{
			for(j=1,k=10;j<=10 && k>=1;j++,k--)
			{
				if(i==1 || i==10)
				{
					System.out.print("#");
				}
			    else if(j==1 || j==10 && k==1|| k==10)
				{
					System.out.print("#");
				}
			    else
			    {
			    	System.out.print(" ");
			    }
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Star4 s4=new Star4();
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter range of pattern = ");
		int l=sc4.nextInt();
		s4.display(l);
	}

}

