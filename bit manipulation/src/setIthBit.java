import java.util.Scanner;

public class setIthBit {
    static int setIthBit(int num , int i){
        int b = num | (1 << i);
        return b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the num :") ;
        int num = sc.nextInt() ;
        System.out.println("enter the bit to be set :") ;
        int i = sc.nextInt() ;
        num = setIthBit(num , i) ;
        System.out.println(num) ;
    }
}
