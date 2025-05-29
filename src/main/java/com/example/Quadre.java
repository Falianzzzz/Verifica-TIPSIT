package com.example;

public class Quadre extends Thread{
    
private int Pfatt;
private int Sfatt;
private int ris;

    public Quadre (int Pfatt, int Sfatt){

this.Pfatt = Pfatt;
this.Sfatt = Sfatt;

    }

@Override
public void run() {
    
ris = Pfatt * Sfatt;

System.out.println("Prima tonda * Seconda tonda = " + ris);

}

public int getRis() {
    return ris;
}

public void setRis(int ris) {
    this.ris = ris;
}

}
