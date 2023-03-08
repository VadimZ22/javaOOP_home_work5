package Seminar5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
    public static void logData(String msg){
        Date currentTime = new Date();
        try (FileWriter file = new FileWriter("C:\\Users\\Home-PC\\Лекции, семинары\\OOP_Java\\src\\main\\java\\Seminar5\\Log.log", true)){
            StringBuilder sb = new StringBuilder();
            sb.append(currentTime + ": " + msg + "\n");
            file.append(sb);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
