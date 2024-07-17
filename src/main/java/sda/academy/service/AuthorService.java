package sda.academy.service;

import sda.academy.dto.AuthorDTO;
import sda.academy.entity.Author;
import sda.academy.repository.AuthorRepository;
import sda.academy.util.MapperUtil;

public class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService(){
        this.authorRepository = new AuthorRepository();
    }

    public void saveAuthor(AuthorDTO authorDTO) {
        Author author = MapperUtil.convertAuthorDtoToEntity(authorDTO);
        authorRepository.saveAuthor(author);
    }

    public Author findAuthorByName(String name) {
        return authorRepository.findAuthorByName(name);
    }
}
