import java.util.Scanner;


public class task5 {
	public static void main(String[] args)
	{
		System.out.println("Введите N, a, b");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = in.nextInt();
        System.out.print("Введите число a : ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        System.out.println(operation(N, a , b));
    }
    public static String operation(int N, int a, int b){
        if (a + b == N){
            return   "Нужно выполнить сложение" ;
        }
        else if (a - b == N){
            return  "Нужно выполнить вычитание" ;
        }
        else if (a * b == N){
            return  "Нужно выполнить умножение" ;
        }
        else if (a / b == N){
            return "Нужно выполнить деление" ;
        }
        else{
            return  "Число N нельзя получить ни одной операцией из чисел a и b" ;
        }
    }
}