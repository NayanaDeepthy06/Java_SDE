

class Employee
{
    int id;
    String name;
    double salary;

    // parameterized constructor 
    public Employee(int id,String name,double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /*
       Constructor overloading occurs when a class has more than one constructor, but each constructor has a different parameter list or different parameter types. It allows an object to be initialized in different ways depending on the parameters provided at the time of object creation
    */

     Employee(){ // this is a default constructor when no parameters are given 
        this.id = 0;
        this.name = "";
        this.salary = 0;
     }  
     // constructor when only one parameter is given 
     Employee(String name ){
        this.name = name;
        this.id = 0;
        this.salary =0;

     }
     // constructor when two parameters are given 
     Employee(int id,double salary){
        this.name = "";
        this.id = id;
        this.salary = salary;
     }

     // copy constructor ->> that takes an object of the same class as a parameter and copies its attributes.
     Employee(Employee obj3){
      this.id = obj3.id;
      this.name = obj3.name;
      this.salary = obj3.salary;

     }
 

}
class constructor{
    public static void main(String[] args) {
        

        Employee obj1 = new Employee();   // Default constructor called
        System.out.println("Employee id :"+ obj1.id);
        System.out.println("Employee name :"+ obj1.name);
        Employee obj2 = new Employee(" EMpolyee 1"); // when only one parameter is given 
        System.out.println("employee name is : "+obj2.name);
        System.out.println("employee id and salary are :"+obj2.id+obj2.salary);
        Employee obj = new Employee(45,"nayanadeepthyr",1000000);
        Employee objcopy = new Employee(obj);// using copy constructor 
        System.out.println(objcopy.name);

        

}
}

// this points out to the current instance thats being used or this in java is the reference to the  current instance of the class 
