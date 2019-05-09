package com.company;

public class Pet {
    private int age;
    private String color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public Shelter getShelter() {
        return shelter;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
    private int generateDefaultAge () {
        return age;
    }
    public String getInfo () {
        return "возраст " + generateDefaultAge() + " цвет " + color + " приют " + shelter.getName()+shelter.getAddress();
    }
}
