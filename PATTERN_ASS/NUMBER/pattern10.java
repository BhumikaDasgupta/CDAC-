class pattern10
{
	public static void main(String args[])
	{
		int number=65;	
		for(int i=4;i>=0;i--)
		{
			for(int k=1;k<=i;k++)
			{
			System.out.print(" ");	
			}
			for(int j=i;j<=4;j++)
			{
			System.out.print((char)(number+j)+" ");
			}
		System.out.println();
		}
	}
}
/*
    E
   D E
  C D E
 B C D E
A B C D E
*/