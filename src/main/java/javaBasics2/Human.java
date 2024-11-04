package javaBasics2;

import java.util.List;

public class Human {
    private final String name;
    private final int age;
    private final boolean isCute;

    public Human(String name, int age, boolean isCute) {
        this.name = name;
        this.age = age;
        this.isCute = isCute;
    }

    public Human incrementAge() {
        return new Human(
            this.name,
            (this.age + 1),
            this.isCute
        );
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isCute() {
        return isCute;
    }

    void printSomeValues(int i, String str, List<String> list) {
        i = 100;
//        list.add("Kingdom Come");
        System.out.println(
                "int: " +
                i +
                ", String: " +
                str.toUpperCase() +
                ", List: " +
                list
        );
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCute=" + isCute +
                '}';
    }
}
