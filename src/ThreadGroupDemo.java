public class ThreadGroupDemo implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ThreadGroupDemo grp = new ThreadGroupDemo();
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
        new Thread(tg1, grp,"one").start();
        new Thread(tg1, grp,"two").start();
        new Thread(tg1, grp,"three").start();
        System.out.println("Active Count"+tg1.activeCount());
        System.out.println("Active Group Count"+tg1.activeGroupCount());
        System.out.println("Max Priority"+tg1.getMaxPriority());
        System.out.println("Thread Group Name: "+tg1.getName());
        System.out.println("Thread Group Parent Name: "+tg1.getParent());
        tg1.list();
    }
}