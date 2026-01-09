class A{

    public void run(){
        System.out.println("currently running");
    }

}

class B extends A{
    public void run(){
        System.out.println("currently running under B ");
    }

}

public class methodOverriding {
    public static void main(String[] args) {
        A obj = new B(); 
        obj.run(); 
        
    }
    
}
