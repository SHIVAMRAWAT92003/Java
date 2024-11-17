class Calc{
    int a;
     public int add(int n1,int n2){
       int result = n1+n2;
       return result; 
     }
}


class Demo{
    public static void main(String args[]){
        int num1=4;
        int num2=2;
// object created
Calc c1= new Calc();
int res = c1.add(num1,num2);

System.out.println(res);
    }
}


// to run 
// javac file_name (Pro22.java)
// java class_name (Demo)