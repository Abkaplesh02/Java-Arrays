import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Build_Array_from_Permutation_LeetCode {
    public static int[] Permutations(int arr[]){
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[arr[i]];
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
        int arr2[]=Permutations(arr);
        System.out.println("The array after permutations is :: ");
        System.out.println(Arrays.toString(arr2));


    }
}
