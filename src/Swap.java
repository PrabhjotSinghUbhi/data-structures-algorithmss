public class Swap {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
//        swap(a, b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }

//    static void swap(int x , int y){
//        int temp = x ;
//        x = y;
//        y = temp;
//    }
}
