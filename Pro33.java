import java.util.*;

class Pro33{


public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String str = "My name is Shivam Rawat";

System.out.println(str.length());
System.out.println(str.toLowerCase());
System.out.println(str.toUpperCase());
System.out.println(str.substring(3));
System.out.println(str.substring(3,8));
System.out.println(str.replace('S','C'));
System.out.println(str.replace("at","AT"));
System.out.println(str.startsWith("Har"));
System.out.println(str.endsWith("at"));
System.out.println(str.charAt(3));
System.out.println(str.indexOf('h'));
System.out.println(str.lastIndexOf('w'));
System.out.println(str.lastIndexOf('a',2));
System.out.println(str.equals("Shvam"));
System.out.println(str.equalsIgnoreCase("Shvam"));


}



}