import  java.util.Scanner;

public class fibonacci {

    public static int fib(int i) {
        if (i <= 1) return i;
        return fib(i - 1) + fib(i - 2);
    }

    public static void main(String[] args) {
        int i;
        System.out.println("Give me index and i'll give you fibonacci number:");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();

        System.out.println("soo, anyway Fibonacci number by index "+i+" is: "+ fib(i));
    }


}