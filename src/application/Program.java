package application;


import model.entities.Book;

public class Program {

public static void main(String[] args){

    double livroJava8 = 59.9;
    double libroTDD = 159.9;

    double soma = 0;

    for(double i = 0; i < 35; i++){
        soma += 59.9;
    }

    System.out.println("O total em estoque é " + soma);

    if(soma < 150){
        System.out.println("O seu estoque esta muito baixo!");

    }else if(soma > 2000){
        System.out.println("Seu estoque esta muito alto!");
    }else{
        System.out.println("Seu estoque esta bom!");
    }

    Book book = new Book();
    book.name = "Java 8";

}

}
