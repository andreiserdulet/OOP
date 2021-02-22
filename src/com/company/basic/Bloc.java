package com.company.basic;

public class Bloc {
    private String scara;
    private String numeBloc;
    private int numarEtaje;
    private int pretPeEtaj;

    // 4  // "Scara 2"
    public Bloc(int numEtaj, String scara) {
        this.numarEtaje = numEtaj;
        this.scara = scara;
    }

    public Bloc(int numarEtaje, String scara, String numeBloc) {
        this.scara = scara;
        this.numarEtaje = numarEtaje;
        this.numeBloc = numeBloc;
    }

    public String getAdresa() {
        String adresa = this.numeBloc + " " + this.scara;
        return adresa;
    }

    public void setScara(String scara) {
        this.scara = scara;
    }
    //E2
    public void setNumeBloc(String numeBloc) {
        this.numeBloc = numeBloc;
    }

    public void setNumarEtaje(int numarEtaje) {
        this.numarEtaje = numarEtaje;
    }

    public String getScara() {
        return this.scara;
    }


    public int getNumarEtaje() {
        return this.numarEtaje;
    }

    public void setPretPeEtaj(int pret){
        this.pretPeEtaj =  pret;
    }

    public int getPretPeEtaj(){
        return this.pretPeEtaj;
    }

    public int calculateTotalPrice(){
        int total =  this.numarEtaje * this.pretPeEtaj;
        return  total;
    }
}