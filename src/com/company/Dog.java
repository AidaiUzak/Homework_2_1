package com.company;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String commands;

    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public String getCommands() {
        return commands;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setCommands(String commands) {
        this.commands = commands;
    }

    public Dog (){}

    public Dog (String name, String breed, String color, Shelter shelter) {
        super.setColor(color);
        super.setShelter(shelter);
        this.name = name;
        this.breed = breed;
    }
    public Dog (String name, String breed, String color, Shelter shelter, String commands) {
        super.setColor(color);
        super.setShelter(shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public void makeVoice (String voice, int number) {

        System.out.println(voice);
    }
    public void makeVoice (int number, String voice) {
        System.out.println();

    }
    public void makeVoice (String name, int number, String voice) {

    }

    public final String getInfo () {
        return super.getInfo() + " имя " + name + " порода " + breed + " команда " + commands;
    }
}


