public class Sound {
    
    public static void main(String[] args){
        int feetPerSecond = 1100;
        double timeInterval = 7.2;
        System.out.println("The lightning strike is: " + feetPerSecond * timeInterval + " feet away");
        echo();
    }

    public static void echo() {
        double timeInterval = 7.2;
        double distance = 1100;
        System.out.println(distance * timeInterval / 2 );
    }
}
