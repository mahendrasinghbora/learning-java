class test22 {
    public static void main(String[] args) {
        /*A 'nested if' is an 'if' statement that is the target of another 'if' or 'else'.
        * An 'else' statement always refers to the nearest 'if' statement that is within the same block as the 'else' and that is not already associated with an 'else'.*/
        int number[] = {17, 18, 21};
        for(int i=0; i<3; i++) {
            System.out.println("NUMBER: " + number[i]);
            if((number[i] % 3) == 0) {              //To check if a given number is a multiple of three or not.
                if((number[i] % 2 ) == 0) {         //Nested-if (To check the parity of the multiple).
                    System.out.println("IT IS AN EVEN MULTIPLE OF 3.");
                }
                else {
                    System.out.println("IT IS AN ODD MULTIPLE OF 3.");
                }
            }
            else {
                System.out.println("IT IS NOT A MULTIPLE OF 3.");
            }
        }
    }
}
