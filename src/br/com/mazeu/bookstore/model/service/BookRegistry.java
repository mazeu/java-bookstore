package br.com.mazeu.bookstore.model.service;

import br.com.mazeu.bookstore.model.entities.Author;
import br.com.mazeu.bookstore.model.entities.Book;
import br.com.mazeu.bookstore.model.entities.PhysicalBook;

public class BookRegistry {
    public static void main(String[] args) {

        Author author = new Author();
        author.setName("Marcio Mazeu");
        author.setEmail("marciomazeu@hotmail.com");
        author.setCpf("000.000.000-11");

        Book book = new PhysicalBook(author);
        book.setName("Java 8 Pratico");
        book.setDescription("Novos recursos da linguagem");
        book.setValue(59.9);
        book.setIsbn("978-85-66250-46-6");

        book.showDetails();





    }
}
