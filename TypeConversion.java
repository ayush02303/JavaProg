

public class TypeConversion {
    public static void main(String[] args) {

        // explicit type conversion 
        int val = 12 ;
        float updatedVal = (float)val; 
        System.err.println(updatedVal);

        //implicit type conversion 
        int val2 = 12 ; 
        byte val3 = 2;
        val2 = val3; 
        System.err.println(val3);
    }
    
}
