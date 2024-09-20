import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Create_Target_Array_in_the_Given_Order_LeetCode {
    public static int [] Target(int arr[], int index[]){
        ArrayList<Integer>List=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            List.add(index[i],arr[i]);
        }
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=List.get(i);
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
        System.out.println("Enter the size of Index array :: ");
        int b=sc.nextInt();
        int arr2[]=new int[b];

        System.out.println("Enter the elements of array :: ");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The resultant array is :: ");
        System.out.println(Arrays.toString(Target(arr,arr2)));

    }
}
