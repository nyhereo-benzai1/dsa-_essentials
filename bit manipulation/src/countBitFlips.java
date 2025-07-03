import java.util.Scanner;

public class countBitFlips {
    public static int minBitFlips(int start, int goal) {
        int num = start ^ goal ;
        int count = 0 ;
        for(int i = 0 ; i < 32 ; i++){
            if ( (num & (1 << i)) != 0) count++ ;
        }
        return count ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the start num:");
        int start= sc.nextInt() ;
        System.out.println("enter the end num :");
        int goal = sc.nextInt() ;
        System.out.println(minBitFlips(start , goal)) ;
    }
}
