package sda.academy.service;

import sda.academy.entity.Books;
import sda.academy.repository.BooksRepository;

public class BooksService {
    private BooksRepository booksRepository;

    public BooksService(){
        this.booksRepository = new BooksRepository();
    }

    public void saveBooks(Books books) {
        booksRepository.saveBooks(books);
    }
}
