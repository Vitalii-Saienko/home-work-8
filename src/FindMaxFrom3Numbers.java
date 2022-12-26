import java.util.Scanner;

class FindMaxFrom3Numbers {
    /*
    find max without using class Math
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int firstDigit = sc.nextInt(), secondDigit = sc.nextInt(), thirdDigit = sc.nextInt();
        int answer = 0;
        if (secondDigit>=thirdDigit){
            answer = firstDigit>=secondDigit ? firstDigit : secondDigit;
        } else if (secondDigit<thirdDigit) {
            answer = firstDigit>=thirdDigit ? firstDigit : thirdDigit;
        }
        System.out.println("Max number is: "+answer);
    }
}
