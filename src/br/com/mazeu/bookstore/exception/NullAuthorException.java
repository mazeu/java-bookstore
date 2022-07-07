package br.com.mazeu.bookstore.exception;

public class NullAuthorException extends RuntimeException {

    public NullAuthorException(String message){
        super(message);
    }
}
