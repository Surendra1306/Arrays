package Dsa_Arrays;

public class Fibonacci {
	
    static void fib(int n)
    {
        int num1 = 0, num2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
	
    static int fibRec(int n)
    {
        if (n <= 1)
            return n;

        return fibRec(n - 1) + fibRec(n - 2);
    }
    
	public static void main(String[] args) {
		int n = 10;
		fib(n);    
		System.out.println(" ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibRec(i) + " ");
        }
	}
}
