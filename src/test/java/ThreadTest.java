
public class ThreadTest {

    private class MyRunnable implements Runnable {
        private String name;

        public MyRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            // mycode
            System.out.println(this.name);
        }
    }


    private class MyThread extends Thread {
        @Override
        public void run() {
            //// mycode
//            System.out.println(this.name);
        }
    }

    public void main() {

//        Runnable runnable2 = new Runnable() {
//            @Override
//            public void run() {
//                // my code
//            }
//        };
//        runnable.run();
//        doRun(runnable);


//        Runnable runnable = new MyRunnable("dwedewd");
//        Thread thread = new Thread(runnable);
//        thread.run();
//        thread.start();

        MyThread thread = new MyThread();
        thread.start();
    }
}
