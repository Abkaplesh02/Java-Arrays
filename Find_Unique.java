//Problem statement
//You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
//
//Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
//
//You need to find and return that number which is unique in the array/list.
//
// Note:
//Unique element is always present in the array/list according to the given condition.

import java.util.Scanner;

public class Find_Unique {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the elements of array :: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            int j;
            for( j=0;j<arr.length;j++){
               if(arr[i]==arr[j] && i!=j){
                   break;
               }
            }
            if(j==arr.length){
                System.out.println("The unique number is :: " + arr[i]);
                System.out.println("The index of unique number is :: " + i);
            }
        }
    }
}
