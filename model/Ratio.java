package Seminar5.model;

import Seminar5.Logger;

public class Ratio extends SetDigits implements Model {

    @Override
    public Object sum() {
        double result = x + y;
        Logger.logData("Сумма чисел: " + result);
        return result;
    }

    @Override
    public Object mult() {
        double result = x*y;
        Logger.logData("Произведение чисел: " + result);
        return result;
    }

    @Override
    public Object divide() {
        double result = x/y;
        Logger.logData("Частное чисел: " + result);
        return result;
    }

    @Override
    public Object difFerence() {
        double result = x-y;
        Logger.logData("Разность чисел: " + result);
        return result;
    }
}
