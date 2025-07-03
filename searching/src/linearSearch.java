// time complexity -- O(n)
// space - O(1)
import java.util.* ;
public class linearSearch {
     static int search(int[] arr , int target ){
        for ( int i = 0 ; i < arr.length ; i++){
            if ( arr[i] == target )  return i ;
        }
        return -1 ;
    }
    public static void main ( String args[]){
        int[] arr = new int[] {1,3,4,5,6,7,8,2} ;
        int target = 8 ;
        int index = search(arr , target) ;
        if (index == -1 ) {
            System.out.println("element not found") ;
        }

        System.out.println("index of searched element is="+ index ) ;
    }
}
