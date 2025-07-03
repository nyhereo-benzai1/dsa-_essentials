/*Case Time Complexity
        Best case	O(1) (e.g., num = 0 or 1)
        Average case	O(k), where k is number of 1s
        Worst case	O(log n) ≈ O(32) for 32-bit integers*/
import java.util.Scanner;

public class countSetBits {
    static int countSetBits(int num){
        int count = 0 ;
        while ( num != 0){
            count++ ;
            num = (num & (num - 1));
        }
        return count;
    }
    static int countSetBits2(int num){
        int count = 0 ;
        for ( int i = 0 ; i < 32 ; i++){
            if ((num & (1 << i)) != 0) count++ ;
        }
        return count ;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the number to be checked :");
        int num = sc.nextInt() ;
        System.out.println(countSetBits(num)) ;
        System.out.println("using second method the answer is =") ;
        System.out.println(countSetBits2(num)) ;
    }
}
