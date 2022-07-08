package br.com.mazeu.bookstore.model.entities;

public class Magazine implements Product, Promotional {
    private String name;
    private String description;
    private double value;
    private Publisher publisher;


    public boolean applyDiscount(double percentage){
        if(percentage > 0.1){
            return false;
        }

        double discount = getValue() * percentage;
        setValue(getValue() - discount);
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public int compareTo(Product other){
        if(this.getValue() < other.getValue()){
            return -1;
        }
        if(this.getValue() > other.getValue()){
            return 1;
        }
        return 0;
    }
}
