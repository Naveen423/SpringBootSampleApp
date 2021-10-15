package init.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
        int a=10;
		System.out.println("Welcome to Spring Boot Starter Project!"+a);
      
	}

}
