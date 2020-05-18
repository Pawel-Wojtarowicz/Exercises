public class HexDecBin {

        public static void main(String[] args) {


            //hex to float
            System.out.println("--------------------------");
            String hex1 = "42F64000";
            Long asLong = Long.parseLong(hex1, 16);
            Float f = Float.intBitsToFloat(asLong.intValue());
            System.out.println("[hex " + hex1.toString() + "] to float: " + f);
            System.out.println("--------------------------");

            //hex to dec
            String hex2 = "3d8";
            String hex3 = "3F800000";
            int decimal = Integer.parseInt(hex2, 16);
            int decimal2 = Integer.parseInt(hex3, 16);
            String bin = Integer.toBinaryString(decimal);
            System.out.println("[hex " + hex2.toString() + "] to decimal: " + decimal);
            System.out.print("[hex " + hex3.toString() + "] to decimal: " + decimal2);
            System.out.println();
            System.out.println("[dec " + decimal + "] to bin: " + bin);
            System.out.println("--------------------------");

            //dec to hex
            int decimal3 = 3194;
            System.out.println("[dec " + decimal3 + "] to hex: " + Integer.toHexString(decimal3));

            //float to bin
            Float f2 =  123.125f;
            long l = Float.floatToIntBits(f2);
            System.out.println("[Float " + f2 + "] to bin: " + Long.toBinaryString(l));
            int i2 = Float.floatToIntBits(f2);
            System.out.print("[Float " + f2 + "] to hex: ");
            System.out.printf("%X%n", i2);  // "%X%n" --> https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
            System.out.println("--------------------------");
        }

    }

