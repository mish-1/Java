
class Parent {
    int x = 10;

    void display() {
        System.out.println("Parent class display method");
    }
}


class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println("Child x using this: " + this.x);
        System.out.println("Parent x using super: " + super.x);

        this.display();   
        super.display();  
    }
}


public class ThisSuperDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
