import java.util.* ;
 class ithBitSet {
    static boolean checkBit ( int num , int i ){
        if ((num & (1 << i)) != 0) {
            return true ;
        }
        else {
            return false ;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num :") ;
        int num = sc.nextInt() ;
        System.out.println("enter the bit to be checked :") ;
        int i = sc.nextInt() ;
        System.out.println(checkBit(num , i )) ;
    }
}
