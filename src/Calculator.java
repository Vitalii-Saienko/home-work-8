import java.util.Scanner;

class Calculator {
    int firstNumber;
    int secondNumber;

    public Calculator() {
    }

    public int calcAddition (int firstNumber, int secondNumber){
        return firstNumber+secondNumber;
    }
    public int calcSubtraction (int firstNumber, int secondNumber){
        return firstNumber-secondNumber;
    }
    public int calcMultiplication (int firstNumber, int secondNumber){
        return firstNumber*secondNumber;
    }
    public double calcDivision (int firstNumber, int secondNumber){
        double double1 = (double) firstNumber, double2 = (double) secondNumber;
        return double1/double2;
    }
    public boolean calcIsEven (int firstNumber){
        return firstNumber % 2 == 0;
    }
    public int calcFindMax (int firstNumber, int secondNumber){
        int max;
        if (firstNumber>=secondNumber){
            max = firstNumber;
        } else {
            max = secondNumber;
        }
        return max;
    }
    public int calcFindMaxFrom3Numbers(int firstNumber, int secondNumber, int thirdNumber){
        int max = 0;
        if (secondNumber>=thirdNumber){
            max = firstNumber>=secondNumber ? firstNumber : secondNumber;
        } else if (secondNumber<thirdNumber) {
            max = firstNumber>=thirdNumber ? firstNumber : thirdNumber;
        }
        return max;
    }
    public void allFunctions (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(number1+"+"+number2+" = "+calcAddition(number1, number2));
        System.out.println(number1+"/"+number2+" = "+calcDivision(number1, number2));
        System.out.println(number1+"*"+number2+" = "+calcMultiplication(number1, number2));
        System.out.println(number1+"-"+number2+" = "+calcSubtraction(number1, number2));
        System.out.println("The number "+number1+" is Even, that's "+calcIsEven(number1));
        System.out.println("The MAX is "+calcFindMax(number1, number2));
        System.out.println("Please enter the third number:");
        int number3 = sc.nextInt();
        System.out.println("The MAX from three numbers is "+calcFindMaxFrom3Numbers(number1, number2, number3));
    }
}
