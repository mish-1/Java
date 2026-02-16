class same{

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        same obj = new same();
        obj.add(10, 20);
        obj.add(2.5, 3.5);
    }
}
