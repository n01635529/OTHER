public class GalToLitTable {
    public static void main(String[] args) {
        double litre = 3.78541;
        for(int galon = 1; galon <=100; galon++) {
            System.out.println("Ammount of galons: " + galon + "Ammount of litres: " + galon * litre);
                if (galon % 10 == 0)
                System.out.println();
            }
        }
    }