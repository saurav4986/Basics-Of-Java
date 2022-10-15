public class Main {

    public static void print(){
        System.out.println("Static method");
    }
    public void display(){
        System.out.println(" non-Static method");
    }
    public static void main(String[] args) {

        print();
        Main main = new Main();
        main.display();
    }
}