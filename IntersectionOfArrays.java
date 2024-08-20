//Problem statement
//You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively.
// You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists
// contain a particular value or to put it in other words, when there is a common value
// that exists in both the arrays/lists.

import java.util.Scanner;

public class IntersectionOfArrays {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array 1 and array 2  :: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[]=new int[a];
        int arr1[]=new int[b];
        System.out.println("Enter elements of array 1 :: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter elements of array 2 :: ");
        for(int j=0;j<arr1.length;j++){
            arr1[j]=sc.nextInt();
        }

        System.out.println("The intersected elements are :: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    System.out.println(arr[i]);
                    arr[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }




    }
}
