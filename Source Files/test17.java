class test17 {
    public static void main(String[] args) {
        /*The operands of the arithmetic operators must be of a numeric type.
        * They cannot be used on 'boolean' types, but on 'char' types, since the 'char' type in Java is, essentially, a subset of 'int'.*/
        int a = 10 + 3;         //Arithmetic addition.
        int b = 100 - 7;            //Arithmetic subtraction.
        int c = 21 * 8;         //Arithmetic multiplication.
        int d = 100 / 3;            //Arithmetic division.
        //When division operator is applied to integers, there will be no fractional component attached to the result.
        int e = -31;            //Unary minus (It negates its single operand).
        int f = +10;            //Unary plus (It simply returns the value of its operand.).
        int g = 47 % 5;         //The modulus operator, '%', returns the remainder of a division operation.
        /*It is defined to satisfy the following identity,
        * (a / b) * b + (a % b) == a*/
        System.out.println("INTEGER ARITHMETIC");
        System.out.println("\t\tVALUE OF \'a\': " + a);
        System.out.println("\t\tVALUE OF \'b\': " + b);
        System.out.println("\t\tVALUE OF \'c\': " + c);
        System.out.println("\t\tVALUE OF \'d\': " + d);
        System.out.println("\t\tVALUE OF \'e\': " + e);
        System.out.println("\t\tVALUE OF \'f\': " + f);
        System.out.println("\t\tVALUE OF \'g\': " + g);
        double da = 10 + 3;
        double db = 100 - 7;
        double dc = 21 * 8;
        double dd = 100 / 3;
        double de = -31;
        double df = +10;
        double dg = 47.45 % 5;
        System.out.println("FLOATING-POINT ARITHMETIC");
        System.out.println("\t\tVALUE OF \'da\': " + da);
        System.out.println("\t\tVALUE OF \'db\': " + db);
        System.out.println("\t\tVALUE OF \'dc\': " + dc);
        System.out.println("\t\tVALUE OF \'dd\': " + dd);
        System.out.println("\t\tVALUE OF \'de\': " + de);
        System.out.println("\t\tVALUE OF \'df\': " + df);
        System.out.println("\t\tVALUE OF \'dg\': " + dg);
    }
}
