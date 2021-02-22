package com.company.compozitie;

public class telefon {
    private String model;
    private int memorie;
    private int diagonala;
    private CardSim sim;

    public telefon(String model){
        this.model = model;
    }

    public CardSim getSim(){
        return this.sim;
    }

    public void setSim(CardSim sim){
        this.sim = sim;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getDiagonala(){
        return diagonala;
    }
    public void setDiagonala(int diagonala){
        this.diagonala = diagonala;
    }
    public int getMemorie(){
        return memorie;
    }
    public void setMemorie(int memorie){
        this.memorie = memorie;
    }
}
