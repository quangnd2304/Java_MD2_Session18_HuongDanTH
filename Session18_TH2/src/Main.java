import ra.Car;

public class Main {
    public static void main(String[] args) {
        Car carA = new Car("Car A",100);
        Car carB = new Car("Car B",100);
        Car carC = new Car("Car C",100);
        Thread threadA = new Thread(carA);
        Thread threadB = new Thread(carB);
        Thread threadC = new Thread(carC);
        threadA.start();
        threadB.start();
        threadC.start();

    }
}