class p5to1S1to9P1to4S7to1star
{
	public static void main (String arg[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print("=");
			}
			for(int k=1; k<=i*2-1; k++)
			{
				System.out.print("+");
			}
			System.out.println();
		}
		for(int l=2; l<=5; l++)
		{
			for(int m=1; m<=l; m++)
			{
				System.out.print("=");
			}
			for(int n=9; n>=l*2-1; n--)
			{
				System.out.print("+");
			}
			System.out.println();		
		}
	}
}
/*

Output
=====+
====+++
===+++++
==+++++++
=+++++++++
==+++++++
===+++++
====+++
=====+

*/
