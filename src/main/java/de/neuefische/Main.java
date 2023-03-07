package de.neuefische;

import de.neuefische.model.Guest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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










    }
}