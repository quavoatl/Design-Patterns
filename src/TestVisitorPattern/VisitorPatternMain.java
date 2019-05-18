package TestVisitorPattern;

public class VisitorPatternMain {

    public static void main(String[] args) {

        StandardTaxSystem standardTaxCalc = new StandardTaxSystem();

        Cigars cigars = new Cigars(10.10);
        Milk milk = new Milk(3.50);

        System.out.println(cigars.accept(standardTaxCalc));
        System.out.println(milk.accept(standardTaxCalc));

        System.out.println("Start of holiday :D");
        HolidayTaxSystem holidayTaxSystem = new HolidayTaxSystem();

        System.out.println(cigars.accept(holidayTaxSystem));
        System.out.println(milk.accept(holidayTaxSystem));
    }
}
