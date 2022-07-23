package com.example.gfgjavaquestion;

public class MyClass {

    public static void main(String[] args)  {

        Sender sender = new Sender();
        MessagingSendThread thread1 = new MessagingSendThread("Hi", sender);
        thread1.start();
        MessagingSendThread thread2 = new MessagingSendThread("Bye", sender);
        thread2.start();

    }

}

class Sender
{
    public void sendMessage(String message) throws InterruptedException {
        System.out.println("sending \t"+message);
        Thread.sleep(2000);
        System.out.println(message +"\tsent");
    }
}

class MessagingSendThread extends Thread
{
    String message;
    Sender sender;

    MessagingSendThread(String msg, Sender object)
    {
        this.message = msg;
        this.sender = object;
    }

    @Override
    public void run()
    {
        synchronized (sender)
        {
            try {
                sender.sendMessage(message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}