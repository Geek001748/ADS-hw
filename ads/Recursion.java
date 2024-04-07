import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Recursion {
    Scanner sc = new Scanner(System.in);
    public void error() {
        System.out.println("Wrong input");
    }

    public int findingMin(int n, int[] arr) {
        if (n == 0) {
            return arr[0];
        }
        int temporaryMin = findingMin(n - 1, arr);
        return Math.min(temporaryMin, arr[n - 1]);
    }

    public double sum(int n, int[] arr) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + sum(n - 1, arr);
    }

    public boolean isPrime(int n) {
        if (n <= 1 || n % 2 == 0) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for(int i = 3; i <= sqrt(n); i += 2) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int factorial(int n) {
         if (n == 0) return 1;
         return n * factorial(n  - 1);
    }

    public void fibonacci() {

    }

    public void problem_6() {

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
