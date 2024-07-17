package sda.academy.service;

import sda.academy.dto.BooksDTO;
import sda.academy.entity.Books;
import sda.academy.repository.BooksRepository;
import sda.academy.util.MapperUtil;

public class BooksService {
    private BooksRepository booksRepository;
    private AuthorService authorService;

    public BooksService(){
        this.booksRepository = new BooksRepository();
        this.authorService = new AuthorService();
    }

    public void saveBooks(BooksDTO booksDTO) {
        Books books = MapperUtil.convertBooksDtoToEntity(booksDTO, authorService);
        booksRepository.saveBooks(books);
    }
}
