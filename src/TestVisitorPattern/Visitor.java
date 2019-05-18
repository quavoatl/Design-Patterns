package TestVisitorPattern;

public interface Visitor {

    double visit(Cigars cigars);
    double visit(Milk milk);
}
