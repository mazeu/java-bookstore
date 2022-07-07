package br.com.mazeu.bookstore.model.entities;

import java.util.List;

public class Cart {

    private double total;
    private Product[] product = new Product[10];
    private int counter = 0;

    public void addItem(Product product){
        System.out.println("Adicionando: " + product);
        this.product[1] = product;
        counter ++;
        this.total += product.getValue();
    }

    public double getTotal(){
        return total;
    }



}
