// import other.tools.AdvCalc;
// import other.tools.Calc;

// /// if i want to use the create the Calc class object and what to access its methids here then i need to import that classs beacuse 
// /// now that classs exists in a different folder that is package 
// /// same for AdvCalc too 
// // which ever class u use in java belongs to a package 
// // import java.lang.*; -->>> this package is imported by default in every java program
// // if u want to import all the files of that particular folder use --> example : import tools.*;

// public class Demo {
// public static void main(String[] args) {
//     Calc obj = new Calc();
//     AdvCalc obj2 = new AdvCalc();

// }
    
// }

// now im using this file to learn about acces specifier here 
import other.*;
public class Demo{

    public static void main(String[] args){
        A obj = new A();
        System.out.println(obj.marks);
        B obj1 = new B();
        System.out.println(obj1.marks);
    }

}
// if u want to acces anything outside the class always make it public -->> public can be accesed from anywhere  
