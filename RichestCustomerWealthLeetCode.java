// Richest customer wealth LeetCode
import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomerWealthLeetCode {

    public static int RichestCustomer(int arr[][]){
        int MaxWealth=0;
        for(int i=0;i<arr.length;i++){
            MaxWealth=Math.max(MaxWealth,Max(arr[i]));
        }
        return MaxWealth;
    }
    public static int Max(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of  2D array :: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        System.out.println("Enter the values of array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println("The max wealth is :: " + RichestCustomer(arr));

    }
}
