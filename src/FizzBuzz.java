class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.detect(15));
        System.out.println(fizzBuzz.detect(5));
        System.out.println(fizzBuzz.detect(3));
        System.out.println(fizzBuzz.detect(-16));
    }
    public String detect(int number){
        if (number%3==0 && number%5==0){
            return "FizzBuzz";
        } else if (number%5==0) {
            return "Buzz";
        } else if (number%3==0) {
            return "Fizz";
        }
        else {
            return ""+number;
        }
    }
}
