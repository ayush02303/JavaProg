public class Loops {
    public static void main(String[] args) {
        // loops are primarily used to iterate over some data or values untile a certain terminatiing condition is met 

        //while loop 
        int i = 12; 
        while( i > 0 ){
            System.out.println("printing ith value " + i);
            i--; 
        } 

        //do while loop 
        int j = 10 ;
        do{
            System.out.println("I'm getting printed ");
            j--; 
        }while( j>0 );

        //for loop 

        for( int  k = 1  ; k <= 10 ; k++){
            System.out.println(k);
        }
    }
}
