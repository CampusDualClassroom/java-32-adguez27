package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise32 {

    public static void main(String[] args) {

        String textToSave = generateStringToSave(null);
        System.out.println(textToSave);
        printToFile(textToSave);
    }

    public static String generateStringToSave(String text) {
        if (text != null) {
            return text;
        } else {
        return generateUserInputToSave();
        }
    }



    private static String generateUserInputToSave(){
        StringBuilder sb = new StringBuilder();
        System.out.println("Escribe debajo el texto que quieras. Pulsa \"ENTER\" 2 veces seguidas para finalizar:");
        String string;
        while(!(string = Utils.string()).isEmpty()){
            sb.append(string).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void printToFile(String string) {

       try{ Files.write(Paths.get("src/main/resources/data.txt"), string.getBytes());
       }catch(Exception a){
        System.out.println("Ups hubo un error.");
       }
    }


}
