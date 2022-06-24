package model.service;

import model.entities.Book;

public class BookRegistry {
    public static void main(String[] args) {
        Book book = new Book();
        book.name = "Java 8 Pratico";
        book.description = "Novos recursos da linguagem";
        book.value = 59.90;
        book.isbn = "978-85-66250-46-6";

      book.showDetails();
        System.out.println("----------------------");

        Book outrobook = new Book();
        outrobook.name = "Logica de Programação";
        outrobook.description = "Crie seus primeiros programas";
        outrobook.value = 99.90;
        outrobook.isbn = "978-85-66250-22-0";

        outrobook.showDetails();
    }
}
