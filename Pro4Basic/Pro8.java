// Type Conversion and casting
class Pro8{
    public static void main (String args[]){

byte a = 10;
int  b = 30;
byte c = 30;

// Implicit
b = a;
System.out.println(b);

// Explicit
a = (byte)b;
System.out.println(a);


// Promotion
int result = a* c;
System.out.println(result);








    }
}