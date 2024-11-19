// Package in Java is a mechanism to encapsulate a group of classes, sub packages and interfaces. 

// some in built package 
// java.lang: Contains language support classes(e.g classes which defines primitive data types, math operations). This package is automatically imported.
//  java.io: Contains classes for supporting input / output operations.
//  java.util: Contains utility classes which implement data structures like Linked List, Dictionary and support ; for Date / Time operations.
//  java.applet: Contains classes for creating Applets.
//  java.awt: Contain classes for implementing the components for graphical user interfaces (like button , ;menus etc). 6)
//  java.net: Contain classes for supporting networking operations.

// Important points:

// Every class is part of some package.
// If no package is specified, the classes in the file goes into a special unnamed package (the same unnamed package for all files).
// All classes/interfaces in a file are part of the same package. Multiple files can specify the same package name.
// If package name is specified, the file must be in a subdirectory called name (i.e., the directory name must match the package name).
// We can access public classes in another (named) package using: package-name.class-name

// import Pro46Package.AdvCalc;
// import Pro46Package.Calc;
// import Pro46Package.*;


class Pro46{
    public static void main(String args[]){

        AdvCalc c = new AdvCalc();
        System.out.println(c.div(34,2));

    }
}