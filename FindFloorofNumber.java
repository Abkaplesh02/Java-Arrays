import java.util.Scanner;

public class FindFloorofNumber {
    public static int Floor(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[end];

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ::");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the elements of array :: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element to check for floor element:: ");
        int b =sc.nextInt();
        System.out.println(Floor(arr,b));


    }

}
