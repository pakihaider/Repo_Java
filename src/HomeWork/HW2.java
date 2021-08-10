package HomeWork;

public class HW2 {
    public static void main(String[] args) {

        /**
         * convert deg-Cel into Fahrenheit
         *
         * ft = cT+32
         */

        double cTemp = 100.0;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println(cTemp + "°C = " +fTemp + "°f");

        /**
         *
         * C -> F
         * C -> K
         *
         * F -> C
         * F -> K
         *
         * K -> C
         * K -> F
         *
         *
         *
         * C -> F
         * C -> K
         *
         * convert deg-Cel into Fahrenheit
         * ft = cT+32
         */
        double cTemp1 = 100;
        double fTemp1 = cTemp1 * 9/5 + 32;
        System.out.println(cTemp + "°C = " +fTemp1 + "°f");
        /**
         * convert deg-Cel into Kelvin
         * T(k) = T(C) + 273.15
         */
        double cTemp2 = 100;
        double tKelvin = cTemp2 + 273.15;
        System.out.println(cTemp2 + "°C" + 273.15);

        /**
         * F -> C
         * convert deg-Fahrenheit into Celcius
         * F -> K
         */

      double fTemp2 = 100;
      double cTemperature = ( fTemp2 - 32 ) * 5/9;


      // Convert deg-Fahrenheit into K
      // T(K) = (T(°F) + 459.67)× 5/9

      double FTemp = 100;
      String kTemp =  (FTemp + "°F" + 459.67);
        System.out.println();

      // Convert Kelvin to Deg- Celcius



       // Convert Kelvin to Deg- Farhenhite
      // T(°F) = T(K) × 9/5 - 459.67


    }



}
