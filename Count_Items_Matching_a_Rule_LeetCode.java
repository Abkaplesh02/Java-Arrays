import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Count_Items_Matching_a_Rule_LeetCode {

    public static int Matching(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue){
        int countI=0;
        int count=0;
        if(ruleKey.equals("type")){
            countI=0;
        }
        if(ruleKey.equals("color")){
            countI=1;
        }
        if(ruleKey.equals(("name"))){
            countI=2;
        }

        for(int i=0;i<items.size();i++){
            if(items.get(i).get(countI).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of array List :: ");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
        ArrayList<ArrayList<String>>List=new ArrayList<>(3);
        for(int i=0;i<3;i++){
            List.add(new ArrayList<>(3));
        }

        System.out.println("adding elements to array List :: ");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                List.get(i).add(sc.next());
            }
        }

        for(int i=0;i<List.size();i++){
            System.out.println(List.get(i));
        }
        System.out.println("Enter the rulekey");
        String rule=sc.next();
        System.out.println("Enter the ruleValue");
        String value=sc.next();
        System.out.println("The items matching are :: " );
        System.out.println(Matching(List,rule,value));
    }
}
