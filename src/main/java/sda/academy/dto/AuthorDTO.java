package sda.academy.dto;

import sda.academy.entity.Books;

import java.util.HashSet;
import java.util.Set;

public class AuthorDTO {
    private int id;
    private String name;
    private String language;
    private String genres;
    private Set<BooksDTO> booksDTOSet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public Set<BooksDTO> getBooksDTOSet() {
        return booksDTOSet;
    }

    public void setBooksDTOSet(Set<BooksDTO> booksDTOSet) {
        this.booksDTOSet = booksDTOSet;
    }

    @Override
    public String toString() {
        return "AuthorDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", genres='" + genres + '\'' +
                ", booksDTOSet=" + booksDTOSet +
                '}';
    }
}
