class Comp{

    public void sing(){
        System.out.println("Im singing");
    }

    public void dance(){
        System.out.println("Im dancing");
    }

    public String food(int cost){

        if(cost>500){
        return "Resturant";
        }
        else if(cost>100 && cost <=500){
        return "cafe";
        }
        else{
        return "Kurkare";
        }

    }
    


}

class Pro24{

    public static void main(String args[]){

        Comp c1 = new Comp();
        c1.sing();
        c1.dance();
        String str =c1.food(300);
        System.out.println(str);
    }

}