package org.sid.walletservice;

import org.sid.walletservice.entities.Client;
import org.sid.walletservice.repo.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class WalletServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ClientRepository clientRepository){
		return args -> {
			clientRepository.saveAll(List.of(
					Client.builder().name("Mohamed").email("med@gmail.com").build(),
					Client.builder().name("Hassan").email("hasan@gmail.com").build(),
					Client.builder().name("IMane").email("imane@gmail.com").build()
			));
			clientRepository.findAll().forEach(System.out::println);
		};
	}

}
