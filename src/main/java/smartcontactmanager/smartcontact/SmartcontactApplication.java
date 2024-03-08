package smartcontactmanager.smartcontact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class SmartcontactApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartcontactApplication.class, args);
		System.out.println("smart contact project running fine");
	}

}
