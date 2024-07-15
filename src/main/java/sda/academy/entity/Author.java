package sda.academy.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "author")
public class Author {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column (name = "name", nullable = false)
    private String name;
    @Column (name = "language", nullable = false)
    private String language;
    @Column(name = "Genres", nullable = false)
    private String genres;
    @ManyToMany(mappedBy = "authorSet")
    private Set<Books> booksSet = new HashSet<>();
    public int getId() {
        return id;
    }

    public int setId(int id) {
        return this.id = id;
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

    public Set<Books> getBooksSet() {
        return booksSet;
    }

    public void setBooksSet(Set<Books> booksSet) {
        this.booksSet = booksSet;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", genres='" + genres + '\'' +
                ", books=" + booksSet +
                '}';
    }
}
