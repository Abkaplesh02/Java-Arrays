import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array :: ");
        int a=sc.nextInt();
        int [] arr=new int[a];
        System.out.println("Enter the values of array :: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value to search in array :: ");
        int b=sc.nextInt();

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(b==arr[i]){
                System.out.println("The element is present at :: " + i);
                count++;
            }
        }
        if(count==0){
            System.out.println("The element is not present in array.");
        }
    }
}
