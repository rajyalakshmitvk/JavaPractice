//Thread creation using Runnable interface
class RunnableThread implements Runnable
{
    // This is the entry point for the second thread.
    public void run() {
        System.out.println("Welcome to Runnable Thread");
    }
}
class RunnableThreadDemo
{
    public static void main(String args[ ] )
    {
        RunnableThread n=new RunnableThread(); // create a new thread
        Thread t=new Thread(n);
        t.start();//start child thread
        //n.start();
        System.out.println(Thread.currentThread());
        System.out.println("Main thread is running");
    }
}