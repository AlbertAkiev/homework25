package com.company;

public class Mashina {
    private int gotvypuska;
    private String model;
    private int sena;
    private String svet;

    public Mashina(int gotvypuska, String model, int sena, String svet) {
        this.gotvypuska = gotvypuska;
        this.model = model;
        this.sena = sena;
        this.svet = svet;
    }

    public int getGotvypuska() {
        return gotvypuska;
    }

    public void setGotvypuska(int gotvypuska) {
        this.gotvypuska = gotvypuska;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSena() {
        return sena;
    }

    public void setSena(int sena) {
        this.sena = sena;
    }

    public String getSvet() {
        return svet;
    }

    public void setSvet(String svet) {
        this.svet = svet;
    }

    @Override
    public String toString() {
        return "Mashina{" +
                "gotvypuska=" + gotvypuska +
                ", model='" + model + '\'' +
                ", sena=" + sena +
                ", svet='" + svet + '\'' +
                '}';
    }
}