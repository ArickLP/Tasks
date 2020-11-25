import java.util.Scanner;


public class task1 {
	public static void main(String[] args)
	{
		System.out.println("Введите два числа");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int t = remainder(n, m);
		System.out.println("Итог " + t);
	}


	public static int remainder(int t1, int t2)
	{
        	return (t1 % t2);
	}
}
