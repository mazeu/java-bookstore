package model.entities;

public class Ebook extends Book implements Promotional{

    private String waterMark;

    public Ebook(Author author){
        super(author);
    }

    public void setWaterMark(String waterMark ){
        this.waterMark = waterMark;
    }

    public String getWaterMark(){
        return this.waterMark;
    }

    public boolean applyDiscount(double percentage){
        if(percentage > 0.15){
            return false;
        }
        double discount = this.value * percentage;
        this.setValue(this.getValue() - discount);

        System.out.println("aplicado desconto no Ebook");
        return true;
    }
}
