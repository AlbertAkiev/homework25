package com.company;

public class Car {
    private int id;
    private int nomer;
    private String avto;

    public Car(int id, int nomer, String avto) {
        this.id = id;
        this.nomer = nomer;
        this.avto = avto;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getAvto() {
        return avto;
    }

    public void setAvto(String avto) {
        this.avto = avto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", nomer=" + nomer +
                ", avto=" + avto +
                '}';
    }
}
