package com.thinkgem.jeesite.编程思想练习;


import java.util.Arrays;
import java.util.List;


public class day01 {
    public static void main(String[] args) {
        int num = 1000;
        Integer[] intArray = new Integer[num];

        for(int i = 0 ;i<num;i++){
            intArray[i] = i;
        }
        List<Integer> list = Arrays.asList(intArray);

    }

    public static boolean isPrime(int number){

       for(int temp = 2;temp<=number;temp++){
           if(number%temp == 0 && number!=temp){
               return false;
           }else if(temp == number){
               return true;
           }
       }
       return false;
    }
}
