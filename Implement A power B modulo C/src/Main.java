import java.util.Scanner;
public class Main {

    public int pow (int A, int B, int C){
        if (B == 0){
            return 1 % C;
        }
        long result;
        if (B % 2 ==0){
            long temp = pow(A, B/2, C);
            result = (temp * temp) % C;
        }
        else {
            long temp = pow (A, B-1, C);
            result = (A % C * temp) % C;
        }
        return (int)((result + C)% C);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        Main main = new Main();
       System.out.print(main.pow(A, B, C));



    }
}