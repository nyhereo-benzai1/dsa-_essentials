/*
 * Time Complexity: O(n * 2^n)
 * - We generate 2^n subsets for an array of size n.
 * - For each subset, we may iterate through all n elements to check inclusion via bitmask.
 *
 * Space Complexity: O(n * 2^n)
 * - We store all 2^n subsets.
 * - Each subset can have up to n elements in the worst case.
 *
 * Approach: Bitmasking
 * - Each number from 0 to 2^n - 1 represents a unique subset.
 * - We use bitwise operations to determine which elements to include in each subset.
 */

import java.util.* ;
public class PowerSet {
    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length ;
        double noOfEle = Math.pow(2,n) ;
        List <List<Integer>> ans = new ArrayList<>() ;
        for( int no = 0 ; no < noOfEle ; no++ ){
            ArrayList < Integer > list = new ArrayList <>() ;
            for (int i = 0 ; i < n ; i++){
                if ((no & (1 << i)) != 0) {
                    list.add(nums[i]) ;
                }
            }
            ans.add(list) ;
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
        System.out.println("power set is " ) ;
        List <List<Integer>> ans = subsets(nums);

        for ( List<Integer> list : ans){
            System.out.println(list) ;
        }
    }
}
