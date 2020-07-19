package com.itheima_04;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 32, 23, 15, 16, 17, 45, 78, 98, 7, 34, 55, 67, 38, 48, 69, 30};
        int temp;
        for (int i = arr.length-1; i > 0; i--) {
            int flag=0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag=1;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(flag==0)
                break;
        }
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d ",arr[i]);
        }
    }
}
