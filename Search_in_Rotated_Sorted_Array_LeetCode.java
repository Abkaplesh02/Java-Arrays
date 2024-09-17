import java.util.Scanner;

public class Search_in_Rotated_Sorted_Array_LeetCode {
    public static int Search(int arr[] , int target){
        int Peak=Pivot(arr);
        int ans=BS(arr,target,0,Peak);
        if(ans!=-1){
            return ans;
        }
        else{
            ans=BS(arr,target,Peak+1,arr.length-1);
        }
        return ans;

    }
    public static int BS(int arr[], int target, int start,int end){
        while(start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
   public static int Pivot(int arr[]){
       int start=0;
       int end=arr.length-1;
       while(start<end){
           int mid=start+((end-start)/2);
           if(arr[mid]>arr[mid+1] && end>mid){
               return mid;
           }
           else if(arr[mid]<arr[mid-1]){
               return mid-1;
           }
           else if(arr[mid]>=arr[start]){
               start=mid+1;
           }
           else{
               end=mid-1;
           }
       }
       return -1;
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
        System.out.println("Enter the element to find :: ");
        int b=sc.nextInt();
        System.out.println("The element of array is :: ");
        System.out.println(Search(arr , b));

    }
}
