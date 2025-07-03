// time complexity - O(N) , space - O(1)
import java.util.* ;
public class twoNumOddTimes {
    public static int[] twoOddNum(int Arr[], int N) {
        int xor = 0 ;
        for ( int i = 0 ; i < N ; i++){
            xor ^=  Arr[i] ;
        }
        int diffBit = ( xor & xor - 1 ) ^ xor ;
        int leftBucket = 0 , rightBucket = 0 ;
        for ( int j = 0 ; j < N ; j++){
            if ((Arr[j] & diffBit) != 0){
                leftBucket ^= Arr[j] ;
            }
            else {
                rightBucket ^= Arr[j] ;
            }
        }
        return leftBucket > rightBucket ? new int[]{leftBucket , rightBucket} : new int[]{rightBucket , leftBucket} ;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the array length") ;
        int length = sc.nextInt() ;
        int nums[] = new int[length] ;
        for ( int i = 0 ; i < length ; i++){
            System.out.println("enter the element = ") ;
            int ele = sc.nextInt() ;
            nums[i] = ele ;
        }
        System.out.println("elements appearing odd number of times are =") ;
        System.out.print(Arrays.toString(twoOddNum(nums , length))) ;
    }
}
