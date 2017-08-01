class stack {
    private int size = 5;
    private int stackArray[] = new int[size];
    private int top;
    stack() {           //Constructor.
        top = -1;
    }
    void push(int item) {            //Method to push (insert) elements into the stack.
        if(top == (size-1)) {
            System.out.println("STACK IS FULL (OVERFLOW).");
        }
        else {
            stackArray[++top] = item;
        }
    }
    int pop() {           //Method to pop (delete) elements from the stack.
        if(top == -1) {
            System.out.println("STACK IS EMPTY (UNDERFLOW).");
            return 0;
        }
        else {
            return stackArray[top--];
        }
    }
    int getSize() {         //Method to return the size of the stack.
        return size;
    }
}


class test40 {
    public static void main(String[] args) {
        stack first = new stack();
        stack second = new stack();
        int i;
        for(i=1; i<=first.getSize(); i++) {
            first.push(i);
        }
        for(i=16; i<=20; i++) {
            second.push(i);
        }
        System.out.println("ELEMENTS OF THE \'first\' STACK");
        for(i=0; i<first.getSize(); i++) {
            System.out.println("\t" + first.pop());
        }
        System.out.println("\nELEMENTS OF THE \'second\' STACK");
        for(i=0; i<second.getSize(); i++) {
            System.out.println("\t" + second.pop());
        }
    }
}
