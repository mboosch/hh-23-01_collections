package de.neuefische;

import de.neuefische.model.Guest;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Guest> guestList = new ArrayList<>();

        guestList.add(0, new Guest("Anton", "Tomatensalat"));
        guestList.add(1, new Guest("Sarah", "Pizza"));

        System.out.println(guestList.get(1));
        System.out.println("---------");

        for (Guest guest : guestList) {
            System.out.println(guest);
        }

        guestList.remove(1);
        System.out.println("---------");

        for (Guest guest : guestList) {
            System.out.println(guest);
        }

        guestList.add(1, new Guest("Anton", "Tomatensalat"));

        System.out.println("---------");

        for (Guest guest : guestList) {
            System.out.println(guest);
        }

        guestList.clear();

        System.out.println("---------");

        for (Guest guest : guestList) {
            System.out.println(guest);
        }

        List<Guest> guestList2 = new ArrayList<>(Arrays.asList(
                new Guest("Tom", "Grillkohle"),
                new Guest("Lara", "Snacks")
        ));

        System.out.println(guestList2.size());

        Map<Integer, Guest> guestList3 = new HashMap<>();

        guestList3.put(1, new Guest("Antonia", "Snacks"));

        System.out.println(guestList3.get(1));

        guestList3.remove(1);
        System.out.println("---------");
        System.out.println(guestList3.get(1));
        guestList3.put(1, new Guest("Antonia", "Snacks"));
        guestList3.put(2, new Guest("Anton", "Salat"));
        System.out.println("---------");

        for (Map.Entry<Integer, Guest> entry : guestList3.entrySet()) {
            System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());
        }

        Set<Guest> guestList4 = new HashSet<>();
        guestList4.add(new Guest("Thomas", "Spagetti"));
        System.out.println("---------");
        for (Guest guest : guestList4) {
            System.out.println(guest);
        }
        System.out.println("---------");
        guestList4.remove(new Guest("Thomas", "Spagetti"));
        for (Guest guest : guestList4) {
            System.out.println(guest);
        }
    }
}