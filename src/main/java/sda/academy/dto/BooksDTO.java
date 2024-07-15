package sda.academy.dto;

import sda.academy.entity.Author;

import java.util.HashSet;
import java.util.Set;

public class BooksDTO {

    private int id;
    private String title;
    private String genre;
    private Double prices;
    private Set<AuthorDTO> authorDTOSet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getPrices() {
        return prices;
    }

    public void setPrices(Double prices) {
        this.prices = prices;
    }

    public Set<AuthorDTO> getAuthorDTOSet() {
        return authorDTOSet;
    }

    public void setAuthorDTOSet(Set<AuthorDTO> authorDTOSet) {
        this.authorDTOSet = authorDTOSet;
    }

    @Override
    public String toString() {
        return "BooksDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", prices=" + prices +
                ", authorDTOSet=" + authorDTOSet +
                '}';
    }
}
