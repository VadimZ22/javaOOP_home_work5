package Seminar5;

import Seminar5.model.ComplexCalc;
import Seminar5.model.Ratio;
import Seminar5.presenter.Presenter;
import Seminar5.view.View;

public class Main {
    public static void main(String[] args) {

        Presenter pr = new Presenter(new View(), new ComplexCalc(), new Ratio());
        pr.buttonClick();

    }



}
