package com.dange.tanmay.logbackDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{
	public static Logger Log = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
        Log.info("Hello World!");
        int x=10;
        Log.info("Variable value is {}",x);
    }
}
