//Problem statement
//You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.
//
//Note:
//You need to change in the given array/list itself. Hence, no need to return or print anything.

import java.util.Arrays;
import java.util.Scanner;

public class Sort01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the elements of array :: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int start=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=arr[start];
                arr[start]=0;
                start++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
