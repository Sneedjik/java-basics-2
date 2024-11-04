package javaBasics2;

public class Main {

    public static void main(String[] args) {

        Human sergei = new Human(
                "Sergei",
                33,
                true
        );

        System.out.println(sergei);

        sergei = sergei.incrementAge();

        System.out.println(sergei);

    }
}
