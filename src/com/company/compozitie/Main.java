package com.company.compozitie;

public class Main {
    public static void main(String[] args) {
    telefon primulTelefon = new telefon("Iphone X");
    primulTelefon.setDiagonala(10);
    primulTelefon.setMemorie(8);

    telefon alDoileaTelefon = new telefon("Samsung S9");
    alDoileaTelefon.setDiagonala(10);
    alDoileaTelefon.setMemorie(8);

    CardSim cardSim1 = new CardSim(3, "Vodafone");
    CardSim cardSim2 = new CardSim(5, "Vodafone");

    Contact[] contacts = new Contact[2];
    Contact contactAcasa = new Contact();
    contactAcasa.setNume("Acasa");
    contactAcasa.setPrenume("");
    contactAcasa.setTelefon(7524610);

    Contact contactMircea = new Contact();
    contactMircea.setNume("Popescu");
    contactMircea.setPrenume("Mircea");
    contactMircea.setTelefon(7520);

    contacts[0] = contactAcasa;
    contacts[1] = contactMircea;

    cardSim1.setContacte(contacts);

    primulTelefon.setSim(cardSim1);
    alDoileaTelefon.setSim(cardSim2);
    afiseaza(primulTelefon);
    afiseaza(alDoileaTelefon);

    }
    public static void afiseaza(telefon telefon){
        String model = telefon.getModel();
        int diagonala = telefon.getDiagonala();
        int memorie = telefon.getMemorie();
        CardSim sim = telefon.getSim();
        String operator = sim.getOperator();
        String numeFrecventa = sim.getNumeFrecventa();
//                              Iphone X diagonala: 12 memorie: 6 : operator: Vodafone 3G
        System.out.println(model + " diagonala:" + diagonala + " memorie:" + memorie + " operator:" + operator + " " + numeFrecventa);
        Contact[] contacte = sim.getContacte();
        if (contacte != null){
            for (int i = 0; i < contacte.length; i++){
                Contact contact = contacte[i];
                String nume = contact.getNume();
                String prenume = contact.getPrenume();
                int nrtelefon = contact.getTelefon();
                System.out.println("Numele: " + nume + " Prenume: " + prenume + " Telefon:" + nrtelefon);
            }
        }
    }
}
