interface A{
    // all the method declared under interfaces are by default abstract

    int a  =12; // all the variables declared inside interface are final and static
    void show(); 
    void run(); 

}

class B implements A{
    public void show(){
        System.out.println("hello");

    }
    public void run(){
        System.out.println("there");

    }

}

public class interfaces {
    public static void main(String[] args) {
      A obj = new B(); 
      obj.run(); 
      obj.show(); 
    }
    
}
