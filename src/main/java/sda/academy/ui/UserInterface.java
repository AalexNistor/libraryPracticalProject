package sda.academy.ui;

import sda.academy.dto.AuthorDTO;
import sda.academy.dto.BooksDTO;
import sda.academy.entity.Author;
import sda.academy.service.AuthorService;
import sda.academy.service.BooksService;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {
    private AuthorService authorService;
    private BooksService booksService;

    public UserInterface(){
        this.authorService = new AuthorService();
        this.booksService = new BooksService();
    }

    public static int menuOption (Scanner scanner) {
        System.out.println("1. Add author");
        System.out.println("2. Add book");
        System.out.println("3. Add customer");
        System.out.println("4. Exit");
        int menuOption = scanner.nextInt();
//        if(menuOption == 1){
//            UserInterface user = new UserInterface();
//            user.addAuthor(scanner);
//        }
//        return menuOption;
        UserInterface user = new UserInterface();
        switch (menuOption) {
            case 1:
                user.addAuthor(scanner);
                break;
            case 2:
                user.addBook(scanner);
                break;
//            case 3:
//                user.addCustomer(scanner);
//                break;
            case 4:
                System.out.println("Exit");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
        return menuOption;
    }

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

    public void addBook(Scanner scanner) {
        System.out.println("Title: ");
        String title = scanner.next();
        System.out.println("Genre: ");
        String genre = scanner.next();
        System.out.println("Price: ");
        double price = scanner.nextDouble();
//        System.out.println("Author: ");
//        String authors = scanner.next();
        BooksDTO booksDTO = new BooksDTO();
        booksDTO.setTitle(title);
        booksDTO.setGenre(genre);
        booksDTO.setPrices(price);
        Set<String> authorSet = new HashSet<>();
        authorSet.add("1");
        booksDTO.setAuthorsName(authorSet);
        booksService.saveBooks(booksDTO);

    }

}
