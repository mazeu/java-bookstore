package model.entities;

public class Book {

    private String name;
    private String description;
    private double value;
    private String isbn;
    private Author author;

    public Book(Author author){
        this.author = author;
    }

    public void showDetails(){
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + value);
        System.out.println("ISBN: " + isbn);

        if(this.haveAuthor()){
            author.showDetails();
        }

        System.out.println("--");
    }

    public boolean applyDiscount(double percentage){
        if(percentage >0.3){
            return false;
        }
        this.value -= this.value * percentage;
        return true;
    }

    public boolean haveAuthor(){
        return this.author != null;
    }

    public void setValue(double value){
        this.value = value;
    }

    public double getValue(){
        return this.value;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
