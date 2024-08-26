import java.util.Arrays;
import java.util.Scanner;

public class EvenNumberOfDigitsLeetCode {
    public static int EvenNumber(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(CheckEven(arr[i])){
                count++;
            }
        }
        return count;
    }
    public static boolean CheckEven(int a){
//        int count=0;
//        while(a>0){
//            a=a/10;
//            count++;
//        }
//        if(count%2==0){
//            return true;
//        }
//        else{
//            return false;
//        }
        if
        ((Math.log10(a))%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the values of array");
         for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
         }
        System.out.println(Arrays.toString(arr));

        System.out.println("The number of even digit number are ::: " + EvenNumber(arr));
    }
}
