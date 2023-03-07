package de.neuefische.model;

import java.util.Objects;

public class Guest {
    String name;
    String contribution;


    public Guest(String name, String contribution) {
        this.name = name;
        this.contribution = contribution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return Objects.equals(name, guest.name) && Objects.equals(contribution, guest.contribution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contribution);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContribution() {
        return contribution;
    }

    public void setContribution(String contribution) {
        this.contribution = contribution;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", contribution='" + contribution + '\'' +
                '}';
    }
}
