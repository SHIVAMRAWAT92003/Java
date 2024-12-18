// Wrapper classes in Java
// The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.

// Boxing = Taking primitive value and storing in primitive object.
// Unboxing = Getting a value from primitive object type to primitve type.

// autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically.The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.
// Use of Wrapper classes in Java
// Java is an object-oriented programming language, so we need to deal with objects many times like in Collections, Serialization, Synchronization, etc. Let us see the different scenarios, where we need to use the wrapper classes.

// Change the value in Method: Java supports only call by value. So, if we pass a primitive value, it will not change the original value. But, if we convert the primitive value in an object, it will change the original value.
// Serialization: We need to convert the objects into streams to perform the serialization. If we have a primitive value, we can convert it in objects through the wrapper classes.
// Synchronization: Java synchronization works with objects in Multithreading.
// java.util package: The java.util package provides the utility classes to deal with objects.
// Collection Framework: Java collection framework works with objects only. All classes of the collection framework (ArrayList, LinkedList, Vector, HashSet, LinkedHashSet, TreeSet, PriorityQueue, ArrayDeque, etc.) deal with objects only.

// Primitive Type       Wrapper class
// boolean              Boolean
// char                 Character
// byte                 Byte
// short                Short
// int                  Integer
// long                 Long
// float                Float
// double               Double
class Pro48{
    public static void main(String args[]){
        int n1=10;
        int n2=20;

        Integer num1 = new  Integer(n1); //Boxing ==> this way is Depricated thatswhy showing warning
        int number1 = num1.intValue(); //Unboxing ==>

        Integer num2 = n2; //Auto-Boxing
        int number2 = num2;//Auto-UnBoxing

        System.out.println(number1);
        System.out.println(number2);

        String str ="122";
        int number3 = Integer.parseInt(str);
        System.out.println(number3);







    }
}