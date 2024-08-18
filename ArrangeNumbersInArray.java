//Problem statement
//You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
//
//Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
//
//Note:
//You need not print the array. You only need to populate it.

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeNumbersInArray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements to enter in array :: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        int b=arr.length;
        int c=0;

        for(int i=1;i<=arr.length;i++){
            if(i%2==0){
                arr[b-1]=i;
                b--;
            }else {
                arr[c]=i;
                c++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}
