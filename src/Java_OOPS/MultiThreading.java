package Java_OOPS;

class threading implements Runnable
{
    public void run()
    {

        System.out.println("calculate sum");
    }

}

public class MultiThreading  {
    public static void main(String[] args) {
        threading obj=new threading();
        Thread t=new Thread(obj);
        t.start();

    }

}
