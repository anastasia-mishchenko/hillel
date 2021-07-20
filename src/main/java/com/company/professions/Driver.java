package com.company.professions;

import com.company.Person;

import java.util.Objects;

public class Driver extends Person {
    int experience;

    public Driver(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + super.getName() + '\'' +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return getExperience() == driver.getExperience();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExperience());
    }
}
