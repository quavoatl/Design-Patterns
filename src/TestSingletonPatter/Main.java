package TestSingletonPatter;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Singleton");
        Scanner ob1 = TestScanner.getInstance();
        Scanner ob2 = TestScanner.getInstance();

        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
        System.out.println("Non Singleton");
        Scanner ob3 = new Scanner(System.in);
        Scanner ob4 = new Scanner(System.in);
        System.out.println(ob3.hashCode());
        System.out.println(ob4.hashCode());


    }
}
