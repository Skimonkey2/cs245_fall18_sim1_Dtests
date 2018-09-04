/* Testcase for 252 Sim 1.
 *
 * Author: Russ Lewis
 */

public class Test_D3_NOT
{
	public static void main(String[] args)
	{
		Sim1_NOT p[] = new Sim1_NOT[2];

                for (int i = 0; i < 2; i++){
                        p[i] = new Sim1_NOT();
                }

                p[0].in.set(false);
  
                p[1].in.set(true);

                for (int i = 0; i < 2; i++){
                        p[i].execute();
                        System.out.printf("Test %d: in=%c, out=%c\n",i, bit(p[i].in.get()), bit(p[i].out.get()));
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

