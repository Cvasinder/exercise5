package com.company.Vasbinder.week3;

import java.util.Scanner;
/*Cameron Vasbinder*/

public class Main {

    static Scanner scan = new Scanner(System.in);



    static void addPersonMethod(AddressBook addPeople){

        String getName = "";

        System.out.println("Who are you adding?");

        getName = scan.nextLine();

        System.out.println("What is the email?");

        String getEmail = scan.nextLine();

        Person newPerson = new Person(getName,getEmail);

        addPeople.setPerson(newPerson);

    }

    static void findPersonMethod (AddressBook findPerson){

        String getName = "";

        System.out.println("Who do you want to look up?");

        getName = scan.nextLine();

        System.out.println("The email for " + getName+ " is " + findPerson.getEmail(getName));

    }



    public static void main(String[] args) {

        int choice;

        Person Steve = new Person("Steve" , "ats@gmail.com");

        Person Hud = new Person("Hud" , "ats@gmail.com");

        AddressBook addPeople = new AddressBook();

        addPeople.setPerson(Steve);

        addPeople.setPerson(Hud);

        do{

            System.out.println("1) To add people" +

                    "\n2) To look up someones email" +

                    "\n3) exit");

            choice = scan.nextInt();

            scan.nextLine();

            switch (choice){

                case 1: addPersonMethod(addPeople);

                    break;

                case 2: findPersonMethod(addPeople);

                    break;

            }

        }while(choice != 0);

    }

}