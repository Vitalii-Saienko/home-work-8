class CalculatorAutoTests {
    public static void main(String[] args) {
        CalculatorAutoTests test = new CalculatorAutoTests();
        test.testAdd();
        test.testSubstr();
        test.testMult();
        test.testDiv();
        test.testEven();
        test.testMax();
        test.testFindMaxFrom3Numbers();
    }

    public void testAdd() {
        int testNumber = 10, testNumber2 = 3;
        int expectedResult = 13;
        Calculator calc = new Calculator();
        if (expectedResult == calc.calcAddition(testNumber, testNumber2)) {
            System.out.println("testAddition is OK");
        } else {
            System.out.println("Error!");
        }
    }

    public void testSubstr() {
        int testNumber = 10, testNumber2 = 3;
        int expectedResult = 7;
        Calculator calc = new Calculator();
        if (expectedResult == calc.calcSubtraction(testNumber, testNumber2)) {
            System.out.println("testSubtraction is OK");
        } else {
            System.out.println("Error!");
        }
    }

    public void testMult() {
        int testNumber = 10, testNumber2 = 3;
        int expectedResult = 30;
        Calculator calc = new Calculator();
        if (expectedResult == calc.calcMultiplication(testNumber, testNumber2)) {
            System.out.println("testMultiplication is OK");
        } else {
            System.out.println("Error!");
        }
    }

    public void testDiv() {
        int testNumber = 10, testNumber2 = 3;
        double expectedResult = 3.3333333333333335;
        Calculator calc = new Calculator();
        if (expectedResult == calc.calcDivision(testNumber, testNumber2)) {
            System.out.println("testDivision is OK");
        } else {
            System.out.println("Error!");
        }
    }

    public void testEven() {
        int testNumber = 10;
        boolean expectedResult = true;
        Calculator calc = new Calculator();
        if (expectedResult == calc.calcIsEven(testNumber)) {
            System.out.println("testEven is OK");
        } else {
            System.out.println("Error!");
        }
    }

    public void testMax() {
        Calculator calc = new Calculator();
        int testNumber = 10, testNumber2 = 3;
        int expectedResult = 10;
        if (expectedResult == calc.calcFindMax(testNumber, testNumber2)) {
            System.out.println("testFindMax is OK");
        } else {
            System.out.println("Error!");
        }
        int testNumber3 = 3, testNumber4 = 10;
        int expectedResult2 = 10;
        if (expectedResult2 == calc.calcFindMax(testNumber3, testNumber4)) {
            System.out.println("testFindMax - case2 is OK");
        } else {
            System.out.println("Error in case2!");

        }
        int testNumber5 = 3, testNumber6 = 3;
        int expectedResult3 = 3;
        if (expectedResult3 == calc.calcFindMax(testNumber5, testNumber6)) {
            System.out.println("testFindMax - case3 is OK");
        } else {
            System.out.println("Error in case3!");
        }
    }
    public void testFindMaxFrom3Numbers(){
        Calculator calc = new Calculator();
        //case1: 10-11-12
        int firstNumber = 10, secondNumber = 11, thirdNumber = 12;
        int resultCase1 = 12;
        if (resultCase1==calc.calcFindMaxFrom3Numbers(firstNumber,secondNumber,thirdNumber)){
            System.out.println("testFindMaxFrom3Numbers - case1 is OK");
        }
        else {
            System.out.println("testFindMaxFrom3Numbers - case1 error!");
        }
        //case2: 12-11-10
        int firstNumber2 = 12, secondNumber2 = 11, thirdNumber2 = 10;
        int resultCase2 = 12;
        if (resultCase2==calc.calcFindMaxFrom3Numbers(firstNumber2,secondNumber2,thirdNumber2)){
            System.out.println("testFindMaxFrom3Numbers - case2 is OK");
        }
        else {
            System.out.println("testFindMaxFrom3Numbers - case2 error!");
        }
        //case3: 10-12-11
        int firstNumber3 = 10, secondNumber3 = 12, thirdNumber3 = 11;
        int resultCase3 = 12;
        if (resultCase3==calc.calcFindMaxFrom3Numbers(firstNumber3,secondNumber3,thirdNumber3)){
            System.out.println("testFindMaxFrom3Numbers - case3 is OK");
        }
        else {
            System.out.println("testFindMaxFrom3Numbers - case3 error!");
        }
        //case4: 12-12-11
        int firstNumber4 = 12, secondNumber4 = 12, thirdNumber4 = 11;
        int resultCase4 = 12;
        if (resultCase4==calc.calcFindMaxFrom3Numbers(firstNumber4,secondNumber4,thirdNumber4)){
            System.out.println("testFindMaxFrom3Numbers - case4 is OK");
        }
        else {
            System.out.println("testFindMaxFrom3Numbers - case4 error!");
        }
    }
}
