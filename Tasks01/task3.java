import java.util.Scanner;
import java.math.*;

public class task3 {
	public static void main(String[] args)
	{
		System.out.println("Введите количество животных");
		Scanner in = new Scanner(System.in);

		System.out.print("Куры ");
		int n = in.nextInt();
		System.out.println();
		System.out.print("Коровы ");
		int m = in.nextInt();	
		System.out.println();
		System.out.print("Свиньи ");
		int k = in.nextInt();
		System.out.println();

		int t = animals(n, m, k);
		System.out.println("Количество ног " + t);
	}



	public static int animals(int t1, int t2, int t3)
	{
        	return ((2 * t1) + (4 * t2) + (4 * t3));
	}
}
