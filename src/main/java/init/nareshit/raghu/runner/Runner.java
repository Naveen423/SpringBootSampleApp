package init.nareshit.raghu.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private static Logger logger = LoggerFactory.getLogger(Runner.class);
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
        int a=10;
        try {
        logger.info("STARTED");
		System.out.println("Welcome to Spring Boot Starter Project!"+a);
        }catch(Exception e) {
        	e.printStackTrace();
        }
        logger.info("END");
	}

}
