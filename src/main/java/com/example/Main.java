package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int a ;
        int b ;
        int c ;


System.out.println("Espressione: 5 * [ (2a + 4) * (7b + 3) ] -10c");

//Uso lo scanner per prendere i dati da console

System.out.println("inserisci a: ");
Scanner s = new Scanner(System.in);
a = s.nextInt();

System.out.println("inserisci b: ");
s = new Scanner(System.in);
b = s.nextInt();

System.out.println("inserisci c: ");
s = new Scanner(System.in);
c = s.nextInt();

        int risFinale;

// faccio partire in ordine i thread 

Tonde t = new Tonde(a, b);  

t.start();
t.join(); 

Quadre q = new Quadre(t.getRis1(), t.getRis2());

q.start();
q.join();

CalcoloC cc = new CalcoloC(c);

cc.start();
 cc.join();

risFinale = 5*q.getRis();
risFinale -= cc.getRis();

System.out.println(risFinale);

    }
}