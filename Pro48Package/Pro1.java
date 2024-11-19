class shape{
    public void area(int r){
        System.out.println("Area of circle ");
    }
    public void area(int l ,int b){
        System.out.println("Area of Square");
    }
    public void area(int h ,int b ){
        System.out.println("Area of Triangle");
    }
    public void area(double r){
        System.out.println("Area of circle in double ");
    }
    public void area(double l ,double b){
        System.out.println("Area of Square in double");
    }
    public void area(double h ,double b ){
        System.out.println("Area of Triangle in double");
    }
}

class Pro1{
    public static void main(String args[]){
         Shape myShape = new Shape();  
    
    
    myShape.area(5);
    myShape.area(6.0,1.2);
    myShape.area(6,2);
    }
}