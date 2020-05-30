package com.base;

import javax.swing.*;
import java.util.*;

public class Main {

    private static List<Circulos> circulos=new ArrayList<>();
    private static final double MIN = 0.01;



    public static void main(String[] args) {

        Main app=new Main();


        boolean bucle=true;
        while (bucle){
            app.inicio();
            int entradaDatos=Integer.parseInt(JOptionPane.showInputDialog("Desea crear una nueva lista?\n\tSi: 1 / No: 0 "));
            if (entradaDatos==0){
                bucle=false;
            }
        }
    }

    public static void entradaDatos(String Título) {

        Scanner lector = new Scanner(System.in);
        int dato = 0;
        boolean bucle = true;
        while (bucle) {
            System.out.println(Título);
            //int lector=0;
            if (lector.hasNextInt()) {
                dato = lector.nextInt();
                bucle = false;
            } else {
                JOptionPane.showMessageDialog(null, "Debes introducir un número entero, 0 o 1", "Error de sintaxis", JOptionPane.ERROR_MESSAGE);
                lector.next();
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

        boolean mostrar = true;

        while (mostrar){
            ordenLista();
            int entradaDatos=Integer.parseInt(JOptionPane.showInputDialog("Desea ordenar la lista de nuevo?\n\tSi: 1 / No: 0 "));
            if (entradaDatos==0){
                mostrar=false;
            }
        }
    }

    public static void ordenLista(){
        JOptionPane.showMessageDialog(null,"Indica el orden que desea");
        boolean orden=true;
        while (orden){
            int entradaDatos=Integer.parseInt(JOptionPane.showInputDialog("Orden ascendente: 1 / Orden descendente?\n\tSi: 1 / No: 0 "));
            switch (entradaDatos){
                case 1:
                    ordenar(Circulos.Atributo.ASC);
                    break;
                case 0:
                    ordenar(Circulos.Atributo.DESC);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Error\nIntroduzca una respuesta correcta","Error de sintaxis",JOptionPane.ERROR_MESSAGE);
            }
            muestraCirculos();
        }
    }

    public static void muestraCirculos(){
        for (int i = 0; i < circulos.size(); i++) {
            JOptionPane.showMessageDialog(null,"Círculo número "+ (i+1) + ": " +circulos.get(i));
        }
    }

    public static void ordenar(Circulos.Atributo atr){
        switch (atr){
            case ASC:
                circulos.sort(Comparator.comparing(Circulos::getRadio));
                break;
            case DESC:
                circulos.sort(Comparator.comparing(Circulos::getRadio));
                Collections.reverse(circulos);
                break;
        }
    }
}
