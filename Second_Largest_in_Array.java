//Problem statement
//You have been given a random integer array/list(ARR) of size N.
// You are required to find and return the second largest element present in the array/list.
import java.util.Scanner;

public class Second_Largest_in_Array {
    public static int Largest(int arr[]){
        int Larges=Integer.MIN_VALUE;
        int SecondLar=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>Larges){
                SecondLar=Larges;
                Larges=arr[i];
            }
            else if(arr[i]<Larges && arr[i]>SecondLar){
                SecondLar=arr[i];
            }
        }
        return SecondLar;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :: ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the elements of array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The second largest element is :: ");
        System.out.println(Largest(arr));
    }
}
