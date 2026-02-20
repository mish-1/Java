public class exp {
    public static void main(String[] args) {
        try {
            int[] n=new int[5];
            int divisor=0;
            for(int i=0; i < n.length;i++){
                int res=n[i] /divisor;
                System.err.println(res);


            }
        } catch (ArithmeticException e) {
            
            throw new RuntimeException("Division by zero is not allowed", e);
        }
        
    }
}
