package ra;

public class ThreadDemo implements Runnable{
    private Thread thread;
    private String threadName;

    public ThreadDemo(String threadName) {
        System.out.println("Creating "+threadName);
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Running "+this.threadName);
        for (int i = 1; i < 5; i++) {
            System.out.println("Thread "+this.threadName+ " "+i);
            //Dung thread trong 50 miliseconds
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.err.println("Thread "+this.threadName+" interrup..");
            }
        }
        System.out.println("Thread "+this.threadName+" exiting");

    }

    public void start(){
        System.out.println("Starting "+this.threadName);
        if (this.thread==null){
            //Khoi tao doi tuong thread de chay ThreadDemo
            this.thread = new Thread(this,this.threadName);
            this.thread.start();
        }
    }


}
