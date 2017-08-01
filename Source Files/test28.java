class test28 {
    public static void main(String[] args) {
        /*Following are some variations in the 'for' loop,
        * The condition controlling the 'for' can be any Boolean expression.
        * Either the initialization or the iteration expression or both may be absent.
        * Following is an infinite loop,
        * for( ; ; ) {
        // ...}*/
        boolean done = false;
        int n = 15, sum = 0;
        System.out.println("SUM OF FIRST \'" + n + "\' NATURAL NUMBERS");
        for(int i=1; !done;) {          //Here 'i' is the iteration (loop) variable.
            sum += i;
            System.out.print(i + " + ");
            if(i == n) {
                done = true;
            }
            i++;            //Iteration expression.
        }
        System.out.print("\b\b\b = " + sum);
    }
}
