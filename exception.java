 class exception {
    static void fun() {
        try{
            throw new NullPointerException("This is a null pointer exception");
        }
        catch(NullPointerException e){
            System.out.println("caught inside fun();");
        throw e;
        }
    }
    public static void main(String[] args) {
        
        try {
            fun();
        }catch(NullPointerException e){
            System.out.println("caught in main");
        }
    }
}
