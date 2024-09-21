import java.util.Arrays;
import java.util.Scanner;

public class Check_if_the_Sentence_Is_Pangram_LeetCode {
    public static boolean Pangram(String str){

     for(char alpha='a';alpha<='z';alpha++){
         if(str.indexOf(alpha)==-1){
             return false;
         }
     }
     return true;
    }

    public static boolean CheckPangram(String str){
        int arr[]=new int[256];
        Arrays.fill(arr,0);
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
        }
        for(int i=97;i<=122;i++){
            if(arr[i]==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check for pangram:: ");
        String str=sc.next();
        System.out.println("The given string is pangram :: " + Pangram(str));

    }
}
