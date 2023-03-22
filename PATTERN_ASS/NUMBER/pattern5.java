class pattern5
{
	public static void main(String args[])
	{
	int number=65;
	for(int i=0;i<=4;i++)
	{
		for(int j=0;j<=i;j++)
		{
		System.out.print((char)(number+i)+" ");
		}
	System.out.println();
	}
	}
}
/*
A
B B
C C C
D D D D
E E E E E
*/
