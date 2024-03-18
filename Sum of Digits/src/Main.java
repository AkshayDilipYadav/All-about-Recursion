import java.util.Scanner;
public class Main {
    public static int sumOfDigits(int A){
        if (A < 10){ return A;}
        return A % 10 + sumOfDigits(A/10);
    }
    public static void main (String[] args){
        Scanner sc  = new Scanner (System.in);
        int A = sc.nextInt();
        Main main = new Main();
        System.out.print(main.sumOfDigits(A));
    }
}