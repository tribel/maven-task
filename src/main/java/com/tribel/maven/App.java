package com.tribel.maven;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String HELLO_WORLD = "Hello World!";

	public static void main( String[] args )
    {
        System.out.println( HELLO_WORLD );
        if(args.length > 0) {
        	System.out.println("with parameters" + Arrays.toString(args));
        } else {
        	System.out.println("no parameters");
        }
    }
}
