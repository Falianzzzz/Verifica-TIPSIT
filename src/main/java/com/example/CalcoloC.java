package com.example;

public class CalcoloC extends Thread{
    
private int c;
private int ris;


public CalcoloC(int c){

this.c = c;

}

@Override
public void run() {
    
ris = 10*c;
System.out.println("10 * c = "+ ris);

}

public int getRis() {
    return ris;
}

public void setRis(int ris) {
    this.ris = ris;
}

}
