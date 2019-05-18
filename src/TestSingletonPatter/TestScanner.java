package TestSingletonPatter;


import java.util.Scanner;

public class TestScanner {
    private static Scanner scanner;


    public TestScanner() {

    }

    public static Scanner getInstance() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}

