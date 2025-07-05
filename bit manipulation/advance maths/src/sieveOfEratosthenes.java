/*
 * Time Complexity:
 *   - The loop runs from 2 to √num → O(√n)
 *   - For each valid divisor i, we also add (num / i) if it's distinct
 *   - So, total number of divisors found (and added) is at most O(√n)
 *   - Hence, overall time complexity is: O(√n)

 * Space Complexity:
 *   - We use a list to store the divisors → at most O(√n) space in worst case
 *   - So, space complexity is: O(√n)
 */

import java.util.Scanner;

public class sieveOfEratosthenes {
    public static int countPrimes(int n) {
        int count = 0 ;
        int[] prime = new int[n] ;
        for ( int i = 0 ; i < n ; i++) {
            prime[i] = 1 ;
        }
        for ( int i = 2 ; i * i < n ; i++){
            if ( prime[i] == 1){
                for (int j = i*i ; j < n ; j += i){
                    prime[j] = 0 ;
                }
            }
        }

        for ( int i = 2 ; i < n ; i++){
            if (prime[i] == 1) {
                count += 1 ;
            }
        }
        return count ;
    }
    public static void main( String args[]){
        Scanner sc = new Scanner( System.in) ;
        System.out.println("enter the num =");
        int num = sc.nextInt() ;
        System.out.println("count of primes till num is ") ;
        System.out.print(countPrimes(num)) ;
    }

}
