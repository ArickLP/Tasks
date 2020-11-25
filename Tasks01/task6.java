import java.util.Scanner;


public class task6 {
	public static void main(String[] args)
	{
		System.out.println("Введите символ");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char[] ch = s.toCharArray();
		int ascii = ch[0];
		System.out.println(ascii);
	}
}