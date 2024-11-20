enum Status{
    Running, Loading, Error, Failed, Sucess;
}


public class Pro61 {
    
    public static void main(String[] args) {
        
        Status stu1 = Status.Running;
        System.out.println(stu1);
        System.out.println(stu1.ordinal()); //  ordinal will print the status value index
        Status stu2 = Status.Failed;
        System.out.println(stu2);
        System.out.println(stu2.ordinal());


        //treat as array;
        Status[] ss = Status.values();
        System.out.println(ss[4]);

        for(Status s: ss){
             System.out.println(s);
        }

        
    }
}
