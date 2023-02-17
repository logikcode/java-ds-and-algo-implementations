package com.manuel.decadev;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class FileProcessing {

    public static void main(String[] args)  {

        try {
            openFile();
        }catch (SecurityException securityException){
            System.out.print("Something bad happened");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // a method that opens file and write form it from terminal

    public static void openFile() throws SecurityException,
            FileNotFoundException, IOException {
        File theFileObject = new File("aFile.txt");
        if(theFileObject.exists()){
            System.out.println("File Already Exist");
        }

        try(
               // FileInputStream inputStream = new FileInputStream("/Users/dec/IdeaProjects/java-testing/sampledatafoodsales.csv.csv");
               // Scanner scanner1 = new Scanner(inputStream);

                FileOutputStream outputWriter = new FileOutputStream("aFile.txt");
                PrintWriter writeTo = new PrintWriter(outputWriter);
                Scanner reader = new Scanner(System.in).useDelimiter("\n");
        ) {

         boolean ok ;
            do{
                String line = System.getProperty("line.separator");
                //System.out.println(line);
                String firstName = reader.nextLine();
                writeTo.print(firstName);
                String lastName = reader.nextLine();
                writeTo.print(lastName);
                int age = reader.nextInt();
                writeTo.println(age);
                reader.nextLine();

                System.out.println("Input Collected\nContinue or Press Enter Key to quit");

                ok = !reader.nextLine().equals("\n")? true: false;

            } while (ok);
        }



    }
}
