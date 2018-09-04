/* Testcase for 252 Sim 1.
 *
 * Author: David Minch, based off of code by Russ Lewis
 */

public class Test_DA_2sComplement
{
	public static void main(String[] args)
	{
		Sim1_2sComplement p = new Sim1_2sComplement();

		p.in[ 0].set(false);
		p.in[ 1].set(false);
		p.in[ 2].set(true);
		p.in[ 3].set(true);
		p.in[ 4].set(false);
		p.in[ 5].set(true);
		p.in[ 6].set(true);
		p.in[ 7].set(false);
		p.in[ 8].set(true);
		p.in[ 9].set(true);
		p.in[10].set(true);
		p.in[11].set(false);
		p.in[12].set(true);
		p.in[13].set(true);
		p.in[14].set(true);
		p.in[15].set(false);
		p.in[16].set(true);
		p.in[17].set(true);
		p.in[18].set(true);
		p.in[19].set(false);
		p.in[20].set(true);
		p.in[21].set(true);
		p.in[22].set(true);
		p.in[23].set(true);
		p.in[24].set(true);
		p.in[25].set(false);
		p.in[26].set(false);
		p.in[27].set(false);
		p.in[28].set(true);
		p.in[29].set(true);
		p.in[30].set(true);
		p.in[31].set(false);

		p.execute();

		System.out.printf("  ");
		print_bits(p.in);
		System.out.print("\n");


		System.out.printf("----------------------------------\n");

		System.out.printf("  ");
		print_bits(p.out);
		System.out.printf("\n");


		System.out.printf("\n");

	}

	public static void print_bits(RussWire[] bits)
	{
		for (int i=31; i>=0; i--)
		{
			if (bits[i].get())
				System.out.print("1");
			else
				System.out.print("0");
		}
	}

	public static char bit(boolean b)
	{
		if (b)
			return '1';
		else
			return '0';
	}
}

