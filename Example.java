public class Example {
    static int counter = 0;
    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            System.out.println(increment());
        }
           
    }

    public static String increment() {
        String initialString = "C000";
        counter++;
        String convertCounterToString = String.valueOf(counter);

        String idCon = initialString + convertCounterToString;

         if (idCon.length() == 6) {
            String initialString1 = "C00";
            return  initialString1 + convertCounterToString;

         } else if (idCon.length() == 7) {
            String initialString2 = "C0";
            return  initialString2 + convertCounterToString;

         } else if (idCon.length() == 8) {
            String initialString3 = "C";
            return  initialString3 + convertCounterToString;

         } else {
            return idCon;
         }
    }
}
