package Cuatrovientos.dam.ed.ejemplos2ev;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger = LogManager.getLogger();
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.error("Otro hellow world 1ºDAM: "+args[0]);
        
    }
}
