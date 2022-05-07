class Temp
{
    private int counter;
    private int total;

    Temp(int total, int counter)
    {
        this.total = total;
        this.counter = counter;
    }

    public void printEvenNumber() throws InterruptedException
    {
        synchronized (this)
        {
            while (counter < total)
            {
                while (counter % 2 == 1)
                {
                    wait();
                }
                System.out.println(Thread.currentThread().getName() + " ------ " + counter + " ");
                counter++;
                notify();
            }
        }
    }

    public void printOddNumber() throws InterruptedException
    {
        synchronized (this)
        {
            while (counter < total)
            {
                while (counter % 2 == 0)
                {
                    wait();
                }
                System.out.println(Thread.currentThread().getName() + " ------ " + counter + " ");
                counter++;
                notify();
            }
        }
    }
}

public class PrintOddEvenUsingThreads
{
    public static void main(String[] args)
    {
        Temp temp = new Temp(10, 1);

        Thread threadEven = new Thread(() -> {
            try
            {
                temp.printEvenNumber();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        });

        Thread threadOdd = new Thread(() -> {
            try
            {
                temp.printOddNumber();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        });
        threadEven.start();
        threadOdd.start();
    }
}
