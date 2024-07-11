package sda.academy.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "books")
public class Books {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(name = "title", nullable = false)
    private String title;

    @ManyToMany
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")

    )
    private Set<Author> author = new HashSet<>();

    // Getters and setters

    public int getId() {
        return id;
    }

    public int setId(int id) {
        return this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String setTitle(String title) {
        return this.title = title;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors=" + author +
                '}';
    }
}
