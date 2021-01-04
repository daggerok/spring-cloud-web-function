package daggerok.springcloudwebfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Map;
import java.util.function.Function;

@SpringBootApplication
public class SpringCloudWebFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudWebFunctionApplication.class, args);
	}

	@Bean
	Function<Map<String, String>, String> hello() {
		return payload -> String.format("Hello, %s!", payload.get("name"));
	}
}
