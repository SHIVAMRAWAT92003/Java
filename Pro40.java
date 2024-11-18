// Constructor

class Emp{
    private int id ;
    private String name;

// Default Constructor
    Emp(){
        id=0;
        name="xyz";
    }

// Parameterized Constructor 
    Emp(int id ,String name){
      this.id=id;
      this.name=name;
    }

    public String getName(){
   return name;
   }
  
   public int getId(){
   return id;
   }

}

class Pro40{
    public static void main(String args[]){
        Emp e1 = new Emp();
        Emp e2 = new Emp(1,"Shivam");
        Emp e3 = new Emp(2,"Rawat");
        System.out.println(e1.getId()+" : "+e1.getName());
        System.out.println(e2.getId()+" : "+e2.getName());
        System.out.println(e3.getId()+" : "+e3.getName());
    }
}