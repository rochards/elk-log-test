package br.com.rochards.main;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	final static Logger logger = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
        while(true) {
        	
        	logger.info("log test info");
            logger.warn("log test warn");
            logger.debug("log test debug");
        	
        	try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				logger.error(e.getMessage());
			}
        }
        
    }
}
