package com.biblioteket.biblioteket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BiblioteketApplication {

	public static Library library = new Library("Bibblan");

	static {
		library.addBook("Stiftelsen trilogin", "Isac Asimov", 900, false);
		library.addBook("Dune", "Frank Herbert", 900, false);
		library.addBook("The Electric state", "Simon Stålenhag", 200, true);
	}

	public static void main(String[] args) {
		SpringApplication.run(BiblioteketApplication.class, args);
	}



}
