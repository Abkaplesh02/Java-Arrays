import java.util.Scanner;

public class Find_Position_Of_Array_in_SortedArray_Of_Infinite_Number {
    public static int Position(int arr[], int target){
        int start=0;
        int end=1;
        while(arr[end]<target){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return BS(arr,target,start,end);

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

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ::");
        int a= sc.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the elements of array :: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the search target :: ");
        int b=sc.nextInt();
        System.out.println(Position(arr,b));

    }
}
