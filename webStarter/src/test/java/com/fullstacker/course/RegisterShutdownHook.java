package com.fullstacker.course;

import java.util.concurrent.TimeUnit;

/**
 * registershutdownhook
 *
 * @author xingguishuai
 * @create 2018-01-11-18:30
 **/
public class RegisterShutdownHook {

    public void start()
    {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run()
            {
                System.out.println("Execute Hook.....");
            }
        }));
    }

    public static void main(String[] args)
    {
        new RegisterShutdownHook().start();
        System.out.println("The Application is doing something");

        try
        {
            TimeUnit.MILLISECONDS.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
