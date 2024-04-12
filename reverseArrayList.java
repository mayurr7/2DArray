import java.util.ArrayList;
import java.util.Collections;

public class reverseArrayList {
    // static void reverseArrayListt(ArrayList<Integer> li){
    //     int i =0 ; int j = li.size()-1;

    //     while (i < j) {
    //        Integer temp = Integer.valueOf(li.get(i));
    //        li .set(i, li.get(j));
    //        li.set(j, temp);

    //        i++;
    //        j--;         
            
    //     }
    // }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(04);
        l1.add(5);

        System.out.println("Given ArrayList : " +l1);
   
        
        //reverseArrayListt(l1);
        // System.out.println("New reversed list : " +l1);

        //usinh predefine Method
        Collections.reverse(l1); 
        System.out.println("New reversed list : " +l1);

    }
}
