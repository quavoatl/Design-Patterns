package TestVisitorPattern;

public class Cigars implements Visitable {
    private double price;

    public Cigars(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public double accept(Visitor visitor) {
       return visitor.visit(this);
    }
}
