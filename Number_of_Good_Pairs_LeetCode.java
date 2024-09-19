import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Number_of_Good_Pairs_LeetCode {
    public static int Pairs(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        return count;
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
        System.out.println("The number of pairs are :: " + Pairs(arr));

    }
}
