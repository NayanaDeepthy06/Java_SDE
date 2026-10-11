
class Basics{
    public static void main(String[] args){
        System.out.println("java preparartion ");
        // single line comments 
        /*multiline comments in java 
        ican write anything inside this  */
        // DAta types 
        // byte b = 11;       //-128 to 127 it occupies 8 bits of memory 
        // short s = 256;    //-32768 to 32767 and it occupies 16 bits of memory 
        // int a = 1000;   //-2^31 to 2^31-1 and it occupies 32 bits of memory 
        // long num =42959859;   // -2^63 to 2^63-1 and it occupies 64 bits of memory
        // float n = 14.25f;   //float: 4 bytes, decimals (needs 'f' suffix, e.g., 3.14f) 32 bits of memory 
        // double value = 4.569849859;    // 64 bits of memory double: 8 bytes, decimals (Most common for fractions)
        // char ch = 'A';    // char must be stored inside the single quotes  and it occupies 16 bits of memory 
        // boolean javaexpert = true;    //boolean: 1 bit, true or false

        // operators in java 
        // =,-,*,/,%,
        // int num1 = 10;
        // int num2 = 20;
        // int sum = num1 + num2;
        // System.out.println(sum);
        /*integer always give u the integer value as output eventhough u have done divison since the data types
        if int if u need decimal keep data type as float or double */


        // Unary operators that operate on a single operand 
        // ++,--,!(Increment),(Decrement),(Logical NOT)
        int a = -3;
        int b = +a;
        int c = -a;
        // System.out.println("b:"+b+" c:"+c+" d:"+a); // or use this System.out.printf("b: %d c: %d d: %d", b, c, a);
        // boolean v1 = true;
        // boolean v2 = !v1;
        // boolean v3 = !!v1;
        // System.out.println(v3);
        // ++num is pre increment and num++ is post increment 
        // post increment ante first use the number then increment
        // pre increment ante first increment the number and then use 
        // int num1 = 5;
        // int num2 = num1++;
        // System.out.println("num1 :"+num1);
        // System.out.println("num2 :"+num2);
        // int num3 = 6;
        // int num4 =++num3;
        // System.out.println("num3 is"+num3);
        // System.out.println("num4 is"+num4);  // next we have --num and num-- pre decrement and post decrement operators 
        // boolean result = num1==num2;
        // System.out.println(result); 
        // Ternary operators -->> condition ? first : second
        // int num5 = num2 > num1 ? num2 : num1;
        // System.out.println(num5);
        // Strings in Java 
        String name = "R Nayana Deepthy";
        // System.out.println(name.length());  // string indexing starts from 0 
        // System.out.println(name.charAt(2));
        // System.out.println(name.substring(0));
        // System.out.println(name.substring(0,8));
        // string concatenation 
        String fn = "R N";
        String ln = "D";
        // String fullName = fn + " "+ln;
        // System.out.println(fullName); // or we can do like this also there is no issues 
        fn += " "+ ln; // here we are updating the string so string object memoery loaction changes 
        // System.out.println(fn);
        //-->> to check equality of strings 
        // System.out.println(fn.equals("R N D")); // or sout(fn=="R N D");
         
        // // loops in the array 
        // Scanner sc  = new Scanner(System.in);
        // int size = sc.nextInt();
        // int [] arr = new int[size];
        // System.out.println("enter the elements in the array ");
        // for(int i =0;i<size;i++){
        //     arr[i] = sc.nextInt();
        // }
        // int sum = 0;
        // // for each loop 
        // for(int num : arr){
        //     sum+=num;
        // }
        // System.out.println("the sum of the elememts in the array is :"+sum);
        // sc.close();
        // while loop. 
        // int j = 2;
        // while(j<=50){ // condition 
        //     System.out.println(j);
        //     j = j + 2; // increment 

        // } 
        // do while loop 
        // write a loop that takes the integer till it gets 10 and prints all of them 
        // Scanner sc = new Scanner(System.in);
        // int num = 0;
        // do { 
        //     num = sc.nextInt();
        //     System.out.println(num);
        // } while (num!=10); // irrespective of while loop do will execute atleast once 
       // if condition is false while loop doesnt execute 
       // if u want to execute the while loop irrespective of the condition whetehr its true or flase atleast once then use do while loop 
       /* Exception handling  try block is the place where there an exception ca happen  */
       /* Catch block is the place where excpetion is catched and showed what ecxpetion is it actually  */
       /* finally block will excute at the last no mather what exception occuured or not it allways executes  */
       try {
           int num1 = 15;
           int num2 = 0;
           int  num =  num1/num2;
       } catch (Exception e) {
        System.out.println("Exception occured is :"+e);
       }
       finally{
        System.out.println("this block will always execute ");
       }
        

    }

}