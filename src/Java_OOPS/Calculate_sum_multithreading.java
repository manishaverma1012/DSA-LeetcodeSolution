package Java_OOPS;

public class Calculate_sum_multithreading {
    public void sum(int x,int y)
    {
        int sum1=x+y;
        System.out.println("Here is the sum"+ " " + sum1);
    }

    public static void main(String[] args) {
        Calculate_sum_multithreading obj=new Calculate_sum_multithreading();
        Thread t1=new Thread(new Runnable(){
            public void run()
            {
                obj.sum(2,4);
            }

        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.sum(4,6);
            }
        }

        );
        t1.start();
        t2.start();



    }
}
