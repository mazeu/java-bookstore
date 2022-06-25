package model.service;

import model.entities.Author;
import model.entities.Ebook;
import model.entities.PhysicalBook;

public class SellRegistry {
    public static void main(String[] args){
        Author author = new Author();
        author.setName("Mauricio aniche");

        PhysicalBook physical = new PhysicalBook(author);
        physical.setName("Test-Driven Development");

        Ebook ebook = new Ebook(author);
        ebook.setName("Test-Driven Development");
    }
}
