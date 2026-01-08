class Sample {
    static String name; // a variable declared static will be shared by all the objects of the class
                        // hence created
    int age;
    boolean isValid;

    public void show() {
        System.out.println("Hello " + name + "aged " + age + "current status " + isValid);
    }

    // static method
    public static void showStatic(Sample obj) {
        System.out.println("we can call static variables under a static method but not class variables " + name
                + obj.age + obj.isValid);

    }
}

public class staticKeyword {
    public static void main(String[] args) {

        Sample obj = new Sample();
        Sample.name = "ayush"; // static variables are meant to be accessed or updated using class name only
        obj.isValid = true;
        obj.age = 12;

        obj.show();

        Sample obj2 = new Sample();
        obj2.isValid = false;
        obj2.age = 122;
        obj2.show();

        Sample.showStatic(obj2);

    }

}
