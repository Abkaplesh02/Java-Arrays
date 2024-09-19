import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kids_With_the_Greatest_Number_of_Candies_LeetCode {
    public static ArrayList<Boolean> Candies(int arr[], int n){
        ArrayList <Boolean> list=new ArrayList<>();
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=Math.max(arr[i],max);
            }
        }
        for(int i=0;i<arr.length;i++){
            if((arr[i]+n)>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
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
        System.out.println(Arrays.toString(arr));
        System.out.println("enter number of extra candies");
        int c=sc.nextInt();
        ArrayList<Boolean> list=Candies(arr,c);
        System.out.println(list);
    }
}
