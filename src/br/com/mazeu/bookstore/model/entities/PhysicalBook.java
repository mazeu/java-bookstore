package br.com.mazeu.bookstore.model.entities;

public class PhysicalBook extends Book implements Promotional{

    public PhysicalBook(Author author) {
        super(author);
    }

    public double getPrintingFee(){
        return this.getValue() * 0.05;
    }

    @Override
    public boolean applyDiscount(double percentage) {
        if(percentage > 0.3){
            return false;
        }
        double discount = getValue() * percentage;
        setValue(getValue() - discount);
        System.out.println("aplicando desconto no LivroFisico");
        return true;
    }
}
