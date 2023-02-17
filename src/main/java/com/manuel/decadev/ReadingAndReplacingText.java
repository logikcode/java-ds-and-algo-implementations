package com.manuel.decadev;

import java.io.*;
import java.util.Scanner;

public class ReadingAndReplacingText {
    // Reading from command-line
    // and replace an occurrence of text


    public static void main(String[] args)  {

        try {
            readLine(args);
        }catch (FileNotFoundException fileIO){
            System.out.println("Exception thrown");
            fileIO.getCause();
        }
    }

   static String readLine(String[] args) throws FileNotFoundException {
        // java ReplaceText FormatString.java t.txt StringBuilder StringBuffer
        String word = "";
        Scanner input = new  Scanner(System.in);
        word = input.nextLine();



        // use the 3rd word/string as the source file
        // use the 4th word/string as the target file to write the new string to
        // the 5th as the word to replace the 6th word with
        // check if the file exist
        if (args.length < 4){
            System.out.println("The string from the terminal is less than required");
            System.exit(1);
        }
        // check if this class exist
        File theClassFile = new File(args[1]);
        if (!theClassFile.exists()){
            System.out.println("The file doesnt exist. Can't proceed");
            System.exit(2);
        }
        FileInputStream sourceFile =  new FileInputStream(args[3]);
        Scanner sc = new Scanner(sourceFile);
        FileOutputStream targetFile = new FileOutputStream(args[4]);
        PrintWriter writer = new PrintWriter(targetFile);

        boolean hasMoreText =  sc.hasNext();
        word = sc.nextLine();
        String newWorld = word.replaceAll(args[5], args[6]);
        writer.println(newWorld);

        return word;
    }

}
