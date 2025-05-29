package com.example;

public class Tonde extends Thread{
    
private int a;
private int b;

private int ris1;
private int ris2;

public Tonde(int a, int b){

this.a = a;
this.b = b;

}

@Override
public void run() {
    
ris1 = 2*a;
ris1 += 4;
ris2 = (7*b);
ris2 += 3;


System.out.println("2a + 4 = "+ ris1);

System.out.println("7b + 3 = "+ ris2);

}

public int getRis1() {
    return ris1;
}

public void setRis1(int ris1) {
    this.ris1 = ris1;
}

public int getRis2() {
    return ris2;
}

public void setRis2(int ris2) {
    this.ris2 = ris2;
}



}
