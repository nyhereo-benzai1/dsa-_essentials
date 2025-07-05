/*
 * Time Complexity:
 *   - The outer loop runs from 2 to √num → O(√n)
 *   - Inside the loop, for each prime factor, we divide num multiple times.
 *   - Since each division reduces num, the total number of divisions is at most log(n).
 *   - However, the loop dominates, so overall time complexity is: O(√n)

 * Space Complexity:
 *   - We store prime factors in a list.
 *   - In the worst case (e.g., num is product of many small primes), space used is O(log n)
 *   - So, overall space complexity: O(log n)
 */

import java.util.* ;
public class primeFactorsOfNum {
    public static List<Integer> primeFactors(int num){
        List <Integer> ans = new ArrayList<>() ;
        for ( int i = 2 ; i * i <= num ; i++){
            if ( num % i == 0) {
                ans.add(i);
                while (num % i == 0) {
                    num /= i;
                }
            }
        }
        if ( num != 1)  ans.add(num) ;

        return ans ;
    }
    public static void main( String args[]){
        Scanner sc = new Scanner ( System.in);
        System.out.println("enter the number :") ;
        int num = sc.nextInt() ;
        System.out.println("the prime factors of num :");
        System.out.print(primeFactors(num)) ;
    }
}
