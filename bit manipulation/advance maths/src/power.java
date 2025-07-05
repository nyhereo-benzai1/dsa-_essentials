/*
 * -----------------------------
 * ✅ Time Complexity Analysis:
 * -----------------------------
 * The function uses a divide-and-conquer approach:
 *   - In each recursive call, we divide the exponent `n` by 2.
 *   - This results in a recursion depth of approximately log₂(n).
 *
 * Each level of recursion does a constant amount of work (1 multiplication or squaring),
 * so the total number of operations is proportional to log₂(n).
 *
 * 👉 Therefore, Time Complexity = O(log n)
 *
 * This is much faster than the naive approach (which would take O(n) time).

 *
 * ------------------------------
 * ✅ Space Complexity Analysis:
 * ------------------------------
 * Since we're using recursion, each recursive call is added to the call stack.
 * The maximum number of calls on the stack at any point is equal to the recursion depth,
 * which is also log₂(n), because we halve `n` at every step.
 *
 * No additional data structures are used — only variables for calculations.
 *
 * 👉 Therefore, Space Complexity = O(log n) due to the recursive call stack.
 *
 * ❗ Note:
 * - This space can be optimized to O(1) by converting the algorithm to an iterative version,
 *   which is often preferred in production environments to avoid stack overflow.
 */

import java.util.* ;
class power {
    public static double myPow(double x, int n) {
        // if the power is negative
        if ( n < 0){
            x = 1 / x;
            n = -n ;
        }
        return pow(x , n) ;
    }

    public static double pow( double x , long n){
        if (n == 0) return 1.0 ;
        if (n == 1) return x ;
        else {
            double result = pow(x , n / 2) ;
            double finalResult = result * result ;

            if ( n % 2 != 0){
                return finalResult * x ;
            }
            else  return finalResult ;
        }
    }
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the base =") ;
        double x = sc.nextInt() ;
        System.out.println("enter the exponent =") ;
        int n = sc.nextInt() ;
        System.out.print(myPow(x , n)) ;

    }

}
