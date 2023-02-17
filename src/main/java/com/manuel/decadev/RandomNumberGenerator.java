package com.manuel.decadev;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;

public class RandomNumberGenerator{

    public static void main(String[] args) {
        //byte[] bytes = {'a','b','c','d'};
        RandomNumberGenerator rng = new RandomNumberGenerator();
        //System.out.println(rng.gcd(230,500));
        rng.writeToFile();
        int [] arrofInts = {4,93,317,4,5000,3000000, 9837300};
        int[] res = rng.multipleOf(arrofInts);
        int len = res.length;
        int i = 0;
        while ( len > 0){
        //    System.out.print(res[i]);
            i += 1;
            len -= 1;
            if (i%5==0)
                System.out.print("\t");
        }


        int time = 100;
        while (time >= 0){
            if (time % 2 == 0)
                System.out.print("\t");
            if (time % 10 == 0)
                System.out.println();
            System.out.print(rng.generateString());
            time -= 1;

        }


    }

    int gcd (int num1, int num2){
        int gcd = 1;
        int upNum = Math.abs(num1);
        int downNum = Math.abs(num2);
        int i = 1;
        while ( i <= upNum && i <= downNum){
            if (upNum % i == 0 && downNum % i == 0){
                gcd = i;
            }
            i += 1;
        }
        return gcd;
    }

    int[] multipleOf(int[] arrOfNum){
        int[] arrs = new int[50];
        // arrOfnum => [8,5,20]
        // multiple range => 1 - 5



        int len = arrOfNum.length;
        int i = 0;
        int newArrIndex = 0;

        while ( len > 0){

            int upperBound = 5;
            int lowerBound = 1;
            int multi;

            while (lowerBound <= upperBound ) {
                multi = lowerBound * arrOfNum[i];
                arrs[newArrIndex] = multi;

                lowerBound += 1;
                newArrIndex += 1;
            }

            i += 1;
            len -= 1;
        }
        return arrs;
    }

    String generateString(){
        StringBuilder stringBuilder = new StringBuilder();
        int times = 5;

        while (times > 0){
            String HTTP_STRING = "https://";
            Random num = new Random();
            int base = 97;
            int rand = num.nextInt(26);
            char ch = (char)(rand + base );
            if (times == 1)
                stringBuilder.append(HTTP_STRING);
            stringBuilder.append(ch);

            times -= 1;
        }

        stringBuilder.append("\\").append('\t');
        stringBuilder.trimToSize();

        return stringBuilder.toString();
    }

    void writeToFile(){
        int noOfTimes  = 100;
        int i = 1;
        try {

            FileOutputStream file = new FileOutputStream("textfile.txt");
            PrintWriter writer = new PrintWriter(file);
            writer.println();

            while (i <= noOfTimes){

                if (i % 10 != 0){
                    writer.print(this.generateString());
                } else {
                    writer.print(this.generateString());
                    writer.println();
                }



                i += 1;
            }
            writer.close();
        } catch (FileNotFoundException fileErrorEx){
            System.out.println("Something went wrong");
            fileErrorEx.getCause();
        }

    }
}
