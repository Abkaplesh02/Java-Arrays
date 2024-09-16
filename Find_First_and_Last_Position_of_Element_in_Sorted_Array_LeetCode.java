import java.util.Arrays;
import java.util.Scanner;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_LeetCode {
    public static int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};

        int start=BS(nums,target,0,nums.length-1,true);
        int end=BS(nums,target,0,nums.length-1,false);

        ans[0]=start;
        ans[1]=end;

        return ans;

    }
    public static int BS(int arr[], int target, int start,int end, boolean check){
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                if(check){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static int BEnd(int arr[] , int target){
        int start=0;
        int end=arr.length-1;
        boolean check=true;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]==target){
                start=mid+1;
                check=false;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(!check){
            return end;
        }
        else{
            return -1;
        }


    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ::");
        int a=sc.nextInt();
        int arr[]=new int [a];
        System.out.println("Enter the values of array :: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target :: ");
        int b=sc.nextInt();
        System.out.println("the position of elements is :: ");
        System.out.println(Arrays.toString(searchRange(arr,b)));
    }
}




