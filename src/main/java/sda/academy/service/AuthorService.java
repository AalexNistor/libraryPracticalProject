package sda.academy.service;

import sda.academy.entity.Author;
import sda.academy.repository.AuthorRepository;

public class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService(){
        this.authorRepository = new AuthorRepository();
    }

    public void saveOwner(Author author) {
        authorRepository.saveAuthor(author);
    }
}
