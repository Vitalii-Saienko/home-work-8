import java.util.Scanner;

class LightColorDetectDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the wave:");
        int number = sc.nextInt();
        System.out.println(LightColorDetect.colorDetect(number));
    }
}
