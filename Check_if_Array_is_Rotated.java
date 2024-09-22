import java.util.Scanner;

public class Check_if_Array_is_Rotated {
    public static int Rotation(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return i+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :: ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the elements of array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" The array is rotated by :: " + Rotation(arr));
    }
}
