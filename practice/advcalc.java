package practice;

public class advcalc extends calc {
    public int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
    public static void main(String[] args) {
        advcalc c = new advcalc();
        c.add(5, 3);
        c.sub(5, 3);
        c.mul(5, 3);
        
         System.out.println("The power is: " + c.power(5, 3));
    }
    
}
