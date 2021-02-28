import java.util.stream.IntStream;
import java.util.Scanner;

public class factorial {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter value to enter: ");
        int factInput = input.nextInt();
        int outputRecursion = factorialUsingRecursion(factInput);
        int outputLoops = factorialUsingForLoops(factInput);
        int outputStreams = factorialUsingStreams(factInput);
        System.out.print("For factorials using Recursion: "+outputRecursion+"\nFor factorials using loops: "+outputLoops+"\nFor factorials using streams: "+outputStreams);
    }

    public static int factorialUsingForLoops(int n){
        long startTime = System.nanoTime();
        methodToTime();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact = fact * i;
        return fact;
    }

    public static int factorialUsingStreams(int n){
        return IntStream.rangeClosed(1,n).reduce(1, (int x, int y) -> x * y);
    }

    public static int factorialUsingRecursion(int n){
        if (n==1)
            return n;
        return n * factorialUsingRecursion(n-1);
    }
}
