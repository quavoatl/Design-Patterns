package TestVisitorPattern;

public class StandardTaxSystem implements Visitor {


    @Override
    public double visit(Cigars cigars) {
        System.out.println("Cigars price with tax :");
        return (cigars.getPrice() * 0.20) + cigars.getPrice();
    }

    @Override
    public double visit(Milk milk) {
        System.out.println("Milk price with tax: ");
        return (milk.getPrice() * 0.15) + milk.getPrice();
    }
}
