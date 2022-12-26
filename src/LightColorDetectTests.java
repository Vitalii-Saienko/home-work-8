class LightColorDetectTests {
    public static void main(String[] args) {
        colorDetectTest();

    }

    public static void colorDetectTest() {
        LightColorDetect object = new LightColorDetect();
        //case1
        int number = 100;
        String testResult1 = "Invisible Light";
        if (testResult1 == LightColorDetect.colorDetect(100)){
            System.out.println("testLightColorDetect case1 is OK");
        }
        else {
            System.out.println("Error!");
        }
        //case2
        int number2 = 555;
        String testResult2 = "Green";
        if (testResult2 == LightColorDetect.colorDetect(555)){
            System.out.println("testLightColorDetect case2 is OK");
        }
        else {
            System.out.println("Error!");
        }

    }
}