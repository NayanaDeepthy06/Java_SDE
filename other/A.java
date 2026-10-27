package other;

class C{
    public void display(){
        A obj = new A();
        System.out.println(obj.marks);
    }
    public static void main(String[] args) {
        C obj2 = new C();
        obj2.display();
    }
}

public class A {
    // public  int marks = 100;
    protected int marks = 900;
    public void show(){
        System.out.println("this is show method");
    }
  
}

