package progcomposant.tp.tp1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Tp1Application {
	private static final Logger log = LoggerFactory.getLogger(Tp1Application.class);
	public static void main(String[] args) {
		log.debug("Demarrage de l'application");
		SpringApplication.run(Tp1Application.class, args);
	}

}
