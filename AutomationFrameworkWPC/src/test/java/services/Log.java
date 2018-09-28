package services;

import java.io.File;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class Log {

	
	
	public static final Logger Log = Logger.getLogger("devLogger");
	
	
	
	public Log() {
		BasicConfigurator.configure();
		Log.error("Hello");
		Log.error("Super");
	}
}
