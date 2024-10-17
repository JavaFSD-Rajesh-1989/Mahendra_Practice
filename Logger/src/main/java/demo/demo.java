package demo;

import org.apache.log4j.Logger;

public class demo {
	static Logger log = Logger.getLogger("demo");
	public static void main(String[] args) {
		try {
			log.info("my name is mahendra");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.error("this is an error");
	}
}
