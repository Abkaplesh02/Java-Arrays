import java.util.Scanner;

public class Find_in_Mountain_Array_LeetCodeHard {
    public static int Find(int arr[], int target){
       int Peak=Peak(arr);
       if(arr[Peak]==target){
           return Peak;
       }
       int ans=BS(arr,target,0,Peak);
       if(ans!=-1){
           return ans;
       }
       else{
           ans=BS2(arr,target,Peak+1,arr.length-1);
       }
       return ans;
    }

    public static int Peak(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+((end-start)/2);
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
        return start;
    }
    public static int BS(int arr[] , int target, int start, int end){
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
    public static int BS2(int arr[] , int target, int start, int end){
        while(start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
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
        System.out.println(Find(arr,b));
    }
}
