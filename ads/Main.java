import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean go = true;
        do {
            System.out.println("Write 0 to exit");
            System.out.println("Which problem to show write number (1-10): ");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt(); // example number, you can set this to any number between 0 and 10
            Recursion recursion = new Recursion();
            switch (number) {
                case 0:
                    System.out.println("Bye");
                    go = false;
                    break;
                case 1:
                    System.out.println("Input size of array: ");
                    int num = sc.nextInt();
                    if (num <= 0){
                        recursion.error();
                        continue;
                    }
                    int[] arr = new int[num];
                    for(int i = 0; i < num; i++){
                        System.out.print("Write " + i + " element of array: ");
                        arr[i] = sc.nextInt();
                        System.out.println();
                    }
                    double startTime = System.nanoTime();
                    int resultInt = recursion.findingMin(num, arr);
                    double endTime = System.nanoTime();
                    double duration = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds
                    System.out.println("Min number in array: " + resultInt);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                case 2:
                    System.out.println("Input size of array: ");
                    num = sc.nextInt();
                    if (num <= 0){
                        recursion.error();
                        continue;
                    }
                    arr = new int[num];
                    for(int i = 0; i < num; i++){
                        System.out.print("Write " + i + " element of array: ");
                        arr[i] = sc.nextInt();
                        System.out.println();
                    }
                    startTime = System.nanoTime();
                    double resultDouble = recursion.sum(num, arr) / num;
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds
                    System.out.println("Average number of array: " + resultDouble);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                case 3:
                    System.out.println("Input number to check: ");
                    num = sc.nextInt();
                    startTime = System.nanoTime();
                    String resultString = (recursion.isPrime(num)?"prime":"composite");
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds
                    System.out.println("Number " + num + " is " + resultString);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                case 4:
                    System.out.println("Input number to find its factorial: ");
                    num = sc.nextInt();
                    if(num < 0) {
                        recursion.error();
                        continue;
                    }
                     startTime = System.nanoTime();
                     resultInt = recursion.factorial(num);
                     endTime = System.nanoTime();
                     duration = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds
                     System.out.println("Factorial of " + num + ": " + resultInt);
                     System.out.println("Time taken: " + duration + " milliseconds");
                     break;
                case 5:
                    System.out.println("Input number to find its fibonacci sequence: ");
                    num = sc.nextInt();
                    if(num < 0) {
                        recursion.error();
                        continue;
                    }
                    startTime = System.nanoTime();
                    resultInt = recursion.fibonacci(num);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds
                    System.out.println(num + " number in the Fibonacci sequence: " + resultInt);
                    System.out.println("Time taken: " + duration + " milliseconds");
                case 6:
                    System.out.println("Input number: ");
                    num = sc.nextInt();
                    System.out.println("Input power: ");
                    int power = sc.nextInt();
                    if(power < 0) {
                        recursion.error();
                        continue;
                    }
                    startTime = System.nanoTime();
                    resultInt = recursion.power(num, power);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds
                    System.out.println(power + "-th power of number " + num + " is: " + resultInt);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                case 7:
                    System.out.println("Input size of array: ");
                    num = sc.nextInt();
                    if (num <= 0){
                        recursion.error();
                        continue;
                    }
                    arr = new int[num];
                    for(int i = 0; i < num; i++){
                        System.out.print("Write " + i + " element of array: ");
                        arr[i] = sc.nextInt();
                        System.out.println();
                    }
                    System.out.println("Original array: ");
                    for(int i = 0; i < num; i++){
                        System.out.print(arr[i] + " ");
                    }
                        System.out.println();
                    startTime = System.nanoTime();
                    recursion.reverse(0, num - 1, arr);
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds
                    System.out.println("Reversed array: ");
                    for(int i = 0; i < num; i++){
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                case 8:
                    System.out.println("Input word to check: ");
                    sc.nextLine();
                    String word = sc.nextLine();
                    startTime = System.nanoTime();
                    resultString = (recursion.isAllDigits(word)?"Yes":"No");
                    endTime = System.nanoTime();
                    duration = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds
                    System.out.println(word + " consist of digits only?  " + resultString);
                    System.out.println("Time taken: " + duration + " milliseconds");
                    break;
                case 9:
                    recursion.problem_9();
                    break;
                case 10:
                    recursion.problem_10();
                    break;
                default:
                    System.out.println("Number not in range 0-10");
            }
        } while (go);
    }
}