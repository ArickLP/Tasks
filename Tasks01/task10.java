import java.util.Scanner;


public class task10{
	public static void main(String[] args)
	{
		System.out.println("Введите a b c");
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		boolean t = abcmath(a, b, c);
		System.out.print(t);

	}

public static boolean abcmath(int a, int b, int c)
	{

		int summ = a;

		for (int i = 0; i < b; i++)
		{

			summ = 2 * summ;
		}

		if ((summ % c) == 0)
		{

			return true;

		}

		else
		{

			return false;

		}
	}
}