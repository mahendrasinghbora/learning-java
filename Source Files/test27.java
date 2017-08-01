class test27 {
    public static void main(String[] args) {
        /*The 'for' loop is an entry-controlled loop.*/
        int iterations = 0;
        long numbers[] = {5, 11 , -10, 0}, i, factorial;
        while(iterations < 4) {
            System.out.println("NUMBER: " + numbers[iterations]);
            if(numbers[iterations] < 0) {
                System.out.println("FACTORIAL OF NEGATIVE NUMBERS IS NOT POSSIBLE.");
                iterations++;
                continue;
            }
            for(i=1, factorial=1; i<=numbers[iterations]; i++) {
                factorial *= i;
            }
            System.out.println("FACTORIAL: " + factorial);
            iterations++;           //Update (iteration) expression.
        }
    }
}
