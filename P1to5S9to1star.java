class P1to5S9to1star
{
	public static void main (String arg[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("=");
			}
			for(int k=9; k>=i*2-1; k--)
			{
				System.out.print("+");
			}
			System.out.println();
		}
	}
}
/*

Output
=+++++++++
==+++++++
===+++++
====+++
=====+

*/
