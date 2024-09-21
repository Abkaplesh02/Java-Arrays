import java.util.Scanner;

public class Find_the_Highest_Altitude_LeetCode {

    public static int Altitude(int arr[]){
        int arr2[]=new int[arr.length];
        int max=0;
        int number=0;
        for(int i=0;i<arr.length;i++){
            number+=arr[i];
            arr2[i]=number;
            max=Math.max(number,max);
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the elements of array :: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The altitude is " + Altitude(arr));

    }
}
