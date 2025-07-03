// time complexity - O (1) , space - o(1) ;
import java.util.* ;
class lrXor  {
    public static int helper ( int num){
        if ( num % 4 == 0) return num ;
        else if ( num % 4 == 1) return 1 ;
        else if ( num % 4 == 2) return  num + 1 ;
        else return 0 ;
    }
    public static int findXOR(int l, int r) {
        int xor = helper(l - 1) ^ helper(r) ;
        return xor ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the left num = ") ;
        int l = sc.nextInt() ;
        System.out.println("enter the right num = ") ;
        int r = sc.nextInt() ;
        System.out.println("the xor is =" + findXOR(l , r));

    }
}