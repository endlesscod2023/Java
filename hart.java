class hart
{
	public static void main (String arg[])
	{
		for(int i=1; i<=5; i++)
			{
			for(int j=5; j>=i; j--)
				{
				System.out.print("-");
				}
				for(int k=1; k<=i*2-1; k++)
					{
					System.out.print("+");
					}
					for(int a=9; a>=i*2-1; a--)
						{
						System.out.print("-");
						}
						for(int b=1; b<=i*2-1; b++)
							{
							System.out.print("+");
							}
							System.out.println();
			}
			for(int l=2; l<=10; l++)
				{
				for(int m=1; m<=l; m++)
					{
					System.out.print("-");
					}
					for(int n=19; n>=l*2-1; n--)
						{
						System.out.print("+");
						}
						System.out.println();
				}
	}
}
/*

Output
-----+---------+
----+++-------+++
---+++++-----+++++
--+++++++---+++++++
-+++++++++-+++++++++
--+++++++++++++++++
---+++++++++++++++
----+++++++++++++
-----+++++++++++
------+++++++++
-------+++++++
--------+++++
---------+++
----------+

*/
