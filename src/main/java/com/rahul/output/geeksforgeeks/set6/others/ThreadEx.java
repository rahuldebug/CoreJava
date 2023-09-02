package com.rahul.output.geeksforgeeks.set6.others;

class ThreadEx extends Thread
{
    public void run()
    {
        System.out.print("Hello...");
    }
    public static void main(String args[])
    {
        ThreadEx T1 = new ThreadEx();
        T1.start();
        T1.stop();
        T1.start();
    }
}
//Exception in thread "main" java.lang.IllegalThreadStateException

//there are different states of thread
/*Runnable --> Running --> blocked -->terminated
once thread is terminated it cannot be again started
more on thread , under thread section
* */