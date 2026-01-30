class ClassOne {
    void displayOne() {
        System.out.println("This is Class One");
    }
}

class ClassTwo {
    void displayTwo() {
        System.out.println("This is Class Two");
    }
}

class ClassThree {
    void displayThree() {
        System.out.println("This is Class Three");
    }

    public static void main(String args[]) {

        ClassOne obj1 = new ClassOne();      // Object of ClassOne
        ClassTwo obj2 = new ClassTwo();      // Object of ClassTwo
        ClassThree obj3 = new ClassThree();  // Object of ClassThree

        obj1.displayOne();    // Object call 1
        obj2.displayTwo();    // Object call 2
        obj3.displayThree();  // Object call 3
    }
}
