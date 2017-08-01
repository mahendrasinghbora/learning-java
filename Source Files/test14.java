class test14 {
    public static void main(String[] args) {
        /*Type promotion rules are as following:
        * First, all 'byte', 'short', and 'char' values are promoted to 'int'.
        * Then, if one operand is a 'long', the whole expression is promoted to 'long'.
        * If one operand is a 'float', the entire expression is promoted to 'float'.
        * If any of the operands are 'double', the result is 'double'.*/
        //byte b = 50;
        //b = b * 2;
        //The above statement results in an error because an 'int' cannot be assigned to a 'byte'.
        //b = (byte) (b * 2);
        byte b = 42;
        char c = 'A';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        System.out.println("VALUE OF \'byte\' VARIABLE \'b\': " + b);
        System.out.println("VALUE OF \'char\' VARIABLE \'c\': " + c);
        System.out.println("VALUE OF \'short\' VARIABLE \'s\': " + s);
        System.out.println("VALUE OF \'int\' VARIABLE \'i\': " + i);
        System.out.println("VALUE OF \'float\' VARIABLE \'f\': " + f);
        System.out.println("VALUE OF \'double\' VARIABLE \'d\': " + d);
        double result = (f * b) + (i / c) - (d * s);
        /*'(f * b)' results in 'float' ('b' is promoted to 'float').
        * '(i / c)' results in 'int' ('c' is promoted to 'char').
        * '(d * s)' results in 'double' ('s' is promoted  to double).
        * The outcome of 'float' plus an 'int' is a 'float'.
        * Then the resultant 'float' minus the last 'double' is promoted to 'double', which is the type for the final result of the expression.*/
        System.out.println("result = (f * b) + (i / c) - (d * s)");
        System.out.println("VALUE OF \'result\': " + result);
    }
}
