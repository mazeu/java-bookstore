package br.com.mazeu.bookstore.model.service;

import br.com.mazeu.bookstore.model.entities.Author;
import br.com.mazeu.bookstore.model.entities.Cart;
import br.com.mazeu.bookstore.model.entities.Ebook;
import br.com.mazeu.bookstore.model.entities.PhysicalBook;

public class SellRegistry {
    public static void main(String[] args){
        Author author = new Author();
        author.setName("Mauricio aniche");

        PhysicalBook physical = new PhysicalBook(author);
        physical.setName("Test-Driven Development");
        physical.setValue(59.90);

        Ebook ebook = new Ebook(author);
        ebook.setName("Test-Driven Development");
        ebook.setValue(29.9);

        if(physical.applyDiscount10()){
            System.out.println("Valor agora é: " + physical.getValue());
        }
        Cart cart = new Cart();

        cart.addItem(physical);
        cart.addItem(ebook);



        System.out.println("Total " + cart.getTotal());
    }
}
