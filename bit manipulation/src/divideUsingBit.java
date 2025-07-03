// time complexity - O(1)
// space complexity - O(1)
import java.util.* ;
class divideUsingBit {
    public static int divide(int dividend, int divisor) {
        if ( dividend == 0) return 0 ;
        if ( dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE  ;

        boolean sign = true ;
        if (dividend < 0 && divisor > 0) sign = false ;
        else if (dividend > 0 && divisor < 0) sign = false ;

        long a = Math.abs((long) dividend) ;
        long b = Math.abs((long) divisor) ;

        int result = 0 ;
        for ( int i = 31 ; i >= 0 ; i--){
            if ( a >= (b << i)){
                a -= (b << i) ;
                result += (1 << i) ;
            }
        }
        return  sign == true ? result : -result ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the divisor :") ;
        int dividend = sc.nextInt() ;
        System.out.println("enter the dividend :") ;
        int divisor = sc.nextInt() ;
        System.out.print(divide(dividend , divisor)) ;
    }
}
