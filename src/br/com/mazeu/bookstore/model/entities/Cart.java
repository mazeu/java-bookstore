package br.com.mazeu.bookstore.model.entities;

public class Cart {

    private double total;

    public void addItem(Product product){
        System.out.println("Adicionando: " + product);
        total += product.getValue();
    }

    public double getTotal(){
        return total;
    }

}
