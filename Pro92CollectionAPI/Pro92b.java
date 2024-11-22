// List can work with the index aswell but collection cant.

import java.util.ArrayList;
import java.util.List;

class Pro92b{

public static void main(String args[]){


 List<Integer>nums =new ArrayList<Integer>();
 nums.add(2);
 nums.add(3);
 nums.add(4);
 nums.add(5);
 nums.add(2);

// calling entire arraylist
 System.out.println(nums.get(3));
 nums.set(2,101);
 System.out.println(nums.get(2));
 System.out.println(nums.indexOf(2));





}



}