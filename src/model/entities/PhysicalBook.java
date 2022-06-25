package model.entities;

public class PhysicalBook extends Book{

    public PhysicalBook(Author author) {
        super(author);
    }

    public double getPrintingFee(){
        return this.getValue() * 0.05;
    }
}
