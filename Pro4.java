// Input Types
// In the example above, we used the nextLine() method, which is used to read Strings. To read other types, look at the table below:

// Method	Description
// nextBoolean()	Reads a boolean value from the user
// nextByte()	Reads a byte value from the user
// nextDouble()	Reads a double value from the user
// nextFloat()	Reads a float value from the user
// nextInt()	Reads a int value from the user
// nextLine()	Reads a String value from the user
// nextLong()	Reads a long value from the user
// nextShort()	Reads a short value from the user



import java.util.Scanner;

class Pro4{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = sc.nextInt();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        boolean bo = sc.nextBoolean();
        byte by = sc.nextByte();
        char c = sc.next().charAt(0);
    }
}

