class pattern9
{
public static void main(String args[])
{
int number=65;
for(int i=0;i<=4;i++)
{
	for(int k=4;k>=i;k--)
	{
		System.out.print(" ");
	}
for(int j=0;j<=i;j++)
{
System.out.print((char)(number+j)+" ");
}
System.out.println();
}
}
}
/*
     A
    A B
   A B C
  A B C D
 A B C D E
 */