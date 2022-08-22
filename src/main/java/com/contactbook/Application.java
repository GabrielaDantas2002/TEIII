package com.contactbook;

import com.contactbook.entity.Contact;
import com.contactbook.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	/*@Bean
	public CommandLineRunner run(@Autowired ContactRepository repository){
		return args -> {
			Contact contact = new Contact();
			contact.setNameContact("Gabriela");
			contact.setEmailContact("gabriela@email.com");
			contact.setFavoriteContact(false);
			repository.save(contact);
		};

		return args -> {
			Contact contact = Contact.builder().nameContact("Teste").emailContact("teste@email.com").favoriteContact(true).build();
			repository.save(contact);
		};
	}*/

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
