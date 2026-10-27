class A{

    public A(){
        System.out.println("object created ");
    }
        public void show(){
            System.out.println("in A show method");
        }
    }

public class Anonymus_obj {
    public static void main(String ... args){
        // A obj = new A(); // here obj is reference variable its not the actual object ->> beacuse its refering to an object 

        // obj.show();

            // the question is if we have to create an object the only way is the above method
            // the other way of creating the object is 1) reference creation 2) creeating the object and assigning the value 
            // A obj;
            // obj = new A();
            // obj.show();

            // direct object creation is 
            // new A(); // this type of objects are callled anonymous objects
            new A().show(); 


        }
    }


