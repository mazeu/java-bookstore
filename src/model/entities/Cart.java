package model.entities;

public class Cart {

    private double total;

    public void addItem(Book book){
        System.out.println("Adicionando: " + book);
        book.applyDiscount(0.16);
        total += book.getValue();
    }

    public double getTotal(){
        return total;
    }

}
