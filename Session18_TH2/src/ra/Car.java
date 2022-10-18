package ra;

public class Car implements Runnable{
    private String carName;
    private int distance;

    public Car() {
    }

    public Car(String carName, int distance) {
        this.carName = carName;
        this.distance = distance;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance<this.distance){
            //Khoi tao chuoi in ra duong dua cua xe
            String strLog = "|";
            //Khoi tao van toc cho tung xe (random)
            int speed = (int)(Math.random()*20);
            if (runDistance+speed>=this.distance){
                runDistance=this.distance;
                for (int i = 0; i < this.distance; i++) {
                    strLog+="=";
                }
            }else{
                runDistance+=speed;
                int percent = (runDistance*100)/this.distance;
                for (int i = 0; i < this.distance; i++) {
                    if (i<percent){
                        strLog+="=";
                    } else if (i==percent) {
                        strLog+="o";
                    }else{
                        strLog+="-";
                    }
                }
            }
            strLog+="|";
            System.out.printf("%s : %s %dKM\n",this.carName,strLog,runDistance);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.printf("%s was broken...");
            }
        }
        long endTime = System.currentTimeMillis();
        int time =(int)((endTime-startTime)/1000);
        System.out.printf("%s finish in %ds\n",this.carName,time);
    }
}
