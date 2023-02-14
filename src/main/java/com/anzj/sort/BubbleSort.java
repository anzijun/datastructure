package com.anzj.sort;

import java.util.Arrays;

/**
 * @author anzj
 * @date 2022/3/12 10:51
 */
public class BubbleSort {

    public static void main(String[] args) {
        int a[]={1,4,3,2,5};
        BubbleSort.bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int[] arr){
        int jz;
        boolean changeFlag = false;
        boolean breakFlag = false;
        int count=0;
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    jz=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=jz;
                    changeFlag = true;
                }
            }
            if(changeFlag){
                changeFlag=false;
            }else{
                breakFlag = true;
            }
            count++;
            if(breakFlag)
                break;
        }
        System.out.println("比较了"+count+"次得出结果");
    }
}
