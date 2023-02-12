public class DeadLockSolveScenario {

    public static void main(String[] args) {

        final String resource1 = "First lock "; //Pattern of Accessing A and B is the issue
        final String resource2 = "Second lock "; //  Reorder the statement

        Thread t1 = new  Thread() {
            public void run() {
                synchronized (resource1){
                    System.out.println("Thread 1 : Resource 1 is locked");
                    try{Thread.sleep(1000);} catch(Exception e){}

                    synchronized (resource2){
                        System.out.println("Thread 1 : Resource 2 is locked");
                        try {Thread.sleep(1000);} catch (Exception e){}
                    }}
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                synchronized (resource1){
                    System.out.println("Thread 2 : Resource 2 is locked  ");
                    try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

                    synchronized (resource2){
                        System.out.println("Thread 2 : Resource 1 is locked ");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }}
            }
        };

        t1.start();
        t2.start();
    }


}

//Avoid giving locks to multiple Threads
// Give locks to imp thread
//Use Thread join
