import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr1=new int[10];

        System.out.println("Enter the values of array :: ");
        for(int i=0;i<arr1.length;i++){
            System.out.println("Enter " + (i+1) + " element of array");


            arr1[i]=sc.nextInt();
        }

//        System.out.println(Arrays.toString(arr1));
        for(int i : arr1){
            System.out.print(i+" ");
        }


        }
    }