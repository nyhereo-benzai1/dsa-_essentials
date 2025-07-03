import java.util.* ;
class singleNumberClass {
    public static int singleNumber(int[] nums) {
        int ans = 0 ;
        for ( int ele : nums){
            ans = (ans ^ ele) ;
        }
        return ans ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the length of array");
        int n = sc.nextInt() ;
        int nums[] = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            System.out.println("enter elements of the array= " );
            int ele = sc.nextInt();
            nums[i] = ele ;
        }
        System.out.println("single number is =" + singleNumber(nums)) ;
    }

}

