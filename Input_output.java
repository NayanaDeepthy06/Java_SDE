

import java.util.*;
public class Input_output {
    public static void main(String[] args) {
       // taking different types of input in java 
    
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // double num2 = sc.nextDouble();
        // String name = sc.nextLine(); // this reads entire line including spaces 

        // System.out.println(num2); // this is for double
        // System.out.println(num);// this is for int
        // System.out.println(name);// this is for taking String as output

        // next() reads only one word or token -->> next stops at space 
        // String fn = sc.next();
        // String ln = sc.next();
        // System.out.println(fn +" "+ln);
        // sc.close();

        // TYpe casting 
        // Implicit type casting 
        // int x = 10;
        // double y = x;  
        // System.out.println(y);

        // when there is a case of data loss we need to use Explicit typecasting 
        // explicit types casting means we are doing it Explicitly 
        
        // double a = 15.46563;
        // int b = (int) a;
        // System.out.println(b);//--->> concerting big data to small data 

        // final keyword -->> once fianl variable is declared we cannot reassingn the value of the variable 
        // that gives the error in the code by the compiler 
        // final int c = 89;
        // System.out.println(c);
       // arrays in java 
    //    int[] arr = new int[4];
    //    arr[0] = 2;
    //    arr[1] = 4;
    //    arr[2] = 7;
    //    arr[3] = 10;
    //    System.out.println(arr.length);
    //    int[] arr1 = {12,4,45,60};
     // 2d Array at every index we are storing array of integers 
    //  int[][] arr3 = {{2,7},{1,9,5},{4}};
    //  // print an element in the array 
    //  System.out.println(arr3[1][2]);
     
    //  // how to print this array 
    //  for(int i =0;i<arr3.length;i++){
    //     for(int j=0;j<arr3[i].length;j++){
    //         System.out.println(arr3[i][j]);
    //     }
    //  }
     // if else in java 
     Scanner sc = new Scanner(System.in);
    //  int age = sc.nextInt();

    //    if(age >= 18){
    //     System.out.println("Adult");
    //  }else{
    //     System.out.println("teen");
    //  }
     // else if block 
    //  int marks = sc.nextInt();
    //  if(marks>=90){
    //     System.out.println("Grade A");
    //  }else if(marks>=70 && marks<90){
    //     System.out.println("Grade B");
    //  }else if(marks>=50 && marks<70){
    //     System.out.println("Grade C");
    //  }else{
    //     System.out.println("Grade D");
    //  }

    // -->> find greatest among three using nested if else 
    

        // int a = 10, b = 20, c = 10;

        // if(a == b && b == c) {
        //     System.out.println("All numbers are equal");
        // }
        // else {
        //     if(a >= b) {

        //         if(a >= c) {
        //             System.out.println(a + " is greatest");
        //         }
        //         else {
        //             System.out.println(c + " is greatest");
        //         }

        //     }
        //     else {

        //         if(b >= c) {
        //             System.out.println(b + " is greatest");
        //         }
        //         else {
        //             System.out.println(c + " is greatest");
        //         }

        //     }
        // }

        /// switch case in java
    //->> at saturday and sunday wakeup 6am on monday 8am and on rest of days 7am
        // String day = "Monday";
        // switch(day){
        //     case"Saturday","Sunday" : 
        //     System.out.println("6am");
        //     break;
        //     case"Monday":
        //     System.out.println("8am");
        //     break;
        //     default:
        //     System.out.println("7am");
        // when u keep break there will be no more fall through 

        // }
        // -->> now lets see newest version of implementing the switch case statement 
        // here dont need to use break and u ca use arrown
        // switch(day){
        //     case"Sunday","Saturday" -> System.out.println("8am");
        //     case"Monday"-> System.out.println("6am");
        //     default->System.out.println("7am");
        // }

        // -->> in the newest version switch case can return the value and can be also used as a Expression
        String day = "Wed";
        String result = switch(day){
            case"Sunday","Saturday" -> "8am";
            case"Monday"-> "6am"; // break keyword no need to use ->> arrow takes care of the break automatically 
            default->"7am"; // no need to use return keyword it will return automatically 

        };
        System.out.println(result);
        // u can even use the yeild keyword if u want to use colon instead of arrow 
        // here no need to use return or break keyword
    }
}
    
