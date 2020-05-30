package com.base;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private static List<Circulos> circulos=new ArrayList<>();
    private static final double MIN = 0.01;

    public static void main(String[] args) {

        Main app=new Main();

        int entradaDatos=Integer.parseInt(JOptionPane.showInputDialog("Desea crear una nueva lista?\n\tSi: 1 / No: 0 "));

        boolean bucle=true;
        while (bucle){
            if (entradaDatos==0){
                bucle=false;
            }
        }
    }

    public void inicio(){
        boolean random=true;

        while (random){
            double radRandom = Math.random();
            if (radRandom<MIN){
                random=false;
                continue;
            }
            var circ = new Circulos(radRandom);
            circulos.add(circ);
        }
    }
}
