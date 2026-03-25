class appartment{
     int bedroom;
     int washroom;
     int hall;
     int dining;
     int playground;
     int kitchen;

    appartment(int bedroom, int washroom, int hall, int dining, int playground, int kitchen){
             this.bedroom=bedroom;
             this.washroom=washroom;
             this.hall=hall;
             this.dining=dining;
             this.playground=playground;
             this.kitchen=kitchen;
    }
}


public class appartment_task {
    public static void main(String[] args) {
        appartment ap1 = new appartment(1,1,1,1,1,1);
        appartment ap2 = new appartment(2,1,1,1,1,1);
        appartment ap3 = new appartment(4,4,2,1,1,1);

        System.out.println("Appartment - 1 :  There is "+ap1.hall+" Hall and "+ap1.bedroom+" Bedroom without attached washroom and "+ap1.kitchen+" Kitchen with "+ap1.dining+" dining hall and "+ap1.playground+" public playground " );
        System.out.println("Appartment - 2 :  There is "+ap2.hall+" Hall with attached dining hall and "+ap2.bedroom+" Bedroom with attached washroom and "+ap2.kitchen+" Kitchen with "+ap2.dining+" dining hall and "+ap2.playground+" public playground " );
        System.out.println("Appartment - 3 :  There is "+ap3.hall+" Hall and "+ap3.bedroom+" Bedroom with each 2 bedroom one hall , attached washroom for each bedroom and "+ap3.kitchen+" Kitchen with "+ap3.dining+" dining hall and "+ap3.playground+" public playground " );
    }
   
}