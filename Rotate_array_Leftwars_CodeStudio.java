//You have been given a random integer array/list(ARR) of size N.
// Write a function that rotates the given array/list by D elements(towards the left).

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_array_Leftwars_CodeStudio {
    public static int[] Rotate(int arr[],int k){

        Reverse( arr, 0,k-1);
        Reverse(arr,k,arr.length-1);
        Reverse(arr,0,arr.length-1);

        return arr;
    }

    public static void Reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public static int[] Rotate2(int arr[],int k){
        int arr1[]=new int[arr.length];
        int start=0;
        for(int i=k;i<arr.length;i++){
            arr1[start]=arr[i];
            start++;
        }
        for(int i=0;i<k;i++){
            arr1[start]=arr[i];
            start++;
        }

        return arr1;
    }

    public static int[] RotateRight(int arr[] , int k){
        int n=arr.length;
        k%=arr.length;
        Reverse(arr,0,n-1-k);
        Reverse(arr,n-k,n-1);
        Reverse(arr,0,n-1);

        return arr;
    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the elements of array :: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the rotation number :: ");
        int target=sc.nextInt();
        System.out.println("The rotated array is :: ");
        System.out.println(Arrays.toString(Rotate2(arr,target)));

    }
}
