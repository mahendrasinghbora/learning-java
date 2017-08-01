class test5 {
    public static void main(String[] args) {
        int octalValue = 017;      //'017' is an integer literal (octal) which is equivalent to '15' in decimal.
        System.out.println("VALUE OF \'octalValue\': " + octalValue);
        int hexValue = 0XF;        //'0XF' is an integer literal (hexadecimal) which is equal to '15' in decimal.
        System.out.println("VALUE OF \'hexValue\': " + hexValue);
        long var = 0XA7L;          //'0XA7L' is a long literal (hexadecimal) [suffix 'L'] and is equal to '167' in decimal.
        System.out.println("VALUE OF \'var\': " + var);
        long binaryValue = 0B1111L;   //'0B1111L' is a long literal (binary) and is equal to '15' in decimal.
        System.out.println("VALUE OF \'binaryValue\': " + binaryValue);
        int num = 1_2_3____4;    //It is possible to embed one or more underscores in an integer literal. When the literal is compiled, the underscores are discarded.
        System.out.println("VALUE OF \'num\': " + num);
    }
}
