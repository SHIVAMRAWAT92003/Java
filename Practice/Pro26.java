// Method Overloading



class A{
    
    int sum(int a ,int b){
        return a+b;
    }
    
    int sum(int a ,int b,int c){
        return a+b+c;
    }

    double sum(double a ,int b){
        return a+b;
    }

    double sum(int a ,double b){
        return a+b;
    }

    double sum(double a ,double b){
        return a+b;
    }
    double sum(double a,double b,double c){
        return a+b+c;
    }

}


public class Pro26 {

    public static void main(String[] args) {
        A a = new A();
        System.out.println( a.sum(2.7,3.2));
    }
    
}
