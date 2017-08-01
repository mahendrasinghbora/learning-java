class test13 {
    public static void main(String[] args) {
        /*To create a conversion between two incompatible types, one must use a cast.
        * A cast is simply an explicit type conversion.
        * It has this general form:
        * (target-type) value*/
        byte b;
        int i = 257;
        double d = 342.157;
        System.out.println("CONVERSION OF \'int\' TO \'byte\'");
        b = (byte) i;            //Explicit type conversion [narrowing conversion] from 'int' to 'byte'.
        System.out.println("\t\tVALUE OF \'int\' VARIABLE \'i\': " + i);
        System.out.println("\t\tVALUE OF \'byte\' VARIABLE \'b\': " + b + " (257 % 256 = 1 [256 IS THE RANGE OF \'byte\'])");
        System.out.println("CONVERSION OF \'double\' TO \'byte\'");
        b = (byte) d;           //Explicit type conversion [truncation] from 'double' to 'byte'.
        System.out.println("\t\tVALUE OF \'double\' VARIABLE \'d\': " + d);
        System.out.println("\t\tVALUE OF \'byte\' VARIABLE \'b\': " + b + " (342 % 256 = 86)");
        System.out.println("CONVERSION OF \'double\' TO \'int\'");
        i = (int) d;            //Explicit type conversion from 'double' to 'int'.
        System.out.println("\t\tVALUE OF \'double\' VARIABLE \'d\': " + d);
        System.out.println("\t\tVALUE OF \'int\' VARIABLE \'i\': " + i + " (0.157 HAS BEEN TRUNCATED)");
    }
}
