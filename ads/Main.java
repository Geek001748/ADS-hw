import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean go = true;
        do {
            System.out.println("Write 0 to exit");
            System.out.println("Which problem to show write number (1-10");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt(); // example number, you can set this to any number between 0 and 10
            Recursion recursion = new Recursion();
            switch (number) {
                case 0:
                    System.out.println("Bye");
                    go = false;
                    break;
                case 1:
                    recursion.problem_1();
                    break;
                case 2:
                    recursion.problem_2();
                    break;
                case 3:
                    recursion.problem_3();
                    break;
                case 4:
                    recursion.problem_4();
                    break;
                case 5:
                    recursion.problem_5();
                    break;
                case 6:
                    recursion.problem_6();
                    break;
                case 7:
                    recursion.problem_7();
                    break;
                case 8:
                    recursion.problem_8();
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