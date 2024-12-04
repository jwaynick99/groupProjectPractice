package crew.chaptr.gorupProjectPractice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Club {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String message;

    private String bookOfTheMonth;

    public Club(String name, String message, String bookOfTheMonth) {
        this.name = name;
        this.message = message;
        this.bookOfTheMonth = bookOfTheMonth;
    }

    public Club(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getBookOfTheMonth() {
        return bookOfTheMonth;
    }

    public void setBookOfTheMonth(String bookOfTheMonth) {
        this.bookOfTheMonth = bookOfTheMonth;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Club club = (Club) o;
        return id == club.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
