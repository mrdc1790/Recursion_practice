import java.util.Scanner;

public class copyString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = input.nextLine();
        char s1[] = str.toCharArray();
        char s2[] = new char[s1.length];
        int index = 0;
        myCopy(s1, s2, index);
        System.out.println(String.valueOf(s2));
    }

    public static void myCopy(char s1[], char s2[], int index){
        s2[index] = s1[index];
        if (index == s1.length-1)
            return;
        myCopy(s1, s2, index+1);
    }
}
