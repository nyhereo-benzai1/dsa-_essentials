/*
 * Time Complexity:
 *   - Loop runs from 2 to √num → O(√n)
 *   - For each divisor found, we also add num / i if distinct
 *   - So, total time complexity: O(√n)

 * Space Complexity:
 *   - We store the divisors in a list → in worst case, up to O(√n) divisors
 *   - So, space complexity: O(√n)
 */

import java.util.* ;
public class allDivisorOfNum {
    public static List <Integer> printDivisors(int num){
        List < Integer > ans = new ArrayList<>() ;
        ans.add(1);
        for ( int i = 2 ; i * i <= num ; i++) {
            if (num % i == 0){
                ans.add(i);
                if (num / i != i) ans.add(num / i);
            }
        }
        ans.add(num) ;
    return ans ;
    }
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in) ;
        System.out.println("enter the num =");
        int num = sc.nextInt() ;
        System.out.println("all the divisors of the num you entered are :") ;
        System.out.print(printDivisors(num)) ;
    }
}
