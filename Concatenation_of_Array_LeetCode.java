import java.util.Arrays;
import java.util.Scanner;

public class Concatenation_of_Array_LeetCode {
    public static int [] Concat(int arr[]){
        int arr2[]=new int[2*arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
            arr2[i+arr.length]=arr[i];
        }
        return arr2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :: ");
        int a=sc.nextInt();
        int arr[]=new int[a];

        System.out.println("Enter the elements of array :: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int arr2[]=Concat(arr);
        System.out.println(Arrays.toString(arr2));
    }
}
