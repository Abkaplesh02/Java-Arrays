//Problem statement
//You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.
//
//Note :
//Given array/list can contain duplicate elements.

import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the values of array :: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        System.out.println("Enter the value of triplet sum :: ");
        int b=sc.nextInt();

        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==b){
                        count++;
                    }
                }
            }
        }
        System.out.println("The total triplet sum is :: " + count);
    }
}
