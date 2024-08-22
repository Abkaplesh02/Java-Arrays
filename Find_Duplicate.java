import java.util.Scanner;

//Problem statement
//You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
//
//Note :
//Duplicate number is always present in the given array/list.
//You don't need to print or return anything, just change in the input array itself.
public class Find_Duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the elements of array :: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                    System.out.println("The element is present at :: " + i + " index  and the duplicate element is :: " + arr[i] );
                }
            }
        }
    }
}
