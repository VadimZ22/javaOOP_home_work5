package Seminar5.model;

import Seminar5.Logger;

public class Complex extends SetDigits{
    public Complex(double c, double d) {
        this.x = c;
        this.y = d;
        Logger.logData("Complex number " + x +" , "+ y +"i created!");
    }

    @Override
    public String toString() {
        return  x + ", " + y + "i";
    }
}
