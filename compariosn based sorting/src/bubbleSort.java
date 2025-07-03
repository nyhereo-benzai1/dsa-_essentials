// time complexity = O (n^2 )
// space complexity - O (1)
// stable and inplace sorting algo
public class bubbleSort {
    static void  swap ( int[] arr , int i , int j ){
        int temp = arr[j] ;
        arr[j] = arr[j+1] ;
        arr[j+1] = temp ;
    }
    static void bubbleSort(int[] arr){
        int n = arr.length ;
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n-1 ; j++){
                if (arr[j] > arr[j+1]) {
                    swap(arr , i , j) ;
                }
            }
        }
    }
    public static void main(String args[]){
        int[] arr = new int[]{20, 50 , 10 , 40 , 100 , 90} ;
        bubbleSort(arr) ;
        for (int ele : arr){
            System.out.println(ele) ;
        }
    }
}
