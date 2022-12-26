import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        if (first == second && first == third){
            System.out.println("All numbers are equal");
        } else if (first != second && first != third && second != third) {
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
        System.out.println("---------------");
        System.out.println("Enter three numbers:");
        int first2 = sc.nextInt();
        int second2 = sc.nextInt();
        int third2 = sc.nextInt();
        if (first2>second2 && second2 > third2){
            System.out.println("Decreasing");
        }
        else if (first2<second2 && second2 < third2) {
            System.out.println("Increasing");
        }
        else{
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
