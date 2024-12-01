public class StringExample {
    
    public static void main(String[] args) {
        
        String message = myGreet("Prabhjot Singh");
        System.out.print(message);
        
    }

    static String myGreet(String name) {
        return "hello " + name;
    }
}
