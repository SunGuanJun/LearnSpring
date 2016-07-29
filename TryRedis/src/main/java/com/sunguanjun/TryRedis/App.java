package com.sunguanjun.TryRedis;

import com.sunguanjun.TryRedis.try1.Cacheable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    @Cacheable(expire=2)
    public void test ()
    {
    	
    }
}
