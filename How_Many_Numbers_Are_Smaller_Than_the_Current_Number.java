import java.util.Arrays;
import java.util.Scanner;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static int [] Smaller(int arr[]){
        int arr2[]=new int[arr.length];
        int start=0;

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j] && i!=j){
                    count++;
                }
            }
            arr2[start++]=count;
        }
        return arr2;
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
        System.out.println("The numbers smaller than current number are ::  " );
        System.out.println(Arrays.toString(Smaller(arr)));

    }


}
