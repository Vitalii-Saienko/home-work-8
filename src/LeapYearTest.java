class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();
        test.testIsLeapYear();
    }
    public void testIsLeapYear(){
        LeapYear leapYear = new LeapYear();
        boolean expectedResult1 = true;
        if (expectedResult1 == leapYear.isLeapYear(504)){
            System.out.println("Test1 IS OK (condition year % 4 == 0 && year % 100 != 0). Year 504 is leap.");
        }
        else {
            System.out.println("ERROR in Test1 condition year % 4 == 0 && year % 100 != 0");
        }
        boolean expectedResult2 = false;
        if (expectedResult2 == leapYear.isLeapYear(500)){
            System.out.println("Test2 IS OK (condition year % 4 == 0 , BUT year % 100 == 0). Year 500 is not leap.");
        }
        else {
            System.out.println("ERROR in Test2 condition year % 4 == 0 , BUT year % 100 == 0");
        }
        boolean expectedResult3 = true;
        if (expectedResult3 == leapYear.isLeapYear(800)){
            System.out.println("Test3 IS OK (year % 100 == 0 && year % 400 == 0). Year 800 is leap.");
        }
        else {
            System.out.println("ERROR in Test3 condition (year % 100 == 0 && year % 400 == 0)");
        }
    }
}
