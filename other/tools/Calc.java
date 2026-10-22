package other.tools;


public class Calc  {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}


/*
import other.tools.*; and
import other.* -->> these both are dfferent 
.* means all the files of that paticular folder 

import other.tools.* this is sepcifically used to import att the files conatining in the tools folder too  if we dont use this kind of import the contents 
insdie or the files inside the tools folder will not be imported
How to create unique package name for our project means 
just by reversing the domain name of your project and then adding the project name to it
 example : if the domain name is www.google.com and the project name is calculator then the package name will be com.google.calculator

 */