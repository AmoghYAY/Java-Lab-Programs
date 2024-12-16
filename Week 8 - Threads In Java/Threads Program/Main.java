class DisplayMessage1 extends Thread {
    public void run() {
        while (true) {
            try {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); // Sleep for 10 seconds (10000 milliseconds)
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class DisplayMessage2 extends Thread {
    public void run() {
        while (true) {
            try {
                System.out.println("CSE");
                Thread.sleep(2000); // Sleep for 2 seconds (2000 milliseconds)
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Mainy {
    public static void main(String[] args) {
        DisplayMessage1 thread1 = new DisplayMessage1();
        DisplayMessage2 thread2 = new DisplayMessage2();

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
