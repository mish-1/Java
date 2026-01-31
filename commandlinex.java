class commandlineex {
    void calculate(int a, int b) {
        System.out.println("Addition = " + (a + b));
        System.out.println("Multiplication = " + (a * b));
    }

    public static void main(String args[]) {

        commandlineex obj = new commandlineex();

        
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        obj.calculate(x, y);  

    }
}

