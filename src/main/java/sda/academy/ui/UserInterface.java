package sda.academy.ui;

import sda.academy.dto.AuthorDTO;
import sda.academy.service.AuthorService;

import java.util.Scanner;

public class UserInterface {
    private AuthorService authorService;

    public void addAuthor(Scanner scanner) {
        System.out.println("Author name: ");
        String name = scanner.next();
        System.out.println("Author language: ");
        String language = scanner.next();
        System.out.println("Author genres: ");
        String genres = scanner.next();
        AuthorDTO authorDTO = new AuthorDTO();
        authorDTO.setName(name);
        authorDTO.setLanguage(language);
        authorDTO.setGenres(genres);
        authorService.saveAuthor(authorDTO);
    }

}
