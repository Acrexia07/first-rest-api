package com.marlonb.simple_person_api.model;

public class Person {

    private long id;
    private String name;
    private String email;
    private String contactNumber;

    public Person (long id, String name, String email, String contactNumber) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
    }
    /*--- Setters ---*/

    public void setId (long id) {
        this.id = id;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setContactNumber (String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /*--- Getters ---*/

    public long getId () {
        return this.id;
    }

    public String getName () {
        return this.name;
    }

    public String getEmail () {
        return this.email;
    }

    public String getContactNumber () {
        return this.contactNumber;
    }
}
