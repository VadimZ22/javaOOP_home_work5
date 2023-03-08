package Seminar5.presenter;

import Seminar5.model.ComplexCalc;
import Seminar5.model.Ratio;
import Seminar5.view.View;

public class Presenter {
    View view;
    ComplexCalc modelComplex;
    Ratio modelRatio;


    public Presenter(View v, ComplexCalc c, Ratio r) {
        view = v;
        modelComplex = c;
        modelRatio = r;
    }

    public void buttonClick(){
        int operation = view.getValueCase("С какими числами хотите выполнить операцию:\n" +
                "1 - комплексные\n" +
                "2 - рациональные\n");
        switch (operation){
            case 1: buttonClickComplex(); break;
            case 2: buttonClickRatio(); break;
        }
    }

    public void buttonClickComplex(){
        double x = view.getValue("x: ");
        double y = view.getValue("y: ");
        double a = view.getValue("a (мнимая часть): ");
        double b = view.getValue("b (мнимая часть): ");
        modelComplex.setX(x);
        modelComplex.setY(y);
        modelComplex.setA(a);
        modelComplex.setB(b);
        int operation = view.getValueCase("Введите операцию:\n" +
                            "1 - sum\n" +
                            "2 - mult\n" +
                            "3 - divide\n" +
                            "4 - difference\n");
        switch (operation){
            case 1: view.print(modelComplex.sum(), "sum result: "); break;
            case 2: view.print(modelComplex.mult(), "mult result: "); break;
            case 3: view.print(modelComplex.divide(), "divide result: "); break;
            case 4: view.print(modelComplex.difFerence(), "difference result: "); break;
        }
    }

    public void buttonClickRatio(){
        double x = view.getValue("x: ");
        double y = view.getValue("y: ");
        modelRatio.setX(x);
        modelRatio.setY(y);
        int operation = view.getValueCase("Введите операцию:\n" +
                "1 - sum\n" +
                "2 - mult\n" +
                "3 - divide\n" +
                "4 - difference");
        switch (operation){
            case 1: view.print(modelRatio.sum(), "sum result: "); break;
            case 2: view.print(modelRatio.mult(), "mult result: "); break;
            case 3: view.print(modelRatio.divide(), "divide result: "); break;
            case 4: view.print(modelRatio.difFerence(), "difference result: "); break;
        }
    }

}
