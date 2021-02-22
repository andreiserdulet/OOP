package com.company.gestiune;

public class Telefon {
    private String nume;
    private Contact[] contacts = new Contact[10];
    private int index = 0;


    public Telefon(String nume) {
        this.nume = nume;
    }
    public void addContact(Contact contact){
        this.contacts[index] = contact;
        this.index++;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }
}
