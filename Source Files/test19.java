class test19 {
    public static void main(String[] args) {
        /*The increment operator increases its operand by one.
        * The decrement operator decreases its operand by one.
        * These operators can appear in both prefix and postfix form.
        * In the prefix form, the operand is incremented or decremented before the value is obtained for use in the expression.
        * It follows "first change then use" rule.
        * In postfix form, the previous value is obtained for use in the expression, and then the operand is modified.
        * It follows "first use then change" rule.*/
        int x, y, c, d;
        x = c = 1;
        y = x++;
        /*It is equivalent to the following statements,
        * y = x;
        * x = x + 1;*/
        d = ++c;
        /*It is equivalent to the following statements,
        * c = c + 1;
        * d = c;*/
        System.out.println("INCREMENT OPERATOR IN POSTFIX FORM");
        System.out.println("\t\tVALUE OF \'x\': 1");
        System.out.println("\t\ty = x++;");
        System.out.println("\t\tVALUE OF \'y\': " + y);
        System.out.println("\t\tVALUE OF \'x\' AFTER THE OPERATION: " + x);
        System.out.println("INCREMENT OPERATOR IN PREFIX FORM");
        System.out.println("\t\tVALUE OF \'c\': 1");
        System.out.println("\t\td = ++c;");
        System.out.println("\t\tVALUE OF \'d\': " + d);
        System.out.println("\t\tVALUE OF \'c\' AFTER THE OPERATION: " + c);
        /*'operand++;' or '++operand;' is equivalent to 'operand = operand + 1;'.
        * 'operand--;' or '--operand;' is equivalent to 'operand = operand - 1;'.*/
    }
}
