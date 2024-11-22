// HashTable == Collection of key and value pair in synchronized

import java.util.Map;
import java.util.Hashtable;

class Pro92f{
    public static void main(String args[]){
        Map<String,Integer>studentMark = new Hashtable<>();
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