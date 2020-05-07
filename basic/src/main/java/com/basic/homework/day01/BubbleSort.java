package com.basic.homework.day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ldk on 2020/5/5.
 */
public class BubbleSort {

    public static Integer[] generateArray(int len,int range){
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<len;i++){
            list.add(random.nextInt(range));
        }
        return list.toArray(new Integer[list.size()]);
    }

    public static Integer[] doBubbleSort(Integer[] randomArray){
        for(int i=0;i<randomArray.length-1;i++){
            for(int j=0;j<randomArray.length-i-1;j++){
                if(randomArray[j]<randomArray[j+1]){
                    Integer tmp = randomArray[j];
                    randomArray[j] = randomArray[j+1];
                    randomArray[j+1] = tmp;
                }
            }
        }
        return randomArray;
    }

    public static Integer[] doBubbleSort01(Integer[] randomArray){

        for(int i=0;i<randomArray.length-1;i++){
            boolean flag = true;
            for(int j=0;j<randomArray.length-i-1;j++){
                if(randomArray[j]<randomArray[j+1]){
                    Integer tmp = randomArray[j];
                    randomArray[j] = randomArray[j+1];
                    randomArray[j+1] = tmp;
                    flag =false;
                }
            }
            if(flag==true){
                return randomArray;
            }
        }
        return randomArray;
    }

    public static Integer[] doBubbleSort02(Integer[] randomArray){
        int k = randomArray.length-1;

        for(int i=0;i<randomArray.length-1;i++){

            int index = 0;
            boolean flag = true;
            for(int j=0;j<k;j++){
                if(randomArray[j]<randomArray[j+1]){
                    Integer tmp = randomArray[j];
                    randomArray[j] = randomArray[j+1];
                    randomArray[j+1] = tmp;
                    flag =false;
                    index = j;
                }
            }
            if(flag==true){
                return randomArray;
            }
            k = index;
        }
        return randomArray;
    }


    public static void main(String[] args) {
        Integer[] randomArray = BubbleSort.generateArray(10,100);
        for (Integer x:randomArray
             ) {
            System.out.println(x);
        }

        System.out.println("####################");

//        for (Integer y : BubbleSort.doBubbleSort(randomArray)){
//            System.out.println(y);
//        }


//        for (Integer y : BubbleSort.doBubbleSort01(randomArray)){
//            System.out.println(y);
//        }

//        Integer[] rand = new Integer[]{10,7,8,9,6,5,4,3,2,1};

        for (Integer y : BubbleSort.doBubbleSort02(randomArray)){
            System.out.println(y);
        }


    }



}
