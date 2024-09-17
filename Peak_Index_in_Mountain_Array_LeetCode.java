import java.util.Scanner;

public class Peak_Index_in_Mountain_Array_LeetCode {
    public static int Peak(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+((end-start)/2);
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else if (arr[mid]>arr[mid+1]){
                end=mid;
            }
        }
        return start;
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
        System.out.println("The peak of mountain array is :: ");
        System.out.println(Peak(arr));
    }
}
