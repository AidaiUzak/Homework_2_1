package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Shelter shelter = new Shelter("Приют", "1");

        Dog dog = new Dog();

        Dog dog1 = new Dog ("Собака 2", "Овчарка", "черная",shelter,"Лежать");
        Dog dog2 = new Dog("Собака 3", "Колли","Белая", shelter, "Апорт");

        System.out.println(dog.getInfo());
        dog.makeVoice("Гав-гав", 3 );
        System.out.println("__________________________");

        System.out.println(dog1.getInfo());
        dog1.makeVoice(5, "Р-р-р");
        System.out.println("__________________________");


        System.out.println(dog2.getInfo());
        dog2.makeVoice(dog2.getName(),1,"Ав-ав");


    }



}
