//time complexity -- O(log n )
// space complexity -- O (1)
public class binarySearch {
    static int binarySearch(int[] arr , int low , int high , int target){
        int mid = low + (high - low) / 2 ;
        if (target == arr[mid]){
            return mid ;
        }
        else if ( target < arr[mid]){
            high = mid-1 ;
            return binarySearch(arr , low , high , target) ;
        }
        else {
            low = mid + 1;
            return binarySearch(arr, low, high, target);
        }
    }
    public static void main(String args[]){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9} ;
        int index = binarySearch(arr , 0 , arr.length-1 , 4) ;
        if ( index == -1 ){
            System.out.println("element not found") ;
        }
        System.out.println("index = " + index) ;

    }
}
