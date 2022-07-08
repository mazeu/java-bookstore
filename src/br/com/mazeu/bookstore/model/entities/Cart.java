package br.com.mazeu.bookstore.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private double total;
    private List<Product> products;

    public Cart(){
        this.products = new ArrayList<Product>();
    }

    public void addItem(Product product){

        this.products.add( product);
    }

    public void remove(int position){
        this.products.remove(position);
    }

    public double getTotal(){
        return total;
    }

    public List<Product> getProducts() {
        return products;
    }



}
