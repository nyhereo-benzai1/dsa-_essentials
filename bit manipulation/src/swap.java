public class swap {
    static void bruteSwap ( int a , int b ){
        int temp = a ;
        a = b ;
        b = temp ;
        System.out.println("swapping using brute swap method =  " + a + " " + b) ;
    }
    static void swapBit( int a , int b ){
        a = a^b ;
        b = a^b ;
        a = a^b ;
        System.out.println("swapping using bit swap method = " + a + " " + b) ;
    }
    public static void main(String args[]){
        int a = 10 , b = 8 ;
        System.out.println("values before swapping :" + "a = " + a + " " + "b= " + b) ;
        bruteSwap(a,b) ;
        swapBit(a,b) ;

    }
}
