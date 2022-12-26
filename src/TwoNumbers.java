import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        System.out.println("Max is "+(firstNumber>=secondNumber ? firstNumber : secondNumber));
        System.out.println("Min is "+(firstNumber<=secondNumber ? firstNumber : secondNumber));
        System.out.println(firstNumber==secondNumber ? "numbers are equal" : "numbers are different");
        System.out.println("---------------");
    }
}
