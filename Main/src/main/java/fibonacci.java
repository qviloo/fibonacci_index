import java.util.InputMismatchException;
import  java.util.Scanner;

public class fibonacci {

    public static long fib(long i) {
        if (i <= 1) return i;
        long prevFib = 0, currFib = 1;
        for (long k = 0; k < i-1; k++){
            long newFib = prevFib + currFib;
            prevFib=currFib;
            currFib=newFib;
        }
        return currFib;
    }

    public static void main(String[] args) {
        long  i=69;


        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Give me index and i'll give you fibonacci number:");
            i = sc.nextInt();
        }
        catch (InputMismatchException exception) {
            System.out.println("hey man, just give me a number");
        }

        System.out.println("soo, anyway Fibonacci number by index "+i+" is: "+ fib(i));
    }


}