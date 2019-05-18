package TestFactoryPattern;

public class CalculateFactory {

    public Calculate getCalculations(String typeOfCalculation){

        Calculate calculate = null;

        if(typeOfCalculation.toLowerCase().equals("add")){
            calculate = new AddTest();
        }else if(typeOfCalculation.toLowerCase().equals("divide")){
            calculate = new DivideTest();
        }else {
            System.out.println("We don't have that here...");
        }
        return calculate;
    }
}
