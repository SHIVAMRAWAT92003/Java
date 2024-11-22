
// We use stream because it provide many methodds to us

// once we use the stream we cant use it again.

import java.util.*;
import java.util.stream.Stream;


public class Pro96b{
    public static void main(String Args[]){
        List<Integer>nums = Arrays.asList(4,5,6,7,2);
       
        // Stream<Integer>s1 = nums.stream();
        // Stream<Integer>s2= s1.filter(n->n%2==0);
        // Stream<Integer>s3= s2.map(n->n*2);
        // int res= s3.reduce(0,(c,e)->c+e);
        // System.out.println(res);




int res= nums.stream()
        .filter(n->n%2==0)
        .map(n->n*2)
        .reduce(0,(c,e)->c+e);

        System.out.println(res);
 

         
       

                         



    }
}