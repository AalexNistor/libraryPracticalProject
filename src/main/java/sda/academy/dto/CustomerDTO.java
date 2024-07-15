package sda.academy.dto;

import sda.academy.entity.Books;

import java.util.Set;

public class CustomerDTO {

    private int id;
    private String name;
    private String address;
    private String email;
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

    public Set<BooksDTO> getBooksDTOSet() {
        return booksDTOSet;
    }

    public void setBooksDTOSet(Set<BooksDTO> booksDTOSet) {
        this.booksDTOSet = booksDTOSet;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", booksDTOSet=" + booksDTOSet +
                '}';
    }
}
