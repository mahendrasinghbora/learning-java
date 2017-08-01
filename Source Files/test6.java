class test6 {
    public static void main(String[] args) {
        float a = 12.375F;             //Standard notation of a float literal [suffix 'F'].
        double b = 13.44;              //Standard notation of a double literal.
        float c = 2E-3F;               //Scientific notation of a float literal.
        double d = 3.4713E2D;          //Scientific notation of a double literal [suffix 'D', using the suffix is redundant].
        double e = 0X2FF.3P2;          //Hexadecimal floating-point (double) literal [suffix 'P'(Binary exponent)].
        float f = 0X3A.07P-5F;         //Hexadecimal floating-point (float) literal [suffix 'F'].
        double g = 3.1_____415;          //'3___.14' is illegal. It is possible to embed one or more underscores in a floating-point literal.
        System.out.println("VALUE OF \'a\': " + a);
        System.out.println("VALUE OF \'b\': " + b);
        System.out.println("VALUE OF \'c\': " + c);
        System.out.println("VALUE OF \'d\': " + d);
        System.out.println("VALUE OF \'e\': " + e);
        System.out.println("VALUE OF \'f\': " + f);
        System.out.println("VALUE OF \'g\': " + g);
    }
}
