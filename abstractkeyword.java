abstract class A{

    public abstract void printMe(); 
}
class B extends A{

    public void printMe(){
        System.out.println("under abstract methiod");
    }

}

public class abstractkeyword {
    public static void main(String[] args) {
        A obj = new B(); 
        obj.printMe();
        
    }
    
}
