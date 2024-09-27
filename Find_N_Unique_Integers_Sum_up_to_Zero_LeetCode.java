import java.util.Arrays;
import java.util.Scanner;

public class Find_N_Unique_Integers_Sum_up_to_Zero_LeetCode {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter elements of array ");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array elements are :: ");
        System.out.println(Arrays.toString(arr));
    }
}
