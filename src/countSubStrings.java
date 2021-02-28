import java.util.Scanner;

public class countSubStrings {
    public static void main (String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = inp.nextLine();
        int n = input.length();
        System.out.print("The length of string, using recursion, is: "+countSubstrs(input, 0 , n-1, n));
    }

    public static int countSubstrs(String str, int i, int j, int n){
        if (n==1)
            return 1;
        if (n<=0)
            return 0;

        int res = countSubstrs(str, i+1, j, n-1) + countSubstrs(str, i, j-1, n-1) - countSubstrs(str, i+1, j-1, n-2);

        if (str.charAt(i) == str.charAt(j))
            res++;
        return res;
    }
}
