import ra.ThreadDemo;

public class Main {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo("Luong Thoa");
        ThreadDemo t2 = new ThreadDemo("Luong Khanh");
        t1.start();
        t2.start();

    }
}