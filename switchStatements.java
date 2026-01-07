public class switchStatements {

    static class Demo {
        public void switchStatements(String val) {
            switch (val) {
                case "Ayush":
                    System.out.println("Name matched");
                    break;

                default:
                    System.out.println("No match");
            }
        }
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.switchStatements("Ayush");
    }
}
