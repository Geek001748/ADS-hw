import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Recursion {
    Scanner sc = new Scanner(System.in);
    public void error() {
        System.out.println("Wrong input");
    }
    /**
     * This method returns the minimum of all elements in an array up to the n-th element using recursion.
     * Time complexity: O(n), where n is the number of elements considered in the array.
     * Using recursion, the method finds the minimum between the n-th element and the minimum of the first (n-1) elements.
     * The result is linear time complexity.
     * @param n The number of elements to consider from the beginning of the array for finding the minimum.
     * @param arr The array of numbers whose minimum is to be found.
     * @return min The minimum of the first n elements in the array.
     */
    public int findingMin(int n, int[] arr) {
        if (n == 0) {
            return arr[0];
        }
        int temporaryMin = findingMin(n - 1, arr);
        return Math.min(temporaryMin, arr[n - 1]);
    }
     /**
     * This method returns the sum of all elements in an array up to the n-th element using recursion.
     * Time complexity: O(n), where n is the number of elements to sum in the array.
     * Using recursion, the method adds n-th element to the sum of the first (n-1) elements.
     * The result is linear time complexity.
     * @param n The number of elements to include in the sum from the beginning of the array.
     * @param arr The array of numbers whose elements are to be summed.
     * @return sum The sum of the first n elements in the array.
     */
    public double sum(int n, int[] arr) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + sum(n - 1, arr);
    }
    /**
     * This method checks if input number is a prime or not.
     * It uses for loop.
     * Time complexity: O(sqrt(n)), where n is the input number.
     * Using loop, the method checks all odd numbers from 3 to sqrt(n) by dividing it by n.
     * @param n The number which we check is it a prime or not.
     * @return true/false Is the input number prime or not.
     */
    public boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n <= 1 || n % 2 == 0) {
            return false;
        }
        for(int i = 3; i <= sqrt(n); i += 2) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     * This method returns the factorial of the input number.
     * It uses recursion.
     * Time complexity: O(n), where n is the input number.
     * Using recursion, the method multiplies all numbers from n to 1 by calling itself with the parameter n - 1.
     * The result is linear time complexity.
     * @param n The number whose factorial is to be found.
     * @return factorial The factorial of the input number.
     */
    public int factorial(int n) {
         if (n == 0) return 1;
         return n * factorial(n  - 1);
    }
    /**
     * This method returns the n-th number in the Fibonacci sequence.
     * It uses recursion.
     * Time complexity: O(2^n), where n is the input number.
     * Using recursion, the method calculates the n-th Fibonacci number by calling itself with the parameters n - 1 and n - 2.
     * The result is exponential time complexity.
     * @param n The index in the Fibonacci sequence.
     * @return The n-th number in the Fibonacci sequence.
     */
    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
     /**
     * This method calculates the n-th power of a given number using recursion.
     * Time complexity: O(n), where n is the input number.
     * Using recursion, the method multiplies the number a by the result of a raised to the power of (n - 1).
     * The result has linear time complexity.
     * @param a The base number to be raised to the power n.
     * @param n The exponent value.
     * @return The result of a raised to the power n.
     */
    public int power(int a, int n) {
         if (n == 0) return 1;
         return a * power(a,n-1);
    }

    public void problem_7() {

    }

    public void problem_8() {

    }

    public void problem_9() {

    }

    public void problem_10() {

    }
}
