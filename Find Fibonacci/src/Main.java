import java.util.Scanner;

public class Main {

    public static int fibonacci(int A){
        if (A == 0){return 0;}
        else if (A ==1){return 1;}
        return fibonacci(A-1) + fibonacci(A-2);
    }
    public static void main (String[] args) {
Scanner sc = new Scanner (System.in);
int A = sc.nextInt();

int result =fibonacci(A);
System.out.println(result);

    }
}