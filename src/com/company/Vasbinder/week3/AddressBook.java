package com.company.Vasbinder.week3;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Person> personList = new ArrayList<>();



    public void  setPerson(Person personName){

        personList.add(personName);

    }

    public String getEmail(String personName){

        String email = "DID NOT WORK!";

        for(Person person : personList){

            if (person.getName().equalsIgnoreCase(personName)){

                email = person.getEmail();

            }

        }

        return email;

    }

}

