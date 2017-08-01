class test12 {
    public static void main(String[] args) {
        System.out.println("AUTOMATIC TYPE CONVERSION OF INTEGER LITERALS TO VARIOUS DATA TYPES");
        byte b = 123;           //Automatic type conversion from 'integer literal' to 'byte'.
        short s = 10000;          //Automatic type conversion from 'integer literal' to 'short'.
        long l = 2000000;         //Automatic type conversion from 'integer literal' to 'long'.
        char c = 48;          //Automatic type conversion from 'integer literal' to 'char'.
        System.out.println("\t\tVALUE OF \'byte\' VARIABLE \'b\': " + b);
        System.out.println("\t\tVALUE OF \'short\' VARIABLE \'s\': " + s);
        System.out.println("\t\tVALUE OF \'long\' VARIABLE \'l\': " + l);
        System.out.println("\t\tVALUE OF \'char\' VARIABLE \'c\': " + c);
        /*Automatic type conversion will take place if the following two conditions are met:
        * The two types are compatible.
        * The destination type is larger than the source type.*/
        //int i = b;
        /*No explicit cast statement is required since the 'int' type is always large enough to hold all valid 'byte' values.
        * Here automatic type conversion takes place.
        * This is sometimes also called a widening conversion.*/
        System.out.println("AUTOMATIC TYPE CONVERSION OF \'char\' DATA TYPE OR CHARACTER LITERALS TO VARIOUS NUMERIC TYPES");
        int int_var = 'A';            //Automatic type conversion of 'character literal' to 'int'.
        System.out.println("\t\tVALUE OF \'int\' VARIABLE \'int_var\': " + int_var);
        b = 'c';          //Automatic type conversion from 'character literal' to 'byte'.
        System.out.println("\t\tVALUE OF \'byte\' VARIABLE \'b\': " + b);
        double d = c;         //Automatic type conversion from 'char' to 'double'.
        System.out.println("\t\tVALUE OF \'double\' VARIABLE \'d\': " + d);
        /*There are no automatic conversions from the numeric types to char or boolean.
        * Also, char and boolean are not compatible with each other.*/
        System.out.println("AUTOMATIC TYPE CONVERSION OF INTEGER DATA TYPES TO FLOATING-POINT TYPES");
        float f = l;          //Automatic type conversion from 'long' to 'float'.
        System.out.println("\t\tVALUE OF \'float\' VARIABLE \'f\': " + f);
        d = b;            //Automatic type conversion from 'byte' to 'double'.
        System.out.println("\t\tVALUE OF \'double\' VARIABLE \'d\': " + d);
    }
}
