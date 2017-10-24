package com.jaiseSpring5.Spring5App1;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.jaiseSpring5.Spring5App1.model.Author;
import com.jaiseSpring5.Spring5App1.model.Book;
import com.jaiseSpring5.Spring5App1.repository.AuthorRepository;
import com.jaiseSpring5.Spring5App1.repository.BookRepository;
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepository authorRepository;

	private BookRepository bookRepository;


	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		
		
	initData();
	}
	public void initData() {
		Author eric = new Author("Eric","Evan");
		Book ddd = new Book("Domain Driven Design", "1234", "Harper Collins");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		authorRepository.save(eric);
		bookRepository.save(ddd);
		System.out.println("saved eric nd ddd");
				
		//Rod
		Author rod = new Author("Rod","Johnson");
		Book noEJB = new Book("J2EE Development without EJB","23444","Wrox");
		rod.getBooks().add(noEJB);
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		
 	}

}
