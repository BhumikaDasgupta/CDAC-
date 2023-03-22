class pattern18
{
	public static void main(String args[])
	{
		int number=65;		
		for(int i=4;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
			System.out.print((char)(number+j)+" ");
			}
		System.out.println();
	}
	}
}
/*
A B C D E
A B C D
A B C
A B
A
*/