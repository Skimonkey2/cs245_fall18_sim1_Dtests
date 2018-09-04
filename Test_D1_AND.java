/* Testcase for 252 Sim 1.
 *
 * Author: Russ Lewis
 */

public class Test_D1_AND
{
	public static void main(String[] args)
	{
		Sim1_AND p[] = new Sim1_AND[4];

                for (int i = 0; i < 4; i++){
                        p[i] = new Sim1_AND();
                }

                p[0].a.set(false);
                p[0].b.set(false);
  
                p[1].a.set(true);
                p[1].b.set(false);

                p[2].a.set(false);
                p[2].b.set(true);

                p[3].a.set(true);
                p[3].b.set(true);


                for (int i = 0; i < 4; i++){
                        p[i].execute();
                        System.out.printf("Test %d: a=%c, b=%c, out=%c\n",i, bit(p[i].a.get()), bit(p[i].b.get()), bit(p[i].out.get()));
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

