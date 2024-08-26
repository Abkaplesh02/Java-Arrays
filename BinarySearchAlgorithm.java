import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgorithm {
    public static int BS(int arr[] , int a){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]>a){
                end=mid-1;
            }
            if(a>arr[mid]){
                start=mid+1;
            }
            if(arr[mid]==a){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the values of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the number to check for BS :: ");
        int b=sc.nextInt();
        System.out.println("The element is present at :: "+ BS(arr,b));
    }
}
