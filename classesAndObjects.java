class Add{

    
    public void show( int n1 , int n2){
        System.out.println("under show!");
        System.out.println(n1+n2);
    }

    //having a return type as string 
    public String printName( String name ){
        if( name.length() > 5){
            return "Hello , Mr"+name; 
        }
        else{
            return "names needs to be a little longer"; 
        }

    }
}


public class classesAndObjects {
    public static void main(String[] args) {
        int num1 = 122; 
        int num2 = 1222; 

        Add obj = new Add(); 
        obj.show(num1 , num2); 
        String result = obj.printName("Ayush");
        System.out.println(result);
        
    }
}
