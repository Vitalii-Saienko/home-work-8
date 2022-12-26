import java.util.Scanner;

class Circle {
    public double radius;

    public double calculateArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius to calculate the square:");
        radius = sc.nextDouble();
        double result = Math.PI*Math.pow(radius, 2);
        System.out.println("The square of the circle is equal to: "+result);
        return result;
    }
}
