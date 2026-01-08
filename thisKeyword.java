class Sample{

    //The keyword this in Java is a reference to the current object — the object whose method or constructor is being executed.

    int age ; 
    String name ; 
    boolean isValid; 

    Sample( int age , String name , boolean isValid){
        this.age = age ; 
        this.name = name ; 
        this.isValid = isValid; 



    }

   public void run() {
    System.out.println(
        "Current user values are: " +
        "Name = " + name + ", " +
        "Age = " + age + ", " +
        "Valid = " + isValid
    );
}


}
public class thisKeyword {

    public static void main(String[] args) {
        Sample s = new Sample(12 , "ayush" , true ); 
        s.run(); 
        
    }
    
}
