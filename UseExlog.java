package Log4j;

import org.apache.log4j.BasicConfigurator;

public class UseExlog {
	public static void main(String[] args) {
		Exlog e = new Exlog();
		BasicConfigurator.configure();
		e.add();
	}

}
