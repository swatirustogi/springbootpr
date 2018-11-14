package com.springboot.basics.springbootfirstproject;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@GetMapping("/books")
	public List<Book> getBooks()
	{
		List l = new ArrayList<Book>();
		Book b1 = new Book(1,"Java","author3");
		Book b2 = new Book(2,"UNIX","aaacccccccccccc");
		l.add(b1);
		l.add(b2);
		
		return l;
		
	}
	
}
