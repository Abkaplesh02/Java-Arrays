import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_Two_Arrays {

    public static ArrayList<Integer>  Sum(int arr[], int arr1[] ){
        ArrayList<Integer> List=new ArrayList<>();
        int m=arr.length-1;
        int n=arr1.length-1;
        int carry=0;

        while(m>=0 && n>=0){
            int num=arr[m]+arr1[n]+carry;
            List.add(0,num%10);
            carry=num/10;
            m--;
            n--;
        }
        while(m>=0){
            int num=arr[m]+carry;
            List.add(0,num%10);
            carry=num/10;
            m--;
        }
        while(n>=0){
            int num=arr1[n]+carry;
            List.add(0,num%10);
            carry=num/10;
            n--;
        }
        if(carry!=0){
            List.add(0,carry);
        }

        return List;
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

        System.out.println("Enter the size of array :: ");
        int b = sc.nextInt();
        int arr1[] = new int[b];
        System.out.println("Enter the elements of array :: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));


        System.out.println("The sum of 2 array is :: ");
        System.out.println(Sum(arr,arr1));



    }
}


