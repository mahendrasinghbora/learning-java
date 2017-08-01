class test18 {
    public static void main(String[] args) {
        /*Java provides special operators that can be used to combine an arithmetic operation with an assignment called 'compound arithmetic operators'.
        * Thus, any statement of the form, 'var = var op expression;' can be rewritten as, 'var op= expression;'.
        * They are also referred to as shorthand notation.*/
        int a = 1;
        int b = 7;
        int c = 3;
        int d = 100, e = 125;
        a += 5;         //Addition assignment (a = a + 5;).
        b -= 2;         //Subtraction assignment (b = b - 2;).
        c *= 7;         //Multiplication assignment (c = c * 7;).
        d /= (a + b);           //Division assignment (d = d / (a + b);).
        e %= c;         //Modulus assignment (e = e % c;).
        System.out.println("COMPOUND ARITHMETIC OPERATORS");
        System.out.println("\t\tVALUE OF \'a\': " + a);
        System.out.println("\t\tVALUE OF \'b\': " + b);
        System.out.println("\t\tVALUE OF \'c\': " + c);
        System.out.println("\t\tVALUE OF \'d\': " + d);
        System.out.println("\t\tVALUE OF \'e\': " + e);
    }
}
