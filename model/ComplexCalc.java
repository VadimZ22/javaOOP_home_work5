package Seminar5.model;

import Seminar5.Logger;

public class ComplexCalc extends SetDigits implements Model<Complex> {

    @Override
    public Complex sum() {
        Logger.logData("Сумма комплексных чисел: ");
        return new Complex((x + a), (y + b));
    }

    @Override
    public Complex mult() {
        Logger.logData("Произведение комплексных чисел: ");
        return new Complex((x*a - y*b), (y*a + b*x));
    }

    @Override
    public Complex divide() {
        Logger.logData("Частное комплексных чисел: ");
        return new Complex((x*a + y*b)/(y*y+b*b), (y*a - b*x)/(y*y+b*b));
    }

    @Override
    public Complex difFerence() {
        Logger.logData("Разность комплексных чисел: ");
        return new Complex((x - a), (y - b));
    }
}
