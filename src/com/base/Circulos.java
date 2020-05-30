package com.base;

public class Circulos {

    public enum Atributo{
        ASC,DESC;
    }

    private double radio;

    public Circulos(double radio){
        this.radio =radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPerímetro(double radio){
        return Math.PI*radio*2;
    }

    public double getArea(double radio){
        return Math.PI*(Math.pow(radio,2));
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f %s: %.2f %s: %.2f","Radio",this.getRadio(),"Area",this.getArea(this.getRadio()),"Perímetro",this.getPerímetro(this.getRadio()));
    }

}
