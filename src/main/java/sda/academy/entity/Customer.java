package sda.academy.entity;

import jakarta.persistence.*;


import java.util.Set;

@Entity
@Table(name = "Customer")
public class Customer {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Adress", nullable = false)
    private String address;

    @Column(name = "Email", nullable = false, unique = true)
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer", orphanRemoval = true)
    private Set<Books> books;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Books> getBooks() {
        return books;
    }

    public void setBooks(Set<Books> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", books=" + books +
                '}';
    }
}
