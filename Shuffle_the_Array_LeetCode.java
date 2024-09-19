import java.util.Arrays;
import java.util.Scanner;

public class Shuffle_the_Array_LeetCode {
    public static int [] Shuffle(int arr[]){
        int arr2[]=new int[arr.length];

        int start=0;
        int mid=((arr.length)/2);
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr2[i]=arr[start++];

            }
            else{
                arr2[i]=arr[mid++];
            }
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

        int arr2[]=Shuffle(arr);
        System.out.println(Arrays.toString(arr2));
    }
}
