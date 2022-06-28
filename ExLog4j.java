package Log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ExLog4j {
	static Logger log = Logger.getLogger(ExLog4j.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("hi");
		log.debug("hello");
		log.fatal("welcome");
		log.error("world");
		log.warn("hi city");
		
	}
}