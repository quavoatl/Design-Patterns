package TestFactoryPattern;

public class DivideTest implements Calculate {

    @Override
    public double calculate(double num1, double num2) {
        return num1/num2;
    }
}
