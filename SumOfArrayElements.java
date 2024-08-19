import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] array1 = new int[10];
        System.out.println("Enter the element of array  :: ");
        int sum=0;
        for(int i=0;i<array1.length;i++){
            System.out.println("Add the " + (i+1) + " element");
            array1[i]=sc.nextInt();
            sum+=array1[i];
        }

        System.out.println(Arrays.toString(array1));
        System.out.println("The sum of arrays is :: " + sum);

    }
}
