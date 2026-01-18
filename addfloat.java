class addfloat {

    static double add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        float x = 2.5f;
        float y = 3.5f;

        double result = add(x, y);
        System.out.println("after addition " + result);
    }
}
