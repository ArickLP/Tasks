import java.util.Scanner;


public class task4 {
	public static void main(String[] args)
	{
		System.out.println("Введите ");
		Scanner in = new Scanner(System.in);

		System.out.print("Prob ");
		double n = in.nextDouble();
		System.out.print("Prize ");
		double m = in.nextDouble();	
		System.out.print("Pay ");
		double k = in.nextDouble();

		double t = profitableGamble(n, m, k);
		
		if (t == 1) 
		{
			System.out.println("true");
		}

		else 
		{
			System.out.println("false");
		}
	}


	public static double profitableGamble(double t1, double t2, double t3)
	{
        	if ((t1 * t2) > t3) 
		{
			return 1;
		}
		
		else 
		{
			return 0;
		}
	}
}
