// time complexity - O (N^2)
//Space complexity - o(1)
// stable and inplace
public class insertionSort {
    static void swap ( int[] arr , int j ){
        int temp = arr[j] ;
        arr[j] = arr[j-1] ;
        arr[j-1] = temp ;
    }
    static void insertionSort(int[] arr){
        for ( int i = 0 ; i < arr.length ; i++){
            for ( int j = i ; j > 0 ; j--){
                if (arr[j] < arr[j-1]) {
                    swap(arr , j );
                }
            }
        }
    }
    public static void main( String args[]){
        int[] arr = new int[]{8,3,6,2,4,5} ;
        insertionSort(arr) ;
        for (int ele : arr){
            System.out.println(ele) ;
        }
    }
}
