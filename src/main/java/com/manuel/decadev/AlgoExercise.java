package com.manuel.decadev;

public class AlgoExercise {

    public static void main(String[] args) {

        int[] diif = {100,-200,350,100,-600};
       int[] res = solution(diif);
        for (int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }


    }

    public static int[] solution(int [] diff){
        int [] newArr = new int[diff.length];

        int baseRating = 1500;

        int lowest = diff[0];
        int len = diff.length;
        for (int  i = 0; i < len; i++){
            if((i + 1) < len)
                lowest = diff[i+1] < lowest? diff[i+1]:lowest;

            if (diff[i] > 0)
                newArr[i] = baseRating + diff[i];
            else{
               newArr[i] = baseRating + (diff[i]);
            }
        }
        System.out.println(lowest);
        int highestRating = newArr[0];

        int[] newArr2 = new int[2];
        int[] resultArr = new  int[2];
        for (int i = 1; i < newArr.length; i++){
            if (newArr[i] > highestRating){
                highestRating = newArr[i];

            }
            newArr2[0] = highestRating;
        }
        resultArr[0] = newArr2[0];
       resultArr[1] = newArr2[0] + (lowest);



        return resultArr;
    }



}
