public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 0 ; 
        int j = 12 ; 

        // we use try and catch block to catch an error , if any 

        try{

            int result = j/a; 


        }catch( Exception e){
            System.err.println("caught error");
        }

        System.err.println("ran successfully!");
    }
    
}
