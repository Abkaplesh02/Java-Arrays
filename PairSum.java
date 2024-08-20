//Problem statement
//You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.
//
//Note:
//Given array/list can contain duplicate elements.

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter elements of array ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the sum for pair sum :: ");
        int b=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==b){
                    count++;
                }
            }
        }
        System.out.println("The count of pair sum is ;: " + count);
    }
}
