// Sort using in built function

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Pro92g{
    public static void main(String args[]){

Comparator<Integer>com = new Comparator<Integer>(){
    // logical of sorting base on last value of digit.
        public int compare(Integer i ,Integer  j){
            if(i%10>j%10){
      return 1;
            }
            else{
                return -1;
            }

        }
};



        List<Integer>Mark = new ArrayList<>();
        Mark.add(47);
        Mark.add(31);
        Mark.add(72);
        Mark.add(18);
        Collections.sort(Mark,com);
        System.out.println(Mark);




    }
}