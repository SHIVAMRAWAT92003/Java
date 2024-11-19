package Pro46Package;

public class AdvCalc extends Calc{

    public int div(int a ,int b){
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a/b;
    }
     public int mul(int a ,int b){
        return a*b;
    }
     public int mod(int a ,int b){
        return a%b;
    }

}