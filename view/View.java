package Seminar5.view;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String title){
        System.out.printf("%s", title);
        return in.nextDouble();
    }
    public int getValueCase(String title){
        System.out.printf("%s", title);
        return in.nextInt();
    }
    public void print(Object data, String title){
        System.out.printf("%s %s", title, data.toString());
    }


}
