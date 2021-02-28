import java.util.stream.IntStream;
import java.util.Scanner;

public class factorial {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter value to enter: ");
        int factInput = input.nextInt();
        long startTimeRecursion = System.nanoTime();
        int outputRecursion = factorialUsingRecursion(factInput);
        long endTimeRecursion = System.nanoTime();
        long durationRecursion = (endTimeRecursion - startTimeRecursion);
        long startTimeLoops = System.nanoTime();
        int outputLoops = factorialUsingRecursion(factInput);
        long endTimeLoops = System.nanoTime();
        long durationLoops = (endTimeLoops - startTimeLoops);
        long startTimeStreams = System.nanoTime();
        int outputStream = factorialUsingRecursion(factInput);
        long endTimeStreams = System.nanoTime();
        long durationStreams = (endTimeStreams - startTimeStreams);
        System.out.print("For factorials using Recursion: "+outputRecursion+" and took "+durationRecursion+" nanoseconds.\nFor factorials using loops: "+outputLoops+" and took "+durationLoops+" nanoseconds.\nFor factorials using streams: "+outputStream+" and took "+durationRecursion+" nanoseconds.");
    }

    public static int factorialUsingForLoops(int n){
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
