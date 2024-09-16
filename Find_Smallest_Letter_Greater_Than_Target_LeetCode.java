import java.util.Scanner;

public class Find_Smallest_Letter_Greater_Than_Target_LeetCode {
    public static char Smallest(char arr[], char target){
        int start=0;
        int end=arr.length-1;
        if(arr[end]<=target){
            return arr[0];
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start];
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ::");
        int a=sc.nextInt();
        char arr[]=new char[a];
        System.out.println("Enter the elements of array :: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.next().charAt(0);
        }

        System.out.println("Enter the element to check for floor element:: ");
        char b =sc.next().charAt(0);
        System.out.println(Smallest(arr,b));


    }

}
