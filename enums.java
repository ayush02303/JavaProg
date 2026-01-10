enum Status{
    Running, Failed , Pending ,Working; 

}

public class enums {
    public static void main(String[] args) {
        Status s = Status.Running; 
        System.out.println(s);

        // using enums with traditional if else loops 
        if( s == Status.Running) System.out.println("under running");
        else if( s == Status.Failed) System.out.println("currently Failed");
        else System.out.println("something went wrong");
        
    }
    
}
