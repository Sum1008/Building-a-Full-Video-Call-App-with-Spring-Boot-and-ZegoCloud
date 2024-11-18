package com.alibou.videocall;

import com.alibou.videocall.user.User;
import com.alibou.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
							.username("Sumit")
							.email("Sumit@mail.com")
							.password("sumit")
					.build());

			service.register(User.builder()
					.username("John")
					.email("john@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Sakshi")
					.email("Sakshi@mail.com")
					.password("Sakshi")
					.build());
		};
	}

}
