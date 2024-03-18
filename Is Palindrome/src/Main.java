import java.util.Scanner;
public class Main {

    public int isPalindrome (String A){
        return isPalindromeHelper(A, 0, A.length() -1)? 1:0;
    }

    private boolean isPalindromeHelper (String A, int start, int end){
        if (start >= end){return true;}
        if (A.charAt(start) != A.charAt(end)){ return false;}
        return isPalindromeHelper(A, start + 1, end -1);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        Main main = new Main();
        System.out.print(main.isPalindrome(A));
    }
}