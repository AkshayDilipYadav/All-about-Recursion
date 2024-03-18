import java.util.Scanner;

public class Main {

    public static int findFactorial (int A){
        if (A ==0 || A ==1){return 1;}
        return A * findFactorial(A-1);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();

        int result =findFactorial(A);
        System.out.println(result);

    }

}