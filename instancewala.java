class InstanceDemo {
    String name;
    int rollNo;

   
    void displayStudent(String n, int r) {
        name = n;
        rollNo = r;

        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        
        InstanceDemo obj = new InstanceDemo();
        obj.displayStudent("Mishti", 21);
    }
}
