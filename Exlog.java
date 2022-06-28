package Log4j;

import org.apache.log4j.Logger;

public class Exlog {
	Logger log = Logger.getLogger(Exlog.class);

	public void add() {
		log.info(10 + 20);

	}
}
