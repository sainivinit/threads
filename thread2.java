public class thread2 implements Runnable{
    public void run(){
        for (int i=0;i<10;i++)
        {
            System.out.println("Thread..2...(hello)");
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }

}