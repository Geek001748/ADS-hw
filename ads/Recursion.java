import java.util.Scanner;

public class Recursion {
    Scanner sc = new Scanner(System.in);

    public int findingMin(int n, int[] arr){
        if(n == 0) {
            return arr[0];
        }
        int temporaryMin = findingMin(n - 1, arr);
        return Math.min(temporaryMin, arr[n - 1]);
    }public void problem_2(){

    }public void problem_3(){

    }public void problem_4(){

    }public void problem_5(){

    }public void problem_6(){

    }public void problem_7(){

    }public void problem_8(){

    }public void problem_9(){

    }public void problem_10(){

    }
}
