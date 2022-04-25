package InterviewQuestionPart2.Semaphore;

import java.util.concurrent.Semaphore;

public class Connection {

    /**
     * Semaphore grants permit only when permit is granted Thread can access shared resource.
     *  Bounded collection,Collection Pool -- which would block if no conection pool is vaialble instead pf failing and hande over connection
     **/

    // Connection pool which manitain connection

    private static Connection INSTANCE= new Connection();
    private int noOfConnections;

    private Semaphore semaphore = new Semaphore(10,true) ; //Whichever thread will start first will get the permit

    private Connection(){  //Designer class in Singleton fashion

    }

    //Other Thread will get ca chance to Thread

    public static Connection getConnection(){ //Factory method can be call by driver code
        return  INSTANCE;
    }

    public void connect(){
         //Thread which want to connection has call acquire method


        try {
            semaphore.acquire(); // Permission will be taken from count 10
            synchronized (this){
                noOfConnections++; //This is not atomic operation --hence we need to think Thread safety
                System.out.println("Current Connection :"+noOfConnections);
            }
         Thread.sleep(2000); //This Connection will be used by 2000 millisecond once connection is taken

         synchronized (this){
             noOfConnections--;
         }

        }catch (Exception e){
            e.printStackTrace();
        } finally {
            if(semaphore !=null){
                semaphore.release();
            }
        }


    }



}
