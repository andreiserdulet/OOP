package com.company.compozitie;

public class CardSim {
    private String operator; //Vodafone
    private String numeFrecventa;
    private Contact[] contacte;

    //2 Vodafone
    public CardSim(int frecventa, String operator){
        this.operator = operator;
        this.numeFrecventa = frecventa + "G";
    }

    public void setFrecventa(int frecventa){
        this.numeFrecventa = frecventa + "G";

    }
    public String getNumeFrecventa(){
        return this.numeFrecventa;
    }
    public String getOperator(){
        return this.operator;
    }
    public void setOperator(String operator){
        this.operator = operator;
    }

    public void setContacte(Contact[] contacte) {
        this.contacte = contacte;
    }

    public Contact[] getContacte() {
        return contacte;
    }
}
