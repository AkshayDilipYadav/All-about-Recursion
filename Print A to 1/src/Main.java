import java.util.Scanner;

public class Main {

    public static void printNumber(int A) {
        if (A == 0) {
            return;
        }

        System.out.print(A + " ");
        printNumber(A - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        printNumber(A);
    }
}