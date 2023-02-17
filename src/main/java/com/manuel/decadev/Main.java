package com.manuel.decadev;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
   static Date dat = null;
    public static void main(String[] args) {
        // write your code here
        // Person p1 = new Person("","","",23);
        // p1.showThis();

        /*int[] arr = {23,56,2};

        swapArrays(arr);
        for (int item : arr) {
            System.out.print(item + "\t");
        }

         */


        System.out.println(solution(4));

    }

    public static String solution(int n) {

        switch(n){
            case 1 :
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
        }
        return "";
    }

    public static void takeDateV2(Date date){
        date = new Date(7654321);

    }
    public static void takeDate(Date date){
        date = new Date();
        //System.out.println(date);

    }

    public static long takeDateNull(Date date){
        date = new Date(7654321);
        return date.getTime();
    }

    public static void swapArrays(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

    }


       /* Circle c1 = new Circle(30);
        Circle c2 = new Circle(90);

        Count cnt = new Count(2);

        int times = 0;
        for (int i = 0; i < 100; i++){
        increment(cnt, times);

        }*/

        /*
        ArrayList<Integer> intArr = new ArrayList<>(3);
        intArr.add(1);
        intArr.add(3);
        intArr.add(5);
        intArr.add(0);
        graph(intArr);





        }

    public static String graph(ArrayList<Integer> nums) {
        //System.out.println(nums.size());

        if (nums.size() == 0 || nums.size() < 1) {
            return "";
        }
        int arrayLength = nums.size();

        for (int i = 0; i < arrayLength; i += 1) {
            int number = nums.get(i);
            String res = "";
            for (int j = 0; j < number; j += 1) {

                res += "*";
                //System.out.print(res);
                //System.out.println();
            }
            System.out.println(res);


        }
        return "";
    }
*/

        /*System.out.println("Count dataField in Count Object is:" + " " + cnt.count);
        System.out.println("Times is : " + " " + times);*/

        //Circle.swap(c1, c2);
        /*System.out.println("Swap:c1 value (20)" + " " + c1.radius +
                ":"+"c2 value(10)" + c2.radius);
        */

        //Circle.swap2(c1, c2);
        //System.out.println("After swap2:" + " C1 = " + c1.radius + "\n\t\t\t C2 = " + c2.radius);

        //printAreas(c1, 5);

        /* Scanner scanner =  new Scanner(System.in);
        System.out.println("Please input an int value");
        int intInput = scanner.nextInt();
        System.out.println("Please input a double value");
        double dbInput = scanner.nextDouble();
        System.out.println("Please input a sentence");
        scanner.nextLine();
        String strInput = scanner.nextLine();

        System.out.println(intInput);
        System.out.println(dbInput);
        System.out.println(strInput);

*/


        /*
    public static void printAreas(Circle c, int times){
        System.out.println("Radius \t\t Areas");
        for (int i = 1; i < times; i++){


            System.out.println(c.getRadius() +"\t\t\t" + c.getArea());
            c.setRadius(c.getRadius() + i);
        }

    }

    public static void increment(Count count, int times){
        count.count++;
        times++;

    }
*/




}
