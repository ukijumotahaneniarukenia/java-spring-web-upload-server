package app;

import app.storage.StorageProperties;
import app.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class NnnApplication {

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
//			storageService.deleteAll(); 洗い替え
			storageService.init();
		};
	}

	public static void main(String... args) {
		SpringApplication.run(NnnApplication.class, args);
	}
}
