public class javaPractice {
    public static String _nullTest;
    public static void main(String[] args) {

        String apple = "red";
        String pineapple ="red";
        int a = 5;
        double b = 1.0;

        System.out.println("hello world");
        System.out.println("Apple: " + apple);
        System.out.println(a/b);
        System.out.println(apple == pineapple);

        if(a>b) {
            System.out.println("A is more than B");
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println(_nullTest);
        
    }
}
