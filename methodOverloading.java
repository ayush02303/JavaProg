class functionOverloading{


    // Method overloading means having multiple methods with the same name in the same class, but they do different things based on the input you give them.
    public int sum( int val1 , int val2 , int val3){
        return val1+val2+val3; 

    }

    public int sum( int val1 , int val2){
        return val1+ val2; 

    }

}
public class methodOverloading {
    
    public static void main(String[] args) {
        functionOverloading obj = new functionOverloading(); 
        int result1 = obj.sum(12, 23); 
        int result2 = obj.sum(12, 2,12); 

        System.out.println(result1);
        System.out.println(result2);

        

        StringBuilder sb1 = new StringBuilder("ayush"); 
        System.out.println(sb1);



        
    }
    
}
