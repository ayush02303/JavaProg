interface A{
    void run();
    void config(); 
}




public class functionalInterface {
    public static void main(String[] args) {

        A obj = new A(){
            public void run(){
                System.out.println("currently running ");
            }

            public void config(){
                System.out.println("under the config file ");
            }

        }; 
        
    }
}
