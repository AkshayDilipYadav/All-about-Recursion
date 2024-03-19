import java.util.Scanner;
public class Main {

    public static long power(long A, long N){
        if (N == 0){ return 1;}
        if (N %2 ==0){ return power(A, N/2)*power(A, N/2);}
        else {return  power(A, N/2)*power(A, N/2)*A;}
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long N = sc.nextInt();
        long result = power(A, N);
        System.out.println(result);
    }

}