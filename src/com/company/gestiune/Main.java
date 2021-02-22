package com.company.gestiune;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int optiune = 1;
        Telefon[] telefoaneInregistrate = new Telefon[10];
        int index = 0;
        while (optiune != 0) {
            System.out.println("1.Afiseaza telefoane inregistrate");
            System.out.println("2.Inregistreaza telefon");
            System.out.println("3.Afiseaza contacte din telefon");
            System.out.println("4.Adauga contact in telefon");
            System.out.println("0. Exit");
            System.out.println("Alege optiunea ");
            optiune = scanner.nextInt();
            scanner.nextLine();

            if (optiune == 2) {
                System.out.println("Introduceti numele telefonului");
                String nume = scanner.nextLine();
                Telefon telefon = new Telefon(nume);
                telefoaneInregistrate[index] = telefon;
                index++;


            }
            if (optiune == 1) {
            afisareTelefoane(telefoaneInregistrate);
            }
            if (optiune == 4){
                afisareTelefoane(telefoaneInregistrate);
                System.out.println("Alegeti telefonul (1-10)");
                //1
                int indexulTelefonuluiAles = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Introduceti numele");
                String nume = scanner.nextLine();
                System.out.println("Introduceti prenumele");
                String prenume = scanner.nextLine();
                System.out.println("Introduceti nr. telefon");
                String nrTel = scanner.nextLine();
                Contact contact = new Contact(nume, prenume, nrTel);
                Telefon telefonAles = telefoaneInregistrate[indexulTelefonuluiAles-1];
                telefonAles.addContact(contact);
            }
            if (optiune == 3){
                afisareTelefoane(telefoaneInregistrate);
                System.out.println("Alegeti telefonul (1-10)");
                //1
                int indexulTelefonuluiAles = scanner.nextInt();
                scanner.nextLine();
                Telefon telefonAles = telefoaneInregistrate[indexulTelefonuluiAles-1];
                Contact[] contacts = telefonAles.getContacts();
                afisareContacte(contacts);
            }
        }

    }
    public static void afisareContacte(Contact[] contacts){
        for (int i = 0 ; i < contacts.length; i++){
            Contact contact = contacts[i];
            if (contact != null){
                String nume = contact.getName();
                String prenume = contact.getPrenume();
                String nrTel = contact.getNrTelefon();
                System.out.println((i+1) + "\n. Nume:" + nume + "\n|Prenume:" + prenume + "\n|Numar telefon:" + nrTel );
            }
        }
    }

    public static void afisareTelefoane (Telefon[]telefoaneInregistrate){
        for (int i = 0; i < telefoaneInregistrate.length; i++) {
            Telefon telefon = telefoaneInregistrate[i];
            if(telefon != null) {
                String nume = telefon.getNume();
                System.out.println((i + 1) + "." + nume);
            }
        }
    }
}
