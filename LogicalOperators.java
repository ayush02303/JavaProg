public class LogicalOperators {
    public static void main(String[] args) {
        int a = 12 ; 
        int b = 122 ; 
        float c = 12.233f ; 


        // logical AND(&&) operator , will result in a true if both conditions are true , false otherwise
        boolean result = a>b && b>c ; 
        System.out.println(result);

        // logical OR || operator , will result in a true if either of a condition is met 
        boolean result2  = a>b || b > c; 
        System.err.println(result2);

        //logical NOT ! operatpr 
        System.err.println( a!= b);

    }
}
