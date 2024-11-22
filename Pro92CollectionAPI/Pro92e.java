// Map == Collection of key and value pair

import java.util.Map;
import java.util.HashMap;

class Pro92f{
    public static void main(String args[]){
        Map<String,Integer>studentMark = new HashMap<>();
        studentMark.put("shivam",100);
        studentMark.put("Aman",40);
        studentMark.put("Vanish",60);



        System.out.println(studentMark);
        System.out.println(studentMark.keySet());

        for(String str : studentMark.keySet() ){
            System.out.println(str+" "+studentMark.get(str));
        }



    }
}