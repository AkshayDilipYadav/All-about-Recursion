import java.util.Scanner;
public class Main {

    public static long power(long A, long N) {
        if (N == 0) {
            return 1;
        }
        long temp = power(A, N / 2);
        if (N % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * A;
        }
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long N = sc.nextInt();
        long result = power(A, N);
        System.out.println(result);
    }

}