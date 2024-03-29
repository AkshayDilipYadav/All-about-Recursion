import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

    public static void towerOfHanoi (int n, char from_rod, char to_rod, char aux_rod ){
        if (n == 0){
            return;
        }
        towerOfHanoi(n -1, from_rod, aux_rod, to_rod);
        System.out.println( n + " " + from_rod + " "+ to_rod);
        towerOfHanoi(n -1, aux_rod, to_rod, from_rod);

    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();

        towerOfHanoi(N, 'A' , 'C' , 'B');
    }
}