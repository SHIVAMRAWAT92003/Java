
enum Days{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
}

class Pro62 {
    public static void main(String Args[]){

        Days st =     Days.Thursday;

        if(st==Days.Monday){
            System.out.println("Monday");
        }
        else if(st==Days.Tuesday){
            System.out.println("Tuesday");
        }
        else if(st==Days.Wednesday){
            System.out.println("Wednesday");
        }
        else if(st==Days.Thursday){
            System.out.println("Thursday");
        }
        else if(st==Days.Friday){
            System.out.println("Friday");
        }
        else if(st==Days.Saturday){
            System.out.println("Saturday");
        }
        else {
            System.out.println("Sunday");
        }
       

    }
}
