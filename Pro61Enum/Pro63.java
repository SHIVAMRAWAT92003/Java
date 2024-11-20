enum Laptop{
    Macbook(6000),Asus(5000),HP(4000),Lenovo(3000),Dell(2000);


    private int price;
    private Laptop(){
        price=500;

    }
    private Laptop(int price){
        this.price=price;

    }

    public int getPrice(){
        return price;
    }
    
    public void setPrice(int price){
       this.price= price;
    }



}



public class Pro63 {

    public static void main(String args[]){

        // lap name and price
        Laptop lap = Laptop.Macbook;
        System.out.println(lap+" "+lap.getPrice());

    //    for loop
        
    Laptop [] lapArr = Laptop.values();
    for(Laptop l : lapArr){
        System.out.println(l+" "+l.getPrice());
    }


    }
    
}
