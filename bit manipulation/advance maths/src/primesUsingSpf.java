/*
 * Time Complexity:
 *   - Sieve Preprocessing: O(N log log N), N = 10^6
 *   - Each query: O(log n), since each division shrinks n by a prime factor
 *   - Total Query Time: O(Q * log N)

 * Space Complexity:
 *   - O(N) for SPF array
 *   - O(Q * log N) in worst case for output
 */

import java.util.* ;
class primesUsingSpf {
    public static List<List<Integer>> primeFactors(int[] queries) {
        int[] spf = new int[1000_000] ;
        for ( int i = 2 ; i < spf.length ; i++ ){
            spf[i] = i ;
        }

        for ( int i = 2 ; i * i < spf.length ; i++){
            if (spf[i] == i){
                for ( int j = i * i ; j < spf.length ; j += i){
                    if (spf[j] == j){
                        spf[j] = i ;
                    }
                }
            }
        }

        List < List < Integer >> finalAns = new ArrayList<>() ;
        for ( int i = 0 ; i < queries.length ; i++){
            List < Integer > ans =  new ArrayList<>() ;
            int n = queries[i] ;
            while ( n != 1 ){
                ans.add(spf[n]);
                n /= spf[n] ;
            }
            finalAns.add(ans) ;
        }

        return finalAns ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the length of the queries") ;
        int n = sc.nextInt() ;
        int[] queries = new int[n] ;
        for ( int i = 0 ; i < n ; i++){
            System.out.println("enter the element") ;
            int ele = sc.nextInt() ;
            queries[i] = ele ;
        }
        System.out.print(primeFactors(queries)) ;
    }
}

