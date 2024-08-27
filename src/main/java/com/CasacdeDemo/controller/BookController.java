package com.CasacdeDemo.controller;

import com.CasacdeDemo.entity.Book;
import com.CasacdeDemo.entity.Customer;
import com.CasacdeDemo.repo.BookRepository;
import com.CasacdeDemo.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @PostMapping("/add")
    public String addDetails(@RequestBody Book book, @RequestParam int cId){
        Customer customer = customerRepository.findById(cId).get();
        book.setCustomer(customer);
        bookRepository.save(book);
        return "added Deatils";
    }
    @PutMapping("/update")
    public ResponseEntity<?>updateBook(
            @RequestBody Book book,@RequestParam int bId){

        Optional<Book> bybId = bookRepository.findById(bId);
        if(bybId.isPresent()){
            Book book1 = bybId.get();
            book1.setBookName(book.getBookName());
            book1.setPrice(book.getPrice());
            return new ResponseEntity<>(bookRepository.save(book1), HttpStatus.OK);
        }
        return new ResponseEntity<>("not Updated",HttpStatus.BAD_REQUEST);
    }
}
