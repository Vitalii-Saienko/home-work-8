class FizzBuzzTest {
    public static void main(String[] args) {
        testFizzBuzz();
    }

    static void testFizzBuzz() {
        FizzBuzz testFizzBuzz = new FizzBuzz();
        String expectedAnswer1 = "FizzBuzz";
        if (expectedAnswer1 == testFizzBuzz.detect(15)) {
            System.out.println("Test %5 && %3 is ok.");
        } else {
            System.out.println("ERROR in Test %5 && %3");
        }
        String expectedAnswer2 = "Buzz";
        if (expectedAnswer2 == testFizzBuzz.detect(10)) {
            System.out.println("Test %5 is ok.");
        } else {
            System.out.println("ERROR in Test %5");
        }
        String expectedAnswer3 = "Fizz";
        if (expectedAnswer3 == testFizzBuzz.detect(9)) {
            System.out.println("Test %3 is ok.");
        } else {
            System.out.println("ERROR in Test %3");
        }
        String expectedAnswer4 = "-16";
        if (expectedAnswer4.equals(testFizzBuzz.detect(-16))) {
            System.out.println("Test %else is ok.");
        } else {
            System.out.println("ERROR  in Test %else");
        }
    }
}
