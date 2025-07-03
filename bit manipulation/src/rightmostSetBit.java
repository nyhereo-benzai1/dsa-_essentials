import java.util.Scanner;

public class rightmostSetBit {
    static int removeRightmostSetBit(int num ){
        return (num & (num - 1)) ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the num :") ;
        int num = sc.nextInt() ;
        num =  removeRightmostSetBit(num ) ;
        System.out.println(num) ;
    }
}
