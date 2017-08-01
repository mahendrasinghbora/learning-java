class test11 {
    public static void main(String[] args) {
        int var = 100;            //Accessible throughout the 'main()' function.
        System.out.println("BEFORE THE CODE-BLOCK");
        System.out.println("\tVALUE OF \'var\': " + var);           //'var' is available here.
        {
            int num = 10;         //Accessible only within this block.
            System.out.println("INSIDE THE BLOCK");
            System.out.println("\tVALUE OF \'num\': " + num);           //'num' is available here.
            System.out.println("\tVALUE OF \'var\': " + var);           //'var' is available here also.
            //int var;
            /*It will result in a compile-time error because the variable 'var' has already been defined.*/
        }
        System.out.println("AFTER THE BLOCK");
        System.out.println("\tVALUE OF \'var\': " + var);
        //System.out.println("\tVALUE OF \'num\': " + num);
        System.out.println("\t\'num\' IS NOT AVAILABLE HERE BECAUSE ITS SCOPE WAS LIMITED WITHIN THE BLOCK.");
    }
}
