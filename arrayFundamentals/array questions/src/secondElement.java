import java.util.* ;
public class secondElement {
    static int secondMax(int[] nums){
        int secMax = nums[0] ;
        int max = Integer.MIN_VALUE ;
        for ( int i = 0 ; i < nums.length ; i++){
            int currEle = nums[i] ;
            if (currEle > max)   {
                secMax = max ;
                max = currEle ;
            }
            else if ( currEle > secMax && currEle < max)  secMax = currEle ;
            else   continue ;
        }
        return secMax ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the length of the array" );
        int length = sc.nextInt() ;
        int[] nums = new int[length] ;
        for ( int i = 0 ; i < length ; i++){
            System.out.println("enter the elemet =") ;
            int ele = sc.nextInt() ;
            nums[i] = ele ;
        }
        System.out.println("the second largest element is =" + secondMax(nums)) ;
    }

}
