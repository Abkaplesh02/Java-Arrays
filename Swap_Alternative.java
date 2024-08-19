//Problem statement
//You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
//
//You don't need to print or return anything, just change in the input array itself.

import java.util.Arrays;
import java.util.Scanner;

public class Swap_Alternative {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter array elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i++;
        }
        System.out.print(Arrays.toString(arr));
    }
}
