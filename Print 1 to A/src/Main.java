import java.util.Scanner;

public class Main {

    public static void printNumber(int A) {
        if (A == 0) {
            return;
        }
        printNumber(A - 1);
        System.out.print(A + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        printNumber(A);
    }
}