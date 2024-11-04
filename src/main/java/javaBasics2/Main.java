package javaBasics2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        Human sergei = new Human(
//                "Sergei",
//                33,
//                true
//        );
//
//        System.out.println(sergei);
//
//        sergei = sergei.incrementAge();
//
//        System.out.println(sergei);
        Human sergei = new Human(
                "Sergei",
                33,
                true
        );

//        List<String> games = new ArrayList<>();
//        games.add("Kenshi");
//        games.add("Mount and Blade");

        List<String> games = List.of("Kenshi", "Mount and Blade"); // Можно передавать не уникальные значения.

        Set<String> setOfGames = Set.of("Kenshi", "Mount and Blade"); // Можно передавать только уникальные значения.

        Map<String, Human> humans = new HashMap<>(); // Связь ключа (Key) и значения (Value).
        humans.put("12345678", sergei);
        humans.put("12345448", sergei);
        humans.put("12666678", sergei);
        humans.put("12777678", sergei);
        humans.put("12888678", sergei);

        for (Map.Entry<String, Human> entry : humans.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

        for (String key : humans.keySet()) {
            
        }

        for (Human value : humans.values()) {

        }


        int hours = 8;
        String hello = "Nihao";


        sergei.printSomeValues(
                hours,
                hello,
                games
        );

        System.out.println("After method, int: " + hours);
        System.out.println("After method, String: " + hello);
        System.out.println("After method, List: " + games);

        String[] gamesArray = new String[] {"Kenshi", "Mount and Blade"};
//        gamesArray[0] = "Kenshi";
//        gamesArray[1] = "Mount and Blade";

//        gamesArray.length

        int[] intArray0 = new int[] {1, 2, 3, 4};
        int[] intArray1 = new int[] {1, 2, 3, 4};

        int[][] biArray = new int[][] {
                intArray0,
                intArray1
        };

//        for (int i = 0; i < gamesArray.length; i++ ) {
//            System.out.println(gamesArray[i]);
//        }
//
//        for (int i = gamesArray.length - 1; i >= 0; i--) {
//            System.out.println(gamesArray[i]);
//        }

//        for (String gameName : gamesArray) {
//            if (gameName.startsWith("K")) {
//                System.out.println(gameName);
//                break;
//            }
//        }

//        for (String gameName : gamesArray) {
//            if (!gameName.startsWith("K")) {
//                continue;
//            }
//            System.out.println(gameName);
//        }

        for (String gameName : gamesArray) {
            if (!gameName.startsWith("K")) {
                continue;
            }
            System.out.println(gameName);
            return;
        }

//        int i = 0;
//        while (i < gamesArray.length) {
//            System.out.println(gamesArray[i]);
//            i++;
//        }

    }
}
