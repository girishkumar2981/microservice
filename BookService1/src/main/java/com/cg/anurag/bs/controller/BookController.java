package com.cg.anurag.bs.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cg.anurag.bs.dto.Book;
@RestController
public class BookController 
{
   @GetMapping("/getBook/{bookId}")
   public Book getBook(@PathVariable int bookId)
   {
	   return new Book(bookId,"C++","StrouStrup",450);
   }
}
