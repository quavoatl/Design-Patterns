package TestFactoryPattern;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("Factory Pattern");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick 2 numbers");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Enter your choice: add/divide");
        CalculateFactory calculateFactory = new CalculateFactory();
        Calculate calculate = calculateFactory.getCalculations(scanner.next());
        try{
            double result = calculate.calculate(num1,num2);
            System.out.println(result);
        }catch (Exception e){
            System.out.println("Something went wrong...");
        }


    }
}
