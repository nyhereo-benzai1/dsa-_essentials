import java.util.Scanner;

public class clearIthBit {
    static int clearIthBit(int num , int i ){
        return (num & (~(1 << i)));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the num :") ;
        int num = sc.nextInt() ;
        System.out.println("enter the bit to be set :") ;
        int i = sc.nextInt() ;
        num =  clearIthBit(num , i ) ;
        System.out.println(num) ;
    }
}
