import java.util.Scanner;

public class powerOfTwoNum {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the num :") ;
        int num  = sc.nextInt() ;
        System.out.println(isPowerOfTwo(num));
    }
}
