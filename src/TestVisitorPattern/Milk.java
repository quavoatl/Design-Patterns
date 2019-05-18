package TestVisitorPattern;

public class Milk implements Visitable {
    private double price;

    public Milk(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
