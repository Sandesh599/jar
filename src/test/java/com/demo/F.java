package com.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class F {
	
	static Logger log= Logger.getLogger(F.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		log.debug("1dddddddddd");
		log.info("iii2iiiiiii");
		log.warn("wwww3wwwwww");
		log.error("eeee4eeeee");
		log.fatal("fffff5fffff");
		
	}

}
