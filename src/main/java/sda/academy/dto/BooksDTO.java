package sda.academy.dto;

import sda.academy.entity.Author;

import java.util.HashSet;
import java.util.Set;

public class BooksDTO {

    private int id;
    private String title;
    private String genre;
    private Double prices;
    private Set<String> authorsName = new HashSet<>();

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

    public Set<String> getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(Set<String> authorsName) {
        this.authorsName = authorsName;
    }

    @Override
    public String toString() {
        return "BooksDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", prices=" + prices +
                ", authorsName=" + authorsName +
                '}';
    }
}
