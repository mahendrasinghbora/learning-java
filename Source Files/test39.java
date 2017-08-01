class circle {
    private double radius;          //Instance variable.
    circle(double radius) {         //Parameterized constructor.
        this.radius = radius;
        /*The 'this' keyword is used inside any method to refer to the current object.
        * That is, 'this' is always a reference to the object on which the method was invoked.
        * When a local variable has the same name as an instance variable, the local variable hides the instance variable (Instance variable hiding).
        * 'this' can be used to resolve any namespace collisions that might occur between instance variables and local variables.*/
    }
    double area() {         //Method to calculate area.
        return 3.14159 * Math.pow(radius, 2);
    }
    double circumference() {            //Method to calculate circumference.
        return 2 * 3.14159 * radius;
    }
    double getRadius() {            //Method to return radius.
        return  radius;
    }
}


class test39 {
    public static void main(String[] args) {
        double radius = 7;
        circle ring = new circle(radius);           //'circle' class instance (object).
        System.out.println("RADIUS OF THE CIRCLE: " + ring.getRadius() + " UNITS");
        System.out.println("\tAREA OF THE CIRCLE: " + ring.area() + " SQUARE UNITS");
        System.out.println("\tCIRCUMFERENCE OF THE CIRCLE: " + ring.circumference() + " UNITS");
        /*Garbage collection (When no references to an object exist, that object is assumed to be no longer needed, and the memory occupied by the object can be reclaimed).
        * There is no explicit need to destroy objects as in C++.
        * The garbage collector automatically reclaims storage for an object.*/
        //Finalization can be used to define specific actions that will occur when an object is just about to be reclaimed by the garbage collector.
    }
}
