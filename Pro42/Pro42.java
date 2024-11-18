// Inheritance :

class Pro42{
    public static void main(String args[]){
        VeryAdvCalc c1 = new VeryAdvCalc();
        int v1 = c1.add(10,5);
        int v2 = c1.sub(10,5);
        int v3 = c1.mul(10,5);
        int v4 = c1.div(10,5);
        int v5 = c1.mod(10,5);
        double v6 = c1.power(10,5);


        System.out.println(v1+" "+v2+" "+v3+" "+v4+" "+v5+" "+v6+" ");
    }
}