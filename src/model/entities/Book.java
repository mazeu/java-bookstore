package model.entities;

public class Book {

    public String name;
    public String description;
    public double value;
    public String isbn;
    String authorName;
    String authorEmail;
    String authorCPF;

public void showDetails(){
    String mensagem = "Mostrando detalhes do livro";
    System.out.println("Name: " + name);
    System.out.println("Description: " + description);
    System.out.println("Price: " + value);
    System.out.println("ISBN: " + isbn);
    System.out.println("--");
}

}
