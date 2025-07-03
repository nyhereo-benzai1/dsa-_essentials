import java.util.* ;
public class checkNumOdd {
    static boolean checkIfOdd(int num){
        return (num & 1) == 1 ;
    }
    public static void main ( String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the number to be checked :");
        int num = sc.nextInt() ;
        System.out.println(checkIfOdd(num)) ;
    }
}
