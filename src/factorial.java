import java.util.stream.IntStream;

public class factorial {

    public static void main(String args[]){
        int recursionFact = factorialUsingRecursion(5);
        System.out.println(recursionFact);

        int loopsFact = factorialUsingForLoops(5);
        System.out.println(loopsFact);

        int streamsFact = factorialUsingStreams(5);
        System.out.println(streamsFact);
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
