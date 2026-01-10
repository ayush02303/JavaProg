
abstract class A{

    public abstract void show(); 
 
}

public class abstractanonynousclass {
    public static void main(String[] args) {

        A obj = new A(){
            public void show(){
                System.out.println("hello there");
            }
        };
        obj.show();
        
    }
}
