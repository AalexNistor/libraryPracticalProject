package sda.academy.util;

import sda.academy.dto.AuthorDTO;
import sda.academy.dto.BooksDTO;
import sda.academy.dto.CustomerDTO;
import sda.academy.entity.Author;
import sda.academy.entity.Books;
import sda.academy.entity.Customer;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MapperUtil {

    public static AuthorDTO convertAuthorEntityToDto(Author author) {
        AuthorDTO authorDTO = new AuthorDTO();
        authorDTO.setId(author.getId());
        authorDTO.setName(author.getName());
        authorDTO.setGenres(author.getGenres());
        authorDTO.setLanguage(author.getLanguage());
        Set<BooksDTO> booksDTOSet = author.getBooksSet().stream()
                .map(MapperUtil::convertBooksEntityToDtoWithoutAuthor)
                .collect(Collectors.toSet());
        authorDTO.setBooksDTOSet(booksDTOSet);
        return authorDTO;
    }

    public static BooksDTO convertBooksEntityToDtoWithoutAuthor(Books books) {
        BooksDTO booksDTO = new BooksDTO();
        booksDTO.setId(books.getId());
        booksDTO.setTitle(books.getTitle());
        booksDTO.setGenre(books.getGenre());
        booksDTO.setPrices(booksDTO.getPrices());
        return booksDTO;
    }

//    public static BooksDTO convertBooksEntityToDto(Books books) {
//        BooksDTO booksDTO = new BooksDTO();
//        booksDTO.setId(books.getId());
//        booksDTO.setTitle(books.getTitle());
//        booksDTO.setGenre(books.getGenre());
//        Set<AuthorDTO> authorDTOSet = books.getAuthorSet().stream()
//                .map(MapperUtil::convertAuthorEntityToDtoWithoutBooks)
//                .collect(Collectors.toSet());
//        booksDTO.setAuthorDTOSet(authorDTOSet);
//        return booksDTO;
//    }
//
//    public static AuthorDTO convertAuthorEntityToDtoWithoutBooks(Author author) {
//        AuthorDTO authorDTO = new AuthorDTO();
//        authorDTO.setId(author.getId());
//        authorDTO.setName(author.getName());
//        authorDTO.setGenres(author.getGenres());
//        authorDTO.setLanguage(author.getLanguage());
//        return authorDTO;
//    }
//
//    public static CustomerDTO convertCustomerEntityToDto(Customer customer) {
//        CustomerDTO customerDTO = new CustomerDTO();
//        customerDTO.setId(customer.getId());
//        customerDTO.setName(customer.getName());
//        customerDTO.setAddress(customer.getAddress());
//        customerDTO.setEmail(customer.getEmail());
//        Set<BooksDTO> booksDTOSet = customer.getBooks().stream()
//                .map(MapperUtil::convertBooksEntityToDtoWithoutAuthor)
//                .collect(Collectors.toSet());
//        customerDTO.setBooksDTOSet(booksDTOSet);
//        return customerDTO;
//    }

    public static Author convertAuthorDtoToEntity(AuthorDTO authorDTO) {
        Author author = new Author();
        author.setId(authorDTO.getId());
        author.setName(authorDTO.getName());
        author.setGenres(authorDTO.getGenres());
        author.setLanguage(authorDTO.getLanguage());
        Set<BooksDTO> booksDTOSet = authorDTO.getBooksDTOSet();
        Set<Books> booksSet = new HashSet<>();
        for(BooksDTO booksDTO : booksDTOSet) {
            Books books = convertBooksDtoToEntity(booksDTO);
            booksSet.add(books);
        }
        author.setBooksSet(booksSet);
        return author;
    }

        public static Books convertBooksDtoToEntity(BooksDTO booksDTO) {
        Books books = new Books();
        books.setId(booksDTO.getId());
        books.setTitle(booksDTO.getTitle());
        books.setGenre(booksDTO.getGenre());
        books.setPrices(books.getPrices());
        Set<AuthorDTO> authorDTOSet = booksDTO.getAuthorDTOSet();
        Set<Author> authorSet = new HashSet<>();
        for (AuthorDTO authorDTO : authorDTOSet) {
            Author author = convertAuthorDtoToEntity(authorDTO);
            authorSet.add(author);
        }
        books.setAuthorSet(authorSet);
        return books;
    }


}
