class StudentDetails {

   
    static String collegeName = "Symbiosis Institute Of Technology";

    
    String name;
    int rollNo;

    StudentDetails(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    
    void display() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails("Mishti", 21);
        s1.display();
    }
}
