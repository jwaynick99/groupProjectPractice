package crew.chaptr.gorupProjectPractice.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    ArrayList<Book> favoriteBooks = new ArrayList<>();

    ArrayList<Book> toBeRead = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getFavoriteBooks() {
        return favoriteBooks;
    }

    public void setFavoriteBooks(ArrayList<Book> favoriteBooks) {
        this.favoriteBooks = favoriteBooks;
    }

    public ArrayList<Book> getToBeRead() {
        return toBeRead;
    }

    public void setToBeRead(ArrayList<Book> toBeRead) {
        this.toBeRead = toBeRead;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getId() == user.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
